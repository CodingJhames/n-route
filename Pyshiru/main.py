

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


Chamo.saludar("Brian")




















