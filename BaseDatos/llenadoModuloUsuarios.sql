USE clinicaBd;


-- insert usuario
INSERT INTO usuarios(dni,nombres,apellidos,correo,contrasena, sexo, rol) 
VALUES("11111111", "Bailon", "Paucar Montes", "admin@gmail.com", "admin123", "M", 1);
INSERT INTO usuarios(dni,nombres,apellidos ,correo, contrasena ,sexo, rol) 
VALUES("22222222", "Adrian", "Checa", "checa@gmail.com", "checa133", "M", 1);
INSERT INTO usuarios(dni,nombres,apellidos ,correo, contrasena ,sexo, rol)
VALUES("33333333", "Herlly", "Arteaga Sedano", "herlly@gmail.com", "admin122", "M", 1);

-- insert roles
INSERT INTO roles(descripcion)VALUES("Administrador");
INSERT INTO roles(descripcion)VALUES("Asistente");
INSERT INTO roles(descripcion)VALUES("Psicologo");

-- insert Permisos
INSERT INTO permisos(usuarios_id, roles_id)VALUES(1, 1);
INSERT INTO permisos(usuarios_id, roles_id)VALUES(1, 2);
INSERT INTO permisos(usuarios_id, roles_id)VALUES(2, 3);
