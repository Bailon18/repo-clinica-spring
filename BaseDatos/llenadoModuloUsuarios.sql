-- insert roles
INSERT INTO roles(descripcion)VALUES("Administrador");
INSERT INTO roles(descripcion)VALUES("Asistente");
INSERT INTO roles(descripcion)VALUES("Psicologo");


-- insert usuario
INSERT INTO usuarios(dni,nombres,apellidos,correo,contrasena, sexo)VALUES("11111111", "Bailon", "Paucar Montes", "admin@gmail.com", "admin123", "Masculino");
INSERT INTO usuarios(dni,nombres,apellidos ,correo, contrasena ,sexo)VALUES("22222222", "Adrian", "Checa", "checa@gmail.com", "checa133", "Masculino");
INSERT INTO usuarios(dni,nombres,apellidos ,correo, contrasena ,sexo)VALUES("33333333", "Herlly", "Arteaga Sedano", "herlly@gmail.com", "admin122", "Masculino");


-- insert Permisos
INSERT INTO permisos(usuarios_id, roles_id)VALUES(1, 1);
INSERT INTO permisos(usuarios_id, roles_id)VALUES(1, 3);
INSERT INTO permisos(usuarios_id, roles_id)VALUES(2, 2);
INSERT INTO permisos(usuarios_id, roles_id)VALUES(3, 3);



INSERT INTO ocupacion(descripcion)VALUES('sin ocupacion');
INSERT INTO ocupacion(descripcion)VALUES('dependiente formal');
INSERT INTO ocupacion(descripcion)VALUES('dependiente informal');
INSERT INTO ocupacion(descripcion)VALUES('independiente');
INSERT INTO ocupacion(descripcion)VALUES('estudiante');
INSERT INTO ocupacion(descripcion)VALUES('ama de casa');

INSERT INTO estadocivil(descripcion)VALUES('soltero');
INSERT INTO estadocivil(descripcion)VALUES('casado');
INSERT INTO estadocivil(descripcion)VALUES('divorciado');
INSERT INTO estadocivil(descripcion)VALUES('viudo');
INSERT INTO estadocivil(descripcion)VALUES('separado');
INSERT INTO estadocivil(descripcion)VALUES('conviviente');

INSERT INTO servicio(descripcion, monto)VALUES('Evaluacion psicológico', 40);
INSERT INTO servicio(descripcion, monto)VALUES('Terapias', 60);

-- PACIENTES---
INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Bailon', 'Paucar Montes', 'paucarmontesbailon@gmail.com', '3 de octubre', 'villa el salvador', '47094589', '1994-07-03', 'M', '9928838823', 2,2);

INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Xiomara', 'Noriega Noriega', 'xiomara@gmail.com', 'av cesar vallejo', 'San juan de miraflores', '47093445', '1996-10-10', 'F', '9928838823', 1,4);

INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Lucas', 'Perez Luna', 'lucas@gmail.com', 'av republica peru', 'villa maria', '88482843', '2016-02-02', 'M', '9928838823', 1,3);

INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Adrian', 'Aroni', 'adrian@gmail.com', '3 de octubre', 'villa el salvador', '98764732', '1994-07-03', 'M', '98273645', 2,2);

INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Kevin', 'Albornoz', 'kevin@gmail.com', 'av cesar vallejo', 'San juan de miraflores', '87654385', '1996-10-10', 'F', '982737485', 1,4);

INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Mariabel', 'Sullca Huaman', 'mariabel@gmail.com', 'av republica peru', 'villa maria', '12239495', '2016-02-02', 'M', '999283834', 1,3);


INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Paola', 'Noriega', 'paola@gmail.com', '3 de octubre', 'villa el salvador', '92828345', '1994-07-03', 'M', '9999928383', 2,2);

INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Graciela', 'Pizarro Martinez', 'graciela@gmail.com', 'av cesar vallejo', 'San juan de miraflores', '9928383', '1996-10-10', 'F', '998282834', 1,4);

INSERT INTO pacientes(nombre, apellidos, correo, direccion, distrito, documento, fechanacimiento, sexo, telefono, estadocivil, ocupacion) 
VALUES('Alexis', 'Cruz Champi', 'alexis@gmail.com', 'av republica peru', 'villa maria', '22238384', '2016-02-02', 'M', '982828394', 1,3);

-- AFILICIACION -- 

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-16', 1, 1, 1);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-16', 1, 2, 1);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-16', 1, 3, 1);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-16', 1, 4, 1);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-16', 1, 5, 1);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-17', 1, 6, 3);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-17', 1, 7, 3);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-17', 1, 8, 3);

INSERT INTO afiliacion(estadocierre, fechaafiliacion, tuvocierre, paciente, psicologo)
VALUES('','2023-01-17', 1, 9, 3);



INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-16', 9, 'Virtual', 'Se atendio con el paciente x',1, 1, 1 );
INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-16', 12, 'Virtual', 'Se atendio con el paciente x',2, 1, 1 );
INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-16', 18, 'Virtual', 'Se atendio con el paciente x',3, 1, 1 );
INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-16', 17, 'Virtual', 'Se atendio con el paciente x',4, 1, 1 );
INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-16', 1, 'Virtual', 'Se atendio con el paciente x',5, 1, 1 );

INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-17', 18, 'Virtual', 'Se atendio con el paciente x',6, 3, 1 );
INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-17', 9, 'Virtual', 'Se atendio con el paciente x',7, 3, 1 );
INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-17', 12, 'Virtual', 'Se atendio con el paciente x',8, 3, 1 );
INSERT INTO citas(estadocita, fechacita, horacita, modalidad, nota, paciente, psicologo, servicio)
VALUES('pendiente', '2023-01-17', 10, 'Virtual', 'Se atendio con el paciente x',9, 3, 1 );




