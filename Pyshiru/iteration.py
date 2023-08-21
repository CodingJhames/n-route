

lenguajes = [ 'java','ruby','javascript','python']

for i in lenguajes:
    print(i)

############################################################
# Generators

def generaPares(limite):
    num = 1
    miLista = []
    while num < limite:
        yield num * 2
        num = num + 1

devuelvePares = generaPares(10)

print( next( devuelvePares ) )
print( next( devuelvePares ) )
