

class Persona():
  edad = 20
  def __init__(self,nombre, nacionalidad ):
      self.nombre = nombre
      self.nacionalidad = nacionalidad

persona_one = Persona('James','Colombiano')
#print(persona_one.edad )

###################################################################################

class Person():
    age = 30
    def __init__(self, name, nacionality ):
        self.name = name
        self.nacionality = nacionality

    def run(self):
        print("i'm running")

#print(Person.age)

person_one = Person("Jhon", "Colombiano")
#person_one.run()

########################################################################

class Chamo():
    def __init__(self):
        pass
    def despedir(self):
        print("te despido")
    @classmethod
    def saludar( cls, nombre ):
        print("Te saludo desde mi metodo de clase, mi nombre es", nombre )


#Chamo.saludar("Brian")

#################################################################################

class People():
    def __init__(self):
        pass

    def jump(self):
        print("I'm jumping")

    @classmethod
    def correr(cls):
        print("Estoy corriendo")

    @staticmethod
    def nadar():
        print("estoy nadando...")

#pedro = People()
#pedro.nadar()

######################################################################


class Libro():
    def __init__(self, nombre, author, paginas):
        self.nombre = nombre
        self.author = author
        self.paginas = paginas

    def describir(self):
        print(f"Hola desde describir,{ self.nombre } ")

    def __str__(self):
        return f"{self.nombre} escrito por {self.author}"

    def __len__(self):
        return self.paginas

    def __del__(self):
        return print("se ha eliminado un libro...")

libro_one = Libro( "Carlos Baza calabaza","Emilio san juan", 150)

del libro_one


###################################################

class Circulo:

    def __init__(self, radio):
        self.radio = radio

    @property
    def area(self):
        return 1.0421 * (self.radio ** 2 )

c = Circulo(21)
print(c.area)


####################################################################

#Polimorfismo

class Perro():
    def avanzar(self):
        print("tengo 4 patas")

class Perico():
    def avanzar(self):
        print("volar")


def mover(animal):
    animal.avanzar()

perro = Perro()
perro.avanzar()

perico = Perico()
perico.avanzar()

print('---------------------------------------------------')

mover(perro)
mover(perico)

#####################################################################

#protecccion


class Intro():
    def __init__(self, valor):
        self.valor = valor

    def segundo(self):
        print('Segundo')

    def tercero(self):
        print('tercero')

class Pepe():
    def saludar(self):
        print("hola soy Pepe")

pepe_one = Pepe()

dato = Intro('valor')
#print(dir(dato))

#print( isinstance(dato, Pepe) )
print( hasattr( dato, 'pepe'))

print('-------------------------------------------------------------')

####################################################################
#abstraccion

class Lavadora():
    def __init__(self):
        pass

    def lavar(self, temp='caliente'):
        self._llenar_taque(temp)
        self._aniadir_jabon()
        self._lavar()
        self._centrifugar()

    def _llenar_taque(self, temp):
        print(f"llenando el tanque con agua {temp}")

    def _aniadir_jabon(self):
        print('Aádiendo jabón')

    def _lavar(self):
        print('Lavando...')

    def _centrifugar(self):
        print('Centrifugando la ropa..')

if __name__ == '__main__':
    lavadora = Lavadora()
    lavadora.lavar()

#################################################################################################
#Herencia

class Personal:
    def __init__(self, antiguedad, especialidad ):
        self.antiguedad = antiguedad
        self.especialidad = especialidad

    def Sueldo(self):
        if( self.especialidad == 'BF'):
            return 10 * self.antiguedad
        else:
            return 15 * self.antiguedad

class Supervirsor( Personal ):
    def __init__(self, cargo ):
        super().__init__(5,cargo)

class Operador(Personal):
    def __init__(self, cargo):
        super().__init__(2,cargo)

if __name__ == '__main__':
    personal_one = Personal(10,'Jefe de Desarrollo')
    #print( f'Sueldo del personal {personal_one.Sueldo()}' )

    suervisor_one = Supervirsor('BF')
    #print( f'El sueldo del supervisor {suervisor_one.Sueldo()}')

    operador_one = Operador('Programador')
    #print( f'El sueldo del operador {operador_one.Sueldo()}')


####################################################################

lista = [1,2,3]

try:
    print(lista[1])
except IndexError:
    print("Error: en el indice")
else:
    print('No hay ningùn error')
finally:
    print('se ejecutó el script correctamente')

try:
    raise TypeError
except:
    print('Error con los tipos de datos' )

###################################################################

#Custom exceptions

class Err( Exception ):
    def __init__(self, value ):
        print(f'Se causó un error por: {value}')

try:
    raise Err(2)
except Err:
    print('Error escrito')








































