
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

# cerrar coneciòn
conexion.close()