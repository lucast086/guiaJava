use tienda;

-- 1
SELECT nombre from producto;

-- 2
SELECT nombre, precio FROM producto;

-- 3
SELECT * from producto;

-- 4
SELECT nombre, round(precio) AS 'Precio' FROM producto;

-- 5
SELECT codigo_fabricante FROM producto;

-- 6  DISTINCT me permite eliminar duplicados
SELECT DISTINCT codigo_fabricante FROM producto ;

-- 7
SELECT nombre FROM fabricante ORDER BY nombre ASC;

-- 8
SELECT nombre FROM producto ORDER BY nombre ASC, precio DESC;

-- 9
SELECT * FROM fabricante LIMIT 5;

-- 10
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;

-- 11
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;

-- 12
SELECT nombre FROM producto WHERE precio <= 20;

-- 13
SELECT * FROM producto WHERE precio BETWEEN 60 AND 200;

-- 14
SELECT * FROM producto WHERE codigo_fabricante IN (1,3,5); 

-- 15
select nombre FROM producto WHERE nombre LIKE '%Portatil%';

-- CONSULTAS MULTITABLA

-- 1
SELECT p.codigo AS 'Codigo de Producto', p.nombre AS 'Nombre del Producto', f.codigo AS 'Codigo de Fabricante',
f.nombre AS 'Nombre de Fabricante' FROM producto p JOIN fabricante f ON p.codigo_fabricante = f.codigo ;

-- 2
SELECT p.nombre AS 'Nombre del Producto', p.precio AS 'Precio',
f.nombre AS 'Nombre de Fabricante' FROM producto p JOIN fabricante f ON p.codigo_fabricante = f.codigo  ORDER BY f.nombre ASC;

-- 3
SELECT p.nombre AS 'Nombre del Producto', p.precio AS 'Precio',
f.nombre AS 'Nombre de Fabricante' FROM producto p JOIN fabricante f ON p.codigo_fabricante = f.codigo  ORDER BY f.nombre ASC LIMIT 1;

-- 4
SELECT p.codigo, p.nombre, p.precio, f.nombre FROM producto p JOIN fabricante f ON 
p.codigo_fabricante = f.codigo WHERE f.nombre LIKE '%Lenovo%';

-- 5
SELECT p.codigo, p.nombre, p.precio, f.nombre FROM producto p JOIN fabricante f ON 
p.codigo_fabricante = f.codigo WHERE f.nombre LIKE '%Crucial%' AND precio > 200;

-- 6
SELECT p.codigo, p.nombre, p.precio, f.nombre FROM producto p JOIN fabricante f ON 
p.codigo_fabricante = f.codigo WHERE f.nombre IN ('Asus','Hewlett-Packard');

-- 7
SELECT p.codigo, p.nombre, p.precio, f.nombre FROM producto p JOIN fabricante f ON 
p.codigo_fabricante = f.codigo WHERE precio > '180' ORDER BY p.precio DESC, p.nombre ASC;


-- MULTITABLA LEFT Y RIGHT JOIN
-- 1
SELECT * FROM producto p RIGHT JOIN fabricante f ON p.codigo_fabricante = f.codigo; 

-- 2
SELECT f.codigo, f.nombre FROM producto p RIGHT JOIN fabricante f ON p.codigo_fabricante = f.codigo WHERE p.codigo IS null; 


-- SUBCONSULTAS WHERE

-- 1
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo');

-- 2 se inserta un producto con el mismo precio para verificar que funciona
INSERT INTO producto VALUES (0,'producto prueba', 559, 3);

SELECT * FROM producto WHERE precio = (
	SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (
		SELECT codigo FROM fabricante WHERE nombre = 'Lenovo'
        )
	);

-- 3
SELECT nombre FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo')
	ORDER BY precio DESC LIMIT 1;

-- 4
SELECT * FROM producto WHERE precio > (
	SELECT AVG(precio) FROM producto WHERE codigo_fabricante = (
		SELECT codigo FROM fabricante WHERE nombre = 'Asus'
        )
	) AND codigo_fabricante = ( SELECT codigo FROM fabricante WHERE nombre = 'Asus');
    
    -- subconsultas con in    not in
-- 1
SELECT nombre FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto);

-- 2
SELECT nombre FROM fabricante WHERE codigo NOT IN (SELECT codigo_fabricante FROM producto);

-- subconsultas en la clausula having

-- 1
SELECT f.nombre AS 'Fabricante', COUNT(f.codigo) AS 'Cant Productos' FROM producto p INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo GROUP BY p.codigo_fabricante HAVING COUNT(p.codigo) = (
    SELECT COUNT(codigo) AS 'cant producto' FROM producto WHERE codigo_fabricante  = ( 
		SELECT codigo FROM fabricante WHERE nombre = 'Lenovo'
	)
);




