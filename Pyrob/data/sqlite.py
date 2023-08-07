
# importar modulo

import sqlite3

# conexiòn
conexion = sqlite3.connect( 'test.db' )

# crear cursor
cursor = conexion.cursor()

# crear tabla
cursor.execute("CREATE TABLE IF NOT EXISTS productos("+
"id INTEGER PRIMARY KEY AUTOINCREMENT,"+
"titulo varchar(255),"+
"descripcion text,"+
"precio int(255)"+

")")

# Guardar cambios
conexion.commit()

#insertar datos
cursor.execute("INSERT INTO productos VALUES (null, 'Primer producto','Descripción de producto',550 )")
conexion.commit()

# Listar datos
cursor.execute("SELECT * FROM productos")

print(cursor)
productos = cursor.fetchall()

for producto in productos: 
    print( "Título:", producto[1] )
    print( "Descripción:", producto[2] )
    print( "Descripción:", producto[3] )
    print( "\n" )


cursor.execute("SELECT titulo FROM productos")
producto = cursor.fetchone()
print(producto)


print( productos )

# cerrar coneciòn
conexion.close()