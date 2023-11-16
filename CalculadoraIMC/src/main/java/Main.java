import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los datos de la primera persona");
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce el sexo (H/M): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Introduce el peso (Kg): ");
        double peso = sc.nextDouble();
        System.out.print("Introduce la altura (m): ");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, "",sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, "",sexo,0,0);
        Persona persona3 = new Persona(nombre, edad, "",sexo, peso, altura);

        System.out.println("Introduce el peso (kg) de la segunda persona");
        persona2.setPeso(sc.nextDouble());

        System.out.println("Introduce la altura (m) de la segunda persona");
        persona2.setAltura(sc.nextDouble());

        persona3.setNombre("Persona 3");
        persona3.setEdad(30);
        persona3.setPeso(80);
        persona3.setAltura(1.80);

        sc.close();

        comprobarInformacion(persona1);
        comprobarInformacion(persona2);
        comprobarInformacion(persona3);
    }

    private static void comprobarInformacion(Persona persona) {
        int imc = persona.calcularIMC();
        String mensajeIMC;
        switch (imc) {
            case -1:
                mensajeIMC = "Tiene bajo peso.";
                break;
            case 0:
                mensajeIMC = "Está en su peso ideal.";
                break;
            case 1:
                mensajeIMC = "Tiene sobrepeso.";
                break;
            default:
                mensajeIMC = "IMC no válido.";
                break;
        }

        boolean mayorDeEdad = persona.esMayorDeEdad();

        System.out.println("\nInformación de la persona:");
        System.out.println(persona.toString());
        System.out.println("IMC: " + mensajeIMC);
        System.out.println("Es mayor de edad: " + mayorDeEdad);
    }
}
