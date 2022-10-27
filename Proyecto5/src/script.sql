CREATE DATABASE IF NOT EXISTS BOLETIN5;

CREATE TABLE PROVEEDOR (
    CODIGO INTEGER NOT NULL PRIMARY KEY,
    USUARIO VARCHAR(10),
    CONTRASENA VARCHAR(8),
    PRECIO_MEDIO FLOAT(2),
    FOTO VARCHAR(15)
);

CREATE TABLE PRODUCTO (
    CODIGO INTEGER NOT NULL PRIMARY KEY,
    NOMBRE VARCHAR(20),
    PRECIO FLOAT(2),
    FECHA DATE NOT NULL,
    COD_PROV INTEGER,
    CONSTRAINT  CODProv_FK FOREIGN KEY (COD_PROV) REFERENCES PRODUCTO(CODIGO) ON DELETE CASCADE
);

/*VALORES DE LOS PROVEEDORES*/
INSERT INTO PROVEEDOR VALUES (001,'prov1', 'prov1', 0, '1011.jpg');
INSERT INTO PROVEEDOR VALUES (002,'prov2', 'prov2', 0, '1018.jpg');
INSERT INTO PROVEEDOR VALUES (003,'prov3', 'prov3', 0, 'default.jpg');



/* VALORES EN TABLA PRODUCTO */
INSERT INTO PRODUCTO VALUES (1,'Mesa',350.50,'01/10/2018',001);
INSERT INTO PRODUCTO VALUES (2,'Silla',72.50,'02/12/2018',002);
INSERT INTO PRODUCTO VALUES (3,'Estanteria',48.70,'01/20/2019',003);
INSERT INTO PRODUCTO VALUES (4,'Papelera',10,'03/15/2019',001);
INSERT INTO PRODUCTO VALUES (5,'Lampara',650,'02/10/2020',002);
INSERT INTO PRODUCTO VALUES (6,'Soporte',700,'07/20/2019',003);
INSERT INTO PRODUCTO VALUES (7,'Alfombra',15.20,'09/18/2021',001);
INSERT INTO PRODUCTO VALUES (8,'Pizarra',12.50,'10/21/2018',002);
INSERT INTO PRODUCTO VALUES (9,'Archivador',5.50,'05/15/2018',003);
INSERT INTO PRODUCTO VALUES (10,'Alfombrilla',3.25, '10/20/2021',001);
