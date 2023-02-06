USE pokemondb;
-- 1
SELECT nombre FROM pokemon;

-- 2
SELECT * FROM pokemon WHERE peso < '10';

-- 3 
SELECT * FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM pokemon_tipo WHERE id_tipo = (SELECT id_tipo FROM tipo WHERE nombre = 'Agua'));

-- 4
SELECT id_tipo, nombre FROM tipo WHERE nombre = 'Agua' OR nombre ='Fuego' OR nombre ='Tierra';

SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM (SELECT id_tipo, nombre FROM tipo WHERE nombre = 'Agua' OR nombre ='Fuego' OR nombre ='Tierra') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo;

SELECT p.*, t.nombre FROM pokemon p INNER JOIN 
(SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM (SELECT id_tipo, nombre FROM tipo WHERE nombre = 'Agua' OR nombre ='Fuego' OR nombre ='Tierra') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo) t ON p.numero_pokedex = t.numero_pokedex ORDER BY t.nombre ASC;

-- 5
-- tengo los de fuego
SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM ((SELECT id_tipo, nombre FROM tipo WHERE nombre ='Fuego') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo);
-- tengo los voladores
SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM ((SELECT id_tipo, nombre FROM tipo WHERE nombre ='Volador') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo);

SELECT t.numero_pokedex FROM 
(SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM ((SELECT id_tipo, nombre FROM tipo WHERE nombre ='Fuego') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo)) t INNER JOIN 
(SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM ((SELECT id_tipo, nombre FROM tipo WHERE nombre ='Volador') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo)) x
ON t.numero_pokedex = x.numero_pokedex;

-- final
SELECT * from pokemon WHERE numero_pokedex IN (SELECT t.numero_pokedex FROM 
(SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM ((SELECT id_tipo, nombre FROM tipo WHERE nombre ='Fuego') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo)) t INNER JOIN 
(SELECT pt.numero_pokedex, t.id_tipo, t.nombre FROM ((SELECT id_tipo, nombre FROM tipo WHERE nombre ='Volador') t INNER JOIN 
pokemon_tipo pt ON pt.id_tipo = t.id_tipo)) x
ON t.numero_pokedex = x.numero_pokedex);

-- 6
SELECT p.*, e.ps FROM pokemon p INNER JOIN ( SELECT numero_pokedex, ps from estadisticas_base WHERE ps > '200') e
ON p.numero_pokedex = e.numero_pokedex;

-- 7
SELECT * FROM pokemon WHERE numero_pokedex = (SELECT pokemon_origen FROM evoluciona_de WHERE pokemon_evolucionado = (SELECT numero_pokedex FROM pokemon WHERE nombre LIKE 'Arbok'));

-- 8
-- obtengo id de tipo evolucion tipo_evolucion luego con eso obtengo el id de forma de evolucion  forma_evolucion que me permite 
-- tener el pokemon_forma_evolucion numero_pokedex

SELECT * FROM pokemon WHERE numero_pokedex IN (
SELECT numero_pokedex FROM pokemon_forma_evolucion WHERE id_forma_evolucion = (
SELECT id_forma_evolucion FROM forma_evolucion WHERE tipo_evolucion = (
SELECT id_tipo_evolucion FROM tipo_evolucion WHERE tipo_evolucion = 'Intercambio')));

-- 9
SELECT nombre FROM movimiento ORDER BY prioridad DESC LIMIT 1;

-- 10 
SELECT * FROM pokemon ORDER BY peso DESC LIMIT 1;

-- 11

-- 12
SELECT COUNT(id_movimiento), id_tipo FROM movimiento GROUP BY id_tipo;

-- 13
SELECT * FROM movimiento WHERE descripcion LIKE "%envenenar%";

-- 14
SELECT * FROM movimiento WHERE descripcion LIKE "%causa daño%" ORDER BY nombre ASC;

-- 15
SELECT DISTINCTROW * FROM movimiento m INNER JOIN (
SELECT id_movimiento FROM pokemon_movimiento_forma WHERE numero_pokedex = (SELECT numero_pokedex FROM pokemon WHERE nombre LIKE "%pikachu%")
) p ON p.id_movimiento = m.id_movimiento;

-- 16
SELECT DISTINCTROW m.* FROM movimiento m INNER JOIN (
SELECT mov.id_movimiento FROM (SELECT id_movimiento, id_forma_aprendizaje FROM pokemon_movimiento_forma WHERE numero_pokedex = (SELECT numero_pokedex FROM pokemon WHERE nombre LIKE "%pikachu%")) mov INNER JOIN 
(SELECT id_forma_aprendizaje FROM forma_aprendizaje WHERE id_tipo_aprendizaje = (
SELECT id_tipo_aprendizaje FROM tipo_forma_aprendizaje WHERE tipo_aprendizaje = "MT")) fa ON mov.id_forma_aprendizaje = fa.id_forma_aprendizaje
) p ON p.id_movimiento = m.id_movimiento;

-- 17


