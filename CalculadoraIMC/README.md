<p align="center">
  <img width="250px" src="https://i.blogs.es/e7b69c/java_logo/original.png" align="center" alt=" " />
</p>
<h1 align="center">Programación Orientada a Objetos en Java </h1>

## Descripción:

Es un ejercicio para poder practicar el uso de la Programación Orientada a Objetos en Java.

## Instrucciones:

Este ejercicio implica la creación de una clase llamada "Persona" con atributos y métodos específicos, y la creación de
una clase ejecutable para interactuar con objetos de la clase "Persona". A continuación, se describen las instrucciones
detalladas para completar el ejercicio:

## Clase Persona

La clase "Persona" debe cumplir con las siguientes condiciones:

### Atributos

- `nombre`: Nombre de la persona.
- `edad`: Edad de la persona.
- `DNI`: Documento Nacional de Identidad de la persona.
- `sexo`: Sexo de la persona (H para hombre, M para mujer).
- `peso`: Peso de la persona en kilogramos.
- `altura`: Altura de la persona en metros.

No se permite el acceso directo a estos atributos desde fuera de la clase. Utiliza el modificador de acceso más adecuado
y el tipo de dato adecuado para cada atributo.

Los valores predeterminados para los atributos son:

- `nombre`: Cadena vacía.
- `edad`: 0.
- `DNI`: Se generará automáticamente.
- `sexo`: Hombre (utiliza una constante para representar esto).
- `peso`: 0.0.
- `altura`: 0.0.

### Constructores

Se deben implementar tres constructores:

1. Constructor por defecto.
2. Constructor con nombre, edad y sexo, y el resto de atributos por defecto.
3. Constructor con todos los atributos como parámetro.

### Métodos

Se deben implementar los siguientes métodos:

- `calcularIMC()`: Calcula si la persona está en su peso ideal según la fórmula `(peso en kg / (altura^2 en m))`.
  Devuelve -1 si el resultado es menor que 20, 0 si está entre 20 y 25 (inclusive), y 1 si es mayor que 25. Utiliza
  constantes para representar estos valores.
- `esMayorDeEdad()`: Indica si la persona es mayor de edad y devuelve un booleano.
- `comprobarSexo(char sexo)`: Comprueba que el sexo introducido es correcto y lo ajusta a "H" si no lo es. Este método
  no será visible desde fuera de la clase.
- `toString()`: Devuelve toda la información del objeto como una cadena.
- `generaDNI()`: Genera un número aleatorio de 8 cifras y genera su letra correspondiente. Este método se invocará al
  construir el objeto y no será visible desde fuera de la clase.
- Métodos set para cada parámetro, excepto para DNI.

## Clase Ejecutable

Crea una clase ejecutable que realice lo siguiente:

1. Solicita por teclado el nombre, la edad, el sexo, el peso y la altura de una persona.
2. Crea tres objetos de la clase "Persona":
    - El primer objeto obtiene las variables solicitadas por teclado.
    - El segundo objeto obtiene todas las variables excepto el peso y la altura.
    - El tercer objeto se crea con los valores por defecto y utiliza los métodos set para asignar valores a los
      atributos.
3. Para cada objeto, comprueba si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal y
   muestra un mensaje correspondiente.
4. Indica si cada persona es mayor de edad.
5. Muestra la información de cada objeto utilizando el método `toString()`.

## Nota

Asegúrate de seguir las instrucciones detalladas y crear las clases y métodos necesarios para que el ejercicio funcione
correctamente. Puedes organizar tu código en paquetes si lo consideras necesario. ¡Diviértete programando!

**Autor:** [@PedroEspinDev](https://github.com/PedroEspinDev)

### Idioma del proyecto

- Anotaciones: Español
- Código: Español

---

### Detalles Técnicos

- **Java 11:** Utilizamos Java 11, es un proyecto básico, por lo que no se necesita una configuración compleja.

---
Para más inmformación sobre ejercicios de Java
visita [Discoduroderoer.es](https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/)
Esperamos que disfrutes explorando y practicando!.

