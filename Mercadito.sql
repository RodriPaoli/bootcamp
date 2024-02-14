select * from factura;

--Consulta N1
select cliente_id , count (*)
from factura
group by cliente_id
order by count desc;

select * from producto;

--Consulta N2
select c.nombre, c.apellido, fd.cantidad, p.precio, (fd.cantidad*p.precio) as total

from factura as f
join cliente as c
on f.cliente_id = c.id
join factura_detalle as fd
on f.id = fd.factura_id
join producto as p
on f.id = p.id
group by c.nombre, c.apellido, fd.cantidad, p.precio, total
order by c.nombre desc;

--Consulta N3
select moneda_id , count (*) as "Top Monedas"
from factura
group by moneda_id
order by "Top Monedas" desc;

select * from factura;

--Consulta N4
select  p.proveedor_id, pr.nombre,
count (*) as "Top Proveedor"
from producto as p
join proveedor as pr
on p.proveedor_id = pr.id
group by proveedor_id, pr.nombre
order by "Top Proveedor" desc;

select * from producto;
select * from proveedor;

--Consulta N5
select fd.producto_id, p.nombre, SUM(fd.cantidad) as "Total Vendido",
count (*) as "Mas Vendido"
from factura_detalle as fd
join producto as p
on fd.producto_id = p.id
group by fd.producto_id, p.nombre
order by "Mas Vendido" desc;

select * from cliente;

--Consulta N6
select fd.producto_id, p.nombre, SUM(fd.cantidad) as "Total Vendido",
count (*) as "Menos Vendido"
from factura_detalle as fd
join producto as p
on fd.producto_id = p.id
group by fd.producto_id, p.nombre
order by "Menos Vendido" asc;

--Consulta N7
	
select f.fecha_emision, c.nombre, c.apellido, tf.nombre, fd.cantidad, p.nombre
from factura as f
join cliente as c
on f.cliente_id = c.id
join factura_tipo as tf
on f.factura_tipo_id = tf.id
join factura_detalle as fd
on f.id = fd.factura_id
join producto as p
on f.id = p.id;

--Consulta N8
select f.id, fd.cantidad, p.precio, (fd.cantidad*p.precio) as Total,
((fd.cantidad*p.precio)*0.10) as "IVA", ((fd.cantidad*p.precio)+(fd.cantidad*p.precio*0.10)) as "Precio Final"
from factura as f
join factura_detalle as fd
on f.id = fd.factura_id
join producto as p
on f.id = p.id
group by f.id, fd.cantidad, p.precio, total
order by total desc;
