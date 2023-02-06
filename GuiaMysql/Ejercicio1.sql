USE personal; 



-- 1
SELECT * FROM empleado;

-- 2 
SELECT * FROM departamento;

-- 3
SELECT nombre_depto FROM departamento;

-- 4
SELECT nombre, salario FROM empleado;

-- 5
SELECT comision FROM empleado;

-- 6
SELECT * FROM empleado WHERE cargo = 'Secretaria';

-- 7
SELECT * FROM empleado WHERE cargo = 'Vendedor' ORDER BY nombre ASC;

-- 8
SELECT nombre, cargo FROM empleado ORDER BY salario ASC;

-- 9
SELECT nombre AS 'Nombre', cargo AS 'Cargo' FROM empleado;

-- 10
SELECT salario AS 'Salario Dpto 2000' , comision AS 'Comision Dpto 2000' FROM empleado WHERE id_depto = '2000' ORDER BY comision ASC;

-- 11

SELECT nombre, salario+comision+500 AS 'Total a Pagar' FROM empleado WHERE id_depto = '3000' order by nombre ASC;

-- 12
SELECT * FROM empleado WHERE nombre LIKE 'J%';

-- 13
SELECT nombre, salario, comision, salario+comision AS 'Salario Total' FROM empleado WHERE comision > '1000';

-- 14
SELECT nombre, salario, comision, salario+comision AS 'Salario Total' FROM empleado WHERE comision = '0';

-- 15
SELECT * FROM empleado WHERE comision > salario;

-- 16
SELECT * FROM empleado WHERE comision <= (salario*0.3);

-- 17
SELECT * FROM empleado WHERE nombre NOT LIKE '%MA%';

-- 18
SELECT nombre_depto FROM departamento WHERE nombre_depto = 'Ventas' OR nombre_depto = 'Investigacion' OR nombre_depto = 'Mantenimiento';

-- 19
SELECT nombre_depto FROM departamento WHERE nombre_depto != 'Ventas' AND nombre_depto != 'Investigacion' AND nombre_depto != 'Mantenimiento';

-- 20  VER COMO SE USA EL GROUP BY
SELECT MAX(salario) FROM empleado;

-- 21
SELECT nombre FROM empleado ORDER BY nombre DESC LIMIT 1;

-- 22
SELECT MAX(salario) FROM empleado;
SELECT MIN(salario) FROM empleado;

SELECT MAX(salario) - MIN(salario) AS 'Dif Max-Min Salario' FROM empleado;

-- 23
SELECT id_depto, ROUND(AVG(salario)) AS 'Salario Promedio' FROM empleado GROUP BY id_depto;

-- 24
SELECT id_depto, COUNT(nombre) AS 'Cant Empĺeados' FROM empleado GROUP BY id_depto HAVING COUNT(nombre) > 3;

-- 25    DUDASSSSS
SELECT cod_jefe ,COUNT(nombre) AS 'Cant_Empleados' FROM empleado GROUP BY cod_jefe HAVING COUNT(nombre) > 1 ;

Select e.nombre, c.cod_jefe, Cant_Empleados FROM (SELECT cod_jefe ,COUNT(nombre) AS 'Cant_Empleados' FROM empleado GROUP BY cod_jefe 
HAVING COUNT(nombre) > 1) c LEFT JOIN empleado e ON round(c.cod_jefe MOD 1000) = e.id_empleado ;


-- 26   DUDASSSS, el jefe se considera como empleado del departamento???
-- TUVE QUE INSERTAR UN DEPARTAMENTO PARA VERIFICAR QUE DA BIEN

SELECT nombre_depto as 'dEPARTAMENTO SIN eMPLEADOS' FROM departamento d LEFT JOIN empleado e ON e.id_depto = d.id_depto WHERE id_empleado is NULL;

-- 27
SELECT * FROM empleado e WHERE e.salario >= (SELECT AVG(salario) FROM empleado) ORDER BY id_depto;

