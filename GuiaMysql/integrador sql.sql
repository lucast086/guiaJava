use nba;

-- CANDADO A

-- posicion  2
SELECT COUNT(jugador) as 'posicion candado A' FROM estadistica WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadistica);

-- clave
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
-- centro o esté comprendida en otras posiciones.
SELECT SUM(peso) as 'clave candado A' FROM jugador WHERE posicion LIKE '%C%' AND nombre_equipo IN (SELECT nombre FROM equipo WHERE conferencia = 'East');

SELECT SUM(j.peso) FROM (SELECT peso, nombre_equipo FROM jugador WHERE posicion LIKE '%C%') j INNER JOIN (
SELECT nombre FROM equipo WHERE conferencia = 'East') e ON e.nombre = j.nombre_equipo;

-- CANDADO B 
-- posicion 3
SELECT COUNT(jugador) as 'posicion candado B' FROM estadistica WHERE Asistencias_por_partido > (
SELECT COUNT(codigo) FROM jugador WHERE nombre_equipo = 'Heat'); 

-- clave  3480
SELECT COUNT(codigo) as 'clave Candado B' FROM partido WHERE temporada LIKE "%99%";


-- CANDADO C
-- posicion 1

SELECT COUNT(x.nombre_equipo)  / (SELECT COUNT(codigo) FROM jugador WHERE peso > '195') + 0.9945 as 'posicion Candado C' FROM (
SELECT nombre_equipo FROM jugador WHERE procedencia = 'Michigan') x INNER JOIN (
SELECT nombre FROM equipo WHERE conferencia = 'west') e ON e.nombre = x.nombre_equipo;

-- clave
SELECT ROUND(AVG(e.Puntos_por_partido) + COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)) as 'clave candado C' FROM estadistica e INNER JOIN (
SELECT j.codigo FROM (
SELECT codigo, nombre_equipo FROM jugador) j INNER JOIN (
SELECT nombre FROM equipo WHERE division = 'Central') e ON e.nombre = j.nombre_equipo) x 
ON x.codigo = e.jugador;

-- CANDADO D
-- posicion
SELECT ROUND(Tapones_por_partido) as 'posicion candado D'  FROM estadistica WHERE jugador = (SELECT codigo FROM jugador WHERE nombre = 'Corey Maggette') AND temporada = '00/01';

-- clave
SELECT ROUND(SUM(e.Puntos_por_partido)) as 'clave candado D' FROM estadistica e INNER JOIN (SELECT codigo FROM jugador WHERE procedencia = 'Argentina') j ON j.codigo = e.jugador;