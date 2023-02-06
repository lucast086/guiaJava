/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Casa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class CasaDAO extends DAO {

    public CasaDAO() {
    }
    
    public void cargar(Casa casa) throws Exception {
        try {
            if (casa == null) {
                throw new Exception("casa nula");
            }
            String sql = "INSERT INTO casas "
                    + "(calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, "
                    + "tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda) "
                    + "VALUES ( '"+casa.getCalle()+"' , '"+casa.getNumero()+"' , '"+casa.getCodigo_postal()
                    + "' , '"+casa.getCiudad()+"' , '"+ casa.getPais()+"' , '"+casa.getFecha_desde()+"' , '"
                    +casa.getFecha_hasta()+"' , '"+casa.getTiempo_minimo()+"' , '"+casa.getTiempo_maximo()
                    +"' , '"+casa.getPrecio_habitacion()+"' , '"+casa.getTipo_vivienda()+"');";
            
                    
            crud(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public void modificar(Casa casa) throws Exception {
        try {
            if (casa == null) {
                throw new Exception("casa nula");
            }
            String sql = "UPDATE casas SET "
                    + "calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, "
                    + "tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda) "
                    + "calle = "+casa.getCalle()+", numero = "+casa.getNumero()+", codigo_postal = "+casa.getCodigo_postal()
                    + ", ciudad = "+casa.getCiudad()+",pais = "+ casa.getPais()+",fecha_desde = "+casa.getFecha_desde()+", fecha_hasta = "
                    +casa.getFecha_hasta()+", tiempo_minimo = "+casa.getTiempo_minimo()+",tiempo_maximo = "+casa.getTiempo_maximo()
                    +",precio_habitacion = "+casa.getPrecio_habitacion()+",tipo_vivienda = "+casa.getTipo_vivienda()+" WHERE id_casa = "+casa.getId_casa()+" ;";
                    
            crud(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }

    
    public void eliminar(Casa casa) throws Exception {
        try {
            if (casa == null) throw new Exception("casa nula");
            
        String sql = "DELETE FROM casas WHERE id_casa = '" + casa.getId_casa() + "' ;" ;
            
            crud(sql);
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public Casa consulta(int id_casa) throws Exception {
        try {
            String sql = "SELECT * FROM casas WHERE id_casa = '"+id_casa+"';";
            consultar(sql);
            
            Casa casa = null;
        
            
            while (resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
   
            }            
            
            return casa;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
    // listar casas *
    public Collection<Casa> listar() throws Exception {
        try {
            String sql = "SELECT * FROM casas;";
            consultar(sql);
            
            Casa casa = null;
            Collection<Casa> casaCollection = new ArrayList();
            
            while (resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                                
                casaCollection.add(casa);
            }            
            
            return casaCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
    
    private String DateFormater(Date d) {
          return d.getYear()+"-"+d.getMonth()+"-"+d.getDay();
      }
    
    
    // (B) listar casas que se filtren por un rango de fechas para saber si estan disponibles en ese rango. en un cierto pais
    
    /* para ver si estan disponibles tendria que buscar 
    que la casa tenga periodo de alquiler en ese rango y luego que
    que la fecha hasta, sea menor que la fecha desde de la tabla estancia.
    que la fecha desde, sea mayor que la fecha hasta de la tabla estancia.
    */
    public Collection<Casa> listarXfechasYpais(String pais, Date fechaInicial, Date fechaFinal) throws Exception {
        try {
           // String sql = "SELECT * FROM casas WHERE pais = '"+pais+"' AND '"+ DateFormater(fechaInicial) +"' >= fecha_desde AND fecha_hasta >= '"+ DateFormater(fechaFinal) +"' ;";
            String sql =  "SELECT * FROM casas WHERE pais = '"+pais+"' AND '"+ DateFormater(fechaInicial) +"' >= fecha_desde AND fecha_hasta >= '"+ DateFormater(fechaFinal) + 
                    "' AND id_casa IN ( SELECT id_casa FROM estancias WHERE (NOT(' " + DateFormater(fechaFinal) +
                    "' BETWEEN fecha_desde AND fecha_hasta) OR NOT('" + DateFormater(fechaInicial) + " BETWEEN fecha_desde AND fecha_hasta)));";
            
            consultar(sql);
            
            Casa casa = null;
            Collection<Casa> casaCollection = new ArrayList();
            
            while (resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                                
                casaCollection.add(casa);
            }            
            
            return casaCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
    
    private Date sumarDiasAFecha(Date fecha, int dias){
      if (dias==0) return fecha;
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(fecha); 
      calendar.add(Calendar.DAY_OF_YEAR, dias);  
      return calendar.getTime(); 
}
    
    // (D) casa disponible a partir de una fecha dada y un numero de dias. 
    public Collection<Casa> listarXfechasYdias(String pais, Date fechaInicial, int dias) throws Exception {
        try {
            Date fechaFinal = sumarDiasAFecha(fechaInicial,dias);
            
            String sql =  "SELECT * FROM casas WHERE '"+ DateFormater(fechaInicial) +"' >= fecha_desde AND fecha_hasta >= '"+ DateFormater(fechaFinal) + 
                    "' AND id_casa IN ( SELECT id_casa FROM estancias WHERE (NOT(' " + DateFormater(fechaFinal) +
                    "' BETWEEN fecha_desde AND fecha_hasta) OR NOT('" + DateFormater(fechaInicial) + " BETWEEN fecha_desde AND fecha_hasta)));";
            
            
            consultar(sql);
            
            Casa casa = null;
            Collection<Casa> casaCollection = new ArrayList();
            
            while (resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                                
                casaCollection.add(casa);
            }            
            
            return casaCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
    
    // (H) el numero de casas disponibles para cada pais
    
// aca tengo que ver una estructura de datos apra almacenar, se me ocurre un mapa donde la clave es el pais y el valor es la cantidad de casas

    
    // (I) listar casas por pais, y por una frase en sus comentarios
    public Collection<Casa> listarXpaisYcoment(String coment, String pais) throws Exception {
        try {
            String sql = "SELECT DISTINCT ca.* FROM casas ca INNER JOIN " +
        "  (SELECT id_casa FROM comentarios WHERE comentario LIKE '% "+ coment +"%') co ON ca.id_casa = co.id_casa" +
        "  WHERE pais = '" + pais +"';";
            consultar(sql);
            
            Casa casa = null;
            Collection<Casa> casaCollection = new ArrayList();
            
            while (resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                                
                casaCollection.add(casa);
            }            
            
            return casaCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
    
    // (G) actualizar el precio de todas las casas en un porcentaje, segun el pais.
    // FALTA DE HACERRRRRRRRRRRRRRRRRRRRRRRRRRR
}
