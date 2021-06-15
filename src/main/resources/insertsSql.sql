INSERT INTO public.cliente(
	id_cliente, email, nombre_apellido, numero_telefono)
	VALUES (1, 'pepe@gmail.com', 'Pedro Perez', '153011589');

INSERT INTO public.cliente(
	id_cliente, email, nombre_apellido, numero_telefono)
	VALUES (2, 'pepita@gmail.com', 'Andrea Maccarone', '1529114798');
	
INSERT INTO public.peluqueria(
	id_peluqueria, cant_max_personas, direccion, nombre)
	VALUES (1, 4, 'Av Alberdi 3500', 'Peluqueria Coco');

INSERT INTO public.peluquero(
	id_peluquero, email, nombre_apellido, peluqueria_id)
	VALUES (1, 'coco@gmail.com', 'Coco Fernandez', 1);

INSERT INTO public.peluquero(
	id_peluquero, email, nombre_apellido, peluqueria_id)
	VALUES (1, 'rosa@gmail.com', 'Rosita Fernandez', 1);
	
INSERT INTO public.servicio(
	id_servicio, nombre, precio)
	VALUES (1, 'Corte', '$450');
	
INSERT INTO public.servicio(
	id_servicio, nombre, precio)
	VALUES (2, 'Tintura', '$600');

INSERT INTO public.servicio(
	id_servicio, nombre, precio)
	VALUES (3, 'Brushing', '$800');

INSERT INTO public.rel_servicio_peluquero(
	servicio_id, peluquero_id, id_rel_servicio_peluquero)
	VALUES (1, 1, 1);

INSERT INTO public.rel_servicio_peluquero(
	servicio_id, peluquero_id, id_rel_servicio_peluquero)
	VALUES (1, 2, 1);

INSERT INTO public.rel_servicio_peluquero(
	servicio_id, peluquero_id, id_rel_servicio_peluquero)
	VALUES (2, 2, 1);

INSERT INTO public.rel_servicio_peluquero(
	servicio_id, peluquero_id, id_rel_servicio_peluquero)
	VALUES (3, 2, 1);
