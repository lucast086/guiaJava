/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estancias;

import java.util.Date;

/**
 *
 * @author lucas
 */
public class Ej1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
    }
    
}

/* 
-- A  resuelta! en familia DAO directamente una consutla me devuelve una colelction de las familias filtradas
-- B  Resuelta! en casaDAO, una consulta filtra por el pais y fechas apsadas por paramtro.
-- C  resuelta! en familiaDAO devuelve una collection con las familias filtradas
-- D  resuleta! en casaDAO devuelve una collection de las casas filtradas



-- E  lista de clientes que tuvieron una estancia y  descripcion de la casa donde estuvieron
        * en estancia puedo devolver una lista de todas las estancias.
con ella en el servicio obtengo los id de clientes y los consulto a clienteDAO ( * que busca por id de cliente)
y con el id de casa en el servicio lo uso para buscar en comentarioDAO
        * en comentarioDAO me devuelve un comentario buscado por id_casa


-- TRABAJANDO!!!!!!!

-- F  Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
    ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
    la anterior:
LISTO   * una consulta debe devolverme un cliente especifico buscandolo por Id
LISTO   * una consulta que me devuelva una collection de estancias filtradas por el id de cliente
LISTO   * una consulta que me devuelva una casa filtradas por el id de casa.

        * luego en el servicio. yo pregunto el id del cliente y muestro la info del mismo
        ciclo mostrando la estancia al mismo tiempo que la info de la casa. asi hasta que no hayan mas items apra mostrar


-- G   Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
        precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
        actualizados.
       

        RESOLVER!!! en una UPDATE  en casaDAO pasando por parametro el pais y el porcentaje a actualizar.
            deberia de resolverlo en un metodo



-- H  Obtener el número de casas que existen para cada uno de los países diferentes.

        RESOLVER!!!  creo que la resolveria en CasaDAO creando un map donde la clave sea el pais y el valor sea la cantidad de casas.
            luego devuelvo ese map y lo trato en el service.


-- I   resuelta! en casaDAO una clase retorna una collection de casas



-- J   Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.

        RESOLVER!!! una consulta de INSERT en estanciaDAO pasando una estancia por parametro.
            debo verificar en casas las fechas que quiere y en estancia que esa casa no este ya alquilada.

*/