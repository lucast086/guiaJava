USE nba;
SELECT * FROM jugador ORDER BY nombre ASC;
-- 1
SELECT nombre FROM jugador ORDER BY nombre ASC;

-- 2
SELECT nombre FROM jugador WHERE posicion ='C' AND peso >200 ORDER BY nombre ASC;

-- 3
SELECT nombre FROM equipo ORDER BY nombre ASC;

-- 4
SELECT nombre FROM equipo WHERE conferencia = 'East';

-- 5
SELECT * FROM equipo WHERE ciudad LIKE 'C%' order by nombre ASC;

-- 6
SELECT * FROM jugador j JOIN equipo e ON j.nombre_equipo = e.nombre ORDER BY e.nombre ASC;

-- 7
SELECT * FROM jugador WHERE nombre_equipo = 'Raptors' ORDER BY nombre ASC;

-- 8
SELECT Puntos_por_partido FROM estadistica WHERE jugador = (SELECT codigo FROM jugador WHERE nombre = 'Pau Gasol');

-- 9
SELECT Puntos_por_partido FROM estadistica WHERE temporada = '04/05' AND jugador = (SELECT codigo FROM jugador WHERE nombre = 'Pau Gasol');

-- 10
SELECT jugador, round(SUM(Puntos_por_partido)) AS 'Puntos en su carrera' FROM estadistica GROUP BY jugador; -- ESTO ES PARA VERIFICAR LA 12 ORDER BY round(SUM(Puntos_por_partido)) DESC;

-- 11
SELECT SUM(codigo) AS 'cantidad de jugadores', nombre_equipo FROM jugador GROUP BY nombre_equipo;

-- 12
-- tambien podria ordenar la consulta 10 de mayor a menor y limitar a 1
SELECT MAX(T) FROM (SELECT round(SUM(Puntos_por_partido)) T FROM estadistica GROUP BY jugador) F; 

-- 13
 SELECT nombre, conferencia, division FROM equipo WHERE nombre = 
	(SELECT nombre_equipo FROM jugador ORDER BY altura DESC LIMIT 1);

-- 14

-- me quedo con los equipos de la division pacific
SELECT * FROM equipo WHERE division = 'Pacific';

-- me quedo con el codigo y nombre de equipo, de esos equipos.
select j.codigo, j.nombre_equipo FROM jugador j INNER JOIN (SELECT * FROM equipo WHERE division = 'Pacific') x ON j.nombre_equipo = x.nombre;

-- hago la consulta final, sacando promedio de puntos de todos los jugadores agrupando por equipo.
SELECT AVG(e.puntos_por_partido), h.nombre_equipo FROM estadistica e INNER JOIN (
	select j.codigo, j.nombre_equipo FROM jugador j INNER JOIN ( 
		SELECT * FROM equipo WHERE division = 'Pacific'
	) x ON j.nombre_equipo = x.nombre
) h ON e.jugador = h.codigo GROUP BY h.nombre_equipo;

-- 15
-- calculo la diferencia maxima
SELECT MAX(abs(puntos_local - puntos_visitante)) FROM partido;

SELECT equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) AS 'Diferencia' FROM  partido
WHERE  abs(puntos_local - puntos_visitante) = (SELECT MAX(abs(puntos_local - puntos_visitante)) FROM partido);

-- 16 EJERCICIO REPETIDO

-- 17  NO TERMINE DE ENTENDER LA CONSIGNA
SELECT * FROM partido;

-- 18
SELECT codigo, equipo_local, puntos_local, equipo_visitante, puntos_visitante, (case 
	when puntos_local > puntos_visitante then equipo_local
	when puntos_visitante > puntos_local then equipo_visitante 
	else null 
	end) AS ganador FROM partido;



