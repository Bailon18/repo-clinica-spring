-- insert roles
INSERT INTO roles(descripcion)VALUES("Administrador");
INSERT INTO roles(descripcion)VALUES("Asistente");
INSERT INTO roles(descripcion)VALUES("Psicologo");


-- insert usuario
INSERT INTO usuarios(dni,nombres,apellidos,correo,contrasena, sexo) 
VALUES("11111111", "Bailon", "Paucar Montes", "admin@gmail.com", "admin123", "Masculino");
INSERT INTO usuarios(dni,nombres,apellidos ,correo, contrasena ,sexo) 
VALUES("22222222", "Adrian", "Checa", "checa@gmail.com", "checa133", "Masculino");
INSERT INTO usuarios(dni,nombres,apellidos ,correo, contrasena ,sexo)
VALUES("33333333", "Herlly", "Arteaga Sedano", "herlly@gmail.com", "admin122", "Masculino");

-- insert Permisos
INSERT INTO permisos(usuarios_id, roles_id)VALUES(1, 1);
INSERT INTO permisos(usuarios_id, roles_id)VALUES(2, 2);
INSERT INTO permisos(usuarios_id, roles_id)VALUES(3, 3);