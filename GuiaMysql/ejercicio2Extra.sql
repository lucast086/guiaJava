use jardineria;

-- 1
SELECT codigo_oficina, ciudad FROM oficina;

-- 2
SELECT ciudad, telefono FROM oficina WHERE pais = 'España';

-- 3
SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = 7;

-- 4
SELECT nombre, apellido1, apellido2, puesto, email FROM empleado WHERE codigo_jefe IS null;

-- 5
SELECT nombre, apellido1, apellido2, puesto FROM empleado WHERE puesto != 'Ventas';

-- 6
SELECT nombre_cliente, pais FROM cliente WHERE pais = 'Spain';

-- 7
SELECT DISTINCT(estado) FROM pedido;

-- 8
SELECT DISTINCT(codigo_cliente), fecha_pago FROM pago WHERE YEAR(fecha_pago) = '2008'; 

SELECT DISTINCT(codigo_cliente) FROM pago WHERE DATE_FORMAT(fecha_pago, '%Y') = '2008'; 

SELECT DISTINCT(codigo_cliente) FROM pago WHERE fecha_pago LIKE '%2008%';

-- 9
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE estado = 'Entregado' AND (fecha_entrega > fecha_esperada);

-- 10
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE estado = 'Entregado' AND (fecha_entrega+1 < fecha_esperada);

-- 11
SELECT  * FROM pedido WHERE estado = 'Rechazado' AND fecha_esperada LIKE '%2009%';

-- 12
SELECT  * FROM pedido WHERE estado = 'Entregado' AND month(fecha_entrega) = '1';

-- 13
SELECT * FROM pago WHERE YEAR(fecha_pago) = '2008' AND forma_pago = 'Paypal' ORDER BY total DESC;

-- 14
SELECT DISTINCT(forma_pago) FROM pago;

-- 15
SELECT * FROM producto WHERE gama = 'Ornamentales' AND cantidad_en_stock > '100' ORDER BY precio_venta DESC;

-- 16
SELECT * FROM cliente WHERE ciudad = 'Madrid' AND (codigo_empleado_rep_ventas = 11 OR codigo_empleado_rep_ventas = 30);


-- CONSULTA MULTITABLA COMPOSICION INTERNA

-- 1
SELECT c.nombre_cliente AS 'Cliente', e.nombre, e.apellido1, e.apellido2 FROM cliente c INNER JOIN empleado e ON e.codigo_Empleado = c.codigo_empleado_rep_ventas;

-- 2
(SELECT DISTINCT(codigo_cliente) FROM pago);  -- aca elijo los clientes que hicieron pagos
SELECT * FROM cliente; -- aca veo cuantos clientes son en total

SELECT c.nombre_cliente AS 'Cliente', e.nombre AS 'REp Vena' FROM cliente c INNER JOIN empleado e ON e.codigo_Empleado = c.codigo_empleado_rep_ventas 
WHERE c.codigo_cliente IN (SELECT DISTINCT(codigo_cliente) FROM pago);

-- 3
SELECT c.nombre_cliente AS 'Cliente', e.nombre AS 'REp Vena' FROM cliente c INNER JOIN empleado e ON e.codigo_Empleado = c.codigo_empleado_rep_ventas 
WHERE c.codigo_cliente NOT IN (SELECT DISTINCT(codigo_cliente) FROM pago);

-- 4
SELECT c.nombre_cliente , e.nombre, e.codigo_oficina FROM cliente c INNER JOIN empleado e ON e.codigo_Empleado = c.codigo_empleado_rep_ventas 
WHERE c.codigo_cliente IN (SELECT DISTINCT(codigo_cliente) FROM pago);

SELECT x.nombre_cliente AS 'Cliente', x.nombre AS 'REp Venta', o.ciudad FROM oficina o INNER JOIN (SELECT c.nombre_cliente , e.nombre, e.codigo_oficina FROM cliente c INNER JOIN empleado e ON e.codigo_Empleado = c.codigo_empleado_rep_ventas 
WHERE c.codigo_cliente IN (SELECT DISTINCT(codigo_cliente) FROM pago)) x ON o.codigo_oficina = x.codigo_oficina;

-- 5
SELECT x.nombre_cliente AS 'Cliente', x.nombre AS 'REp Venta', o.ciudad FROM oficina o INNER JOIN (SELECT c.nombre_cliente , e.nombre, e.codigo_oficina FROM cliente c INNER JOIN empleado e ON e.codigo_Empleado = c.codigo_empleado_rep_ventas 
WHERE c.codigo_cliente NOT IN (SELECT DISTINCT(codigo_cliente) FROM pago)) x ON o.codigo_oficina = x.codigo_oficina;

-- 6
-- obtener clientes de fuenlabrada, de ahi cruzo la informacion con clav e codigo de vendedores para obtener el codigo de oficina de esos clientes
-- luego cruzo esos codigos de oficina con la tabla oficina y asi obtengo direcciones.

SELECT linea_direccion1, linea_direccion2 FROM oficina WHERE codigo_oficina IN (
	SELECT DISTINCT(e.codigo_oficina) FROM cliente c INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE c.ciudad = 'Fuenlabrada'
);

-- 7
SELECT e.codigo_empleado, e.nombre, o.ciudad FROM empleado e INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina;

SELECT c.nombre_cliente AS 'Nombre cliente', x.nombre AS 'Nombre representate', x.ciudad AS 'ciudad de oficina' FROM cliente c INNER JOIN ( 
	SELECT e.codigo_empleado, e.nombre, o.ciudad FROM empleado e INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina ) x 
    ON x.codigo_empleado = c.codigo_empleado_rep_ventas;

-- 8
SELECT e.nombre AS 'Empleado' , x.nombre AS 'Jefe' FROM empleado e INNER JOIN empleado x ON e.codigo_jefe = x.codigo_empleado;

-- 9
SELECT c.nombre_cliente FROM cliente c INNER JOIN pedido p ON c.codigo_cliente = p.codigo_cliente WHERE p.fecha_entrega > p.fecha_esperada;

-- 10
SELECT p.codigo_cliente , dp.codigo_producto FROM pedido p INNER JOIN detalle_pedido dp ON p.codigo_pedido = dp.codigo_pedido;

SELECT DISTINCT(x.codigo_cliente) , p.gama FROM producto p INNER JOIN (
	SELECT p.codigo_cliente , dp.codigo_producto FROM pedido p INNER JOIN detalle_pedido dp ON p.codigo_pedido = dp.codigo_pedido 
    ) x ON p.codigo_producto = x.codigo_producto ORDER BY x.codigo_cliente ASC;


-- CONSULTAS MULTITABLA (composicion externa)

-- 1

SELECT DISTINCT(codigo_cliente) FROM pago; -- cantidad que hizo un pago
SELECT * FROM cliente;

SELECT DISTINCTROW c.* FROM cliente c LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente WHERE p.id_transaccion IS NULL; 


-- 2
SELECT DISTINCTROW c.* FROM pedido p RIGHT JOIN cliente c ON p.codigo_cliente = c.codigo_cliente WHERE p.codigo_pedido IS NULL;

-- 3

SELECT * FROM ( SELECT DISTINCTROW c.* FROM cliente c LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente WHERE p.id_transaccion IS NULL ) x JOIN 
( SELECT DISTINCTROW c.* FROM pedido p RIGHT JOIN cliente c ON p.codigo_cliente = c.codigo_cliente WHERE p.codigo_pedido IS NULL ) y 
ON x.codigo_cliente = y.codigo_cliente;

-- 4
SELECT * FROM empleado WHERE codigo_oficina IS NULL;  --   TENGO DUDAS SOBRE ESTE EJERCICIO, NO INTERPRETO BIEN LA CONSIGNA

-- 5
SELECT e.* FROM empleado e LEFT JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE c.codigo_cliente IS NULL;

-- 6
SELECT * FROM (SELECT e.* FROM empleado e LEFT JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE c.codigo_cliente IS NULL) x JOIN
	( SELECT * FROM empleado WHERE codigo_oficina IS NULL ) y ON y.codigo_empleado = x.codigo_empleado;

-- 7

-- obtengo todos los productos que fueron pedidos alguna vez
SELECT * FROM producto;
SELECT DISTINCT(dp.codigo_producto) FROM detalle_pedido dp JOIN pedido p ON p.codigo_pedido = dp.codigo_pedido;

SELECT * FROM producto p LEFT OUTER JOIN (SELECT DISTINCT(dp.codigo_producto) FROM detalle_pedido dp JOIN pedido p ON p.codigo_pedido = dp.codigo_pedido) x 
ON x.codigo_producto = p.codigo_producto WHERE x.codigo_producto IS null;

-- 8
-- Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
-- representantes de ventas de algún cliente que haya realizado la compra de algún producto
-- de la gama Frutales.

-- productos de la gama frutales
SELECT codigo_producto FROM producto WHERE gama = 'Frutales';

-- detalles de pedido con productos que son de gama frutales
SELECT DISTINCT(codigo_pedido) FROM detalle_pedido dp LEFT JOIN producto p ON dp.codigo_producto = p.codigo_producto WHERE p.gama = 'Frutales';

-- comparo con los pedido y obtengo codigo de clientes que compraron productos frutales 
SELECT DISTINCT(p.codigo_cliente) FROM pedido p LEFT JOIN ( 
SELECT DISTINCT(codigo_pedido) FROM detalle_pedido dp LEFT JOIN producto p ON dp.codigo_producto = p.codigo_producto WHERE p.gama = 'Frutales' ) y 
ON p.codigo_pedido = y.codigo_pedido;

-- obtengo los vendedores de esos clientes
-- OBTENGO los codigos de oficina de los vendedores de los clientes
SELECT c.codigo_cliente, e.codigo_oficina FROM cliente c LEFT JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado;
-- obtengo las oficinas a las que pertenecen esos vendedores de los clientes que compraron productos frutales.

-- comparo con el total de oficinas y obtengo la diferencia (las oficinas que NO tienen vendedores que esten asociados a clientes que hayan comprado productos Frutales
SELECT DISTINCT(x.codigo_oficina) FROM ( SELECT c.codigo_cliente, e.codigo_oficina FROM cliente c LEFT JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado ) x
LEFT OUTER JOIN ( SELECT DISTINCT(p.codigo_cliente) FROM pedido p LEFT JOIN ( 
SELECT DISTINCT(codigo_pedido) FROM detalle_pedido dp LEFT JOIN producto p ON dp.codigo_producto = p.codigo_producto WHERE p.gama = 'Frutales' ) y 
ON p.codigo_pedido = y.codigo_pedido ) y ON x.codigo_cliente = y.codigo_cliente WHERE y.codigo_cliente IS null;

-- 9
SELECT DISTINCT(p.codigo_cliente) FROM pedido p LEFT JOIN pago a ON a.codigo_cliente = p.codigo_cliente WHERE a.codigo_cliente IS NOT null;

-- 10
-- Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.
SELECT * FROM empleado e LEFT JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE c.codigo_cliente IS NULL;

SELECT e.* , x.nombre AS 'Jefe' FROM ( 
	SELECT e.* FROM empleado e LEFT JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE c.codigo_cliente IS NULL ) e 
	INNER JOIN empleado x ON e.codigo_jefe = x.codigo_empleado;

-- CONSULTAS RESUMEN
-- 1
SELECT COUNT(codigo_empleado) AS 'Cantidad de empleados' FROM empleado;

-- 2
SELECT COUNT(codigo_cliente) AS 'cantidad de clientes', pais FROM cliente GROUP BY pais;

-- 3
SELECT AVG(total) FROM pago WHERE YEAR(fecha_pago) = '2009';

-- 4
SELECT COUNT(codigo_pedido), estado FROM pedido GROUP BY estado ORDER BY COUNT(codigo_pedido) DESC; 

-- 5
SELECT MAX(precio_venta) , MIN(precio_venta) FROM producto;

-- 6
SELECT COUNT(codigo_cliente) AS 'cantidad de clientes' FROM cliente;

-- 7
SELECT COUNT(codigo_cliente) AS 'cantidad de clientes', ciudad FROM cliente WHERE ciudad = 'Madrid';

-- 8
SELECT COUNT(codigo_cliente) AS 'cantidad de clientes', ciudad FROM cliente WHERE ciudad LIKE 'M%' GROUP BY ciudad;

-- 9
SELECT COUNT(codigo_cliente) 'CANT CLIENTE', codigo_empleado_rep_ventas FROM cliente GROUP BY codigo_empleado_rep_ventas;

SELECT e.nombre, x.cc AS 'Cant Clientes' FROM empleado e INNER JOIN ( 
SELECT COUNT(codigo_cliente) cc, codigo_empleado_rep_ventas FROM cliente GROUP BY codigo_empleado_rep_ventas ) x ON x.codigo_empleado_rep_ventas = e.codigo_empleado;

-- 10
SELECT COUNT(codigo_cliente) FROM cliente WHERE codigo_empleado_rep_ventas IS null;

-- 11
SELECT MIN(fecha_pago), MAX(fecha_pago), codigo_cliente FROM pago GROUP BY codigo_cliente;

SELECT c.nombre_cliente, x.mi AS 'Primer fecha de pago', x.ma AS 'Ultima fecha de pago' FROM cliente c LEFT JOIN ( 
SELECT MIN(fecha_pago) mi, MAX(fecha_pago) ma, codigo_cliente FROM pago GROUP BY codigo_cliente) x ON c.codigo_cliente = x.codigo_cliente;

-- 12
SELECT COUNT(codigo_producto), codigo_pedido FROM detalle_pedido GROUP BY codigo_pedido;

-- 13
SELECT SUM(cantidad), codigo_pedido FROM detalle_pedido GROUP BY codigo_pedido;

-- 14
SELECT SUM(cantidad), codigo_producto FROM detalle_pedido GROUP BY codigo_producto ORDER BY SUM(cantidad) DESC LIMIT 20;

-- 15
-- La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el
-- IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el
-- número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
-- imponible, y el total la suma de los dos campos anteriores.

SELECT SUM(cantidad), codigo_producto FROM detalle_pedido GROUP BY codigo_producto;

SELECT x.pp AS 'Producto', (precio_venta * x.cc) AS 'base Imponible', (precio_venta * x.cc)*0.21  AS 'IVA', (precio_venta * x.cc)+((precio_venta * x.cc)*0.21) AS 'Total'
	FROM producto p JOIN ( SELECT SUM(cantidad) cc, codigo_producto pp FROM detalle_pedido GROUP BY codigo_producto ) x 
	ON x.pp = p.codigo_producto;

-- 16
SELECT x.pp AS 'Producto', (precio_venta * x.cc) AS 'base Imponible', (precio_venta * x.cc)*0.21  AS 'IVA', (precio_venta * x.cc)+((precio_venta * x.cc)*0.21) AS 'Total'
	FROM producto p JOIN ( SELECT SUM(cantidad) cc, codigo_producto pp FROM detalle_pedido GROUP BY codigo_producto ) x 
	ON x.pp = p.codigo_producto;





-- subconsultas con operadores basicos de comparacion
-- 1
SELECT nombre_cliente FROM cliente ORDER BY limite_credito DESC LIMIT 1;

-- 2
SELECT nombre FROM producto WHERE precio_venta = (SELECT MAX(precio_venta) FROM producto);

-- 3
SELECT SUM(cantidad), codigo_producto FROM detalle_pedido GROUP BY codigo_producto ORDER BY SUM(cantidad) DESC limit 1 ;

SELECT nombre FROM producto WHERE codigo_producto = ( SELECT codigo_producto FROM detalle_pedido GROUP BY codigo_producto ORDER BY SUM(cantidad) DESC limit 1 );

-- 4 
SELECT C.codigo_cliente, C.nombre_cliente, C.limite_credito, SUM(P.total) FROM cliente C, pago P where C.codigo_cliente = P.codigo_cliente GROUP BY C.codigo_cliente HAVING  C.limite_credito > SUM(P.total)  ;

-- 5
SELECT codigo_producto FROM producto ORDER BY cantidad_en_stock DESC LIMIT 1;

-- 6
SELECT codigo_producto FROM producto ORDER BY cantidad_en_stock ASC LIMIT 1;

-- 7
SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = (SELECT codigo_empleado FROM empleado WHERE nombre = 'Alberto' AND apellido1 = 'Soria');

-- subconsultas con all y any
-- 1
SELECT nombre_cliente FROM cliente WHERE limite_credito >= ALL (SELECT limite_credito FROM cliente);

-- 2
SELECT nombre FROM producto WHERE precio_venta >= ALL (SELECT precio_venta FROM producto);

-- 3
SELECT nombre, precio_venta FROM producto WHERE precio_venta <= ALL (SELECT precio_venta FROM producto);

-- SUBCONSULTAS CON IN Y NOT IN

-- 1
SELECT nombre, apellido1, puesto FROM empleado WHERE codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente);

-- 2
SELECT * FROM cliente WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- 3
SELECT * FROM cliente WHERE codigo_cliente IN (SELECT codigo_cliente FROM pago);

-- 4
SELECT * FROM producto WHERE codigo_producto NOT IN (SELECT DISTINCT(codigo_producto) FROM detalle_pedido);

-- 5
SELECT e.nombre, e.apellido1, e.apellido2, e.puesto, o.telefono FROM empleado e, oficina o WHERE codigo_empleado NOT IN 
(SELECT DISTINCT(codigo_empleado_rep_ventas) FROM cliente) AND o.codigo_oficina = e.codigo_oficina;

-- subconsultas con exists y not exists
-- 1
SELECT * FROM cliente c WHERE NOT EXISTS (SELECT codigo_cliente FROM pago P WHERE P.codigo_cliente = c.codigo_cliente);

-- 2
SELECT * FROM cliente c WHERE EXISTS (SELECT codigo_cliente FROM pago P WHERE P.codigo_cliente = c.codigo_cliente);

-- 3
SELECT * FROM producto p WHERE NOT EXISTS (SELECT codigo_producto FROM detalle_pedido dp WHERE dp.codigo_producto = p.codigo_producto);

-- 4
SELECT * FROM producto p WHERE EXISTS (SELECT codigo_producto FROM detalle_pedido dp WHERE dp.codigo_producto = p.codigo_producto);
