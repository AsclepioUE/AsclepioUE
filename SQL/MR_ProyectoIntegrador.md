Usuario (Id_Usuario, Password)
Id_Usuaro es clave primaria 
Password es obligatorio

Compra (Id_Compra, Fecha_Compra, Importe)
Id_compra es clave primaria
Fecha_Compra es obligatorio
Importe es obliogatorio

Producto (Id_Producto, Precio, Tipo, Producto_Medico, Nombre)
Id_Producto es la clave primaria
Precio es obligatorio
Tipo es obligatorio
Producto_Medico es obligatorio
Nombre es obligatorio

Registrar (Id_Usuario,Id_Compra)
Id_Compra es clave primaria
Id_Usuario es clave foranea de Usuario

Gestion Stock (Id_Usuario, Id_Producto, Fecha_Gestion, Cantidad)
Id_Usuario, Id_Producto son clave primaria  
Fecha_Gestion es obligatorio
Cantidad es obligatorio 
Id_Usuario es clave foranea de Usuario
Id_Producto es clave foranea de Producto

Controla (Id_Compra, Id_Producto)
Id_Compra, Id_Producto son clave primaria
Id_Compra es clave foranea de Compra
Id_Producto es clave foranea de Producto
