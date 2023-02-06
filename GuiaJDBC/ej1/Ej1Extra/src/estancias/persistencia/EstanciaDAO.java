/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Estancia;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lucas
 */
public class EstanciaDAO extends DAO{

    public EstanciaDAO() {
    }
    
    // * una consulta que me devuelva una collection de estancias filtradas por el id de cliente
    public Collection<Estancia> listarEstancias(int id_cliente) throws Exception {
        try {
            String sql = "SELECT * FROM estancias WHERE id_cliente = '"+id_cliente+"';";
            consultar(sql);
            
            Estancia estancia = null;
            Collection<Estancia> estanciaCollection = new ArrayList();
            
            while (resultado.next()){
                estancia = new Estancia();
                estancia.setId_estancia(resultado.getInt(1));
                estancia.setId_cliente(resultado.getInt(2));
                estancia.setId_casa(resultado.getInt(3));
                estancia.setNombre_huesped(resultado.getString(4));
                estancia.setFecha_desde(resultado.getDate(5));
                estancia.setFecha_hasta(resultado.getDate(6));
                                
                estanciaCollection.add(estancia);
            }            
            
            return estanciaCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
}


// listar estancias

// (F) estancias reservadas por un cliente , LEER BIEN

/*hago una nota aca pero deberia de estar en un servicio

la idea es tener una consulta de cliente por id,
y luego una lista de estancias que visito ese cliente o sea filtrada por cliente.
*/

// (J) insercion de datos verificando la disponibilidad de las fechas