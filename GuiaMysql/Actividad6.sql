use superheroe;

-- A
SELECT * FROM personaje;
SELECT * FROM creador;

-- B
SELECT nombre_real FROM personaje;

-- C
SELECT nombre_real FROM personaje WHERE nombre_real LIKE 'B%';

