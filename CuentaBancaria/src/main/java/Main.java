import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Uso la clase Scanner para leer datos y hacerlo más interactivo, pero no es necesario
        Scanner sc= new Scanner(System.in);
        // 1.Creamos cuentas
        Cuenta cuenta1 = new Cuenta("Pedro", 0);
        Cuenta cuenta2 = new Cuenta("Emilio");

        // 2.Realizar operaciones, se modifica la cuenta donde se realiza la operación y
        // las cantidades al gusto que se deseen
        System.out.print("Ingrese la cantidad a depositar en cuenta1: ");
        double ingresoCuenta1 = sc.nextDouble();
        cuenta1.ingresar(ingresoCuenta1);

        System.out.print("Ingrese la cantidad a retirar de cuenta1: ");
        double retiroCuenta1 = sc.nextDouble();
        cuenta1.retirar(retiroCuenta1);

        System.out.print("Ingrese la cantidad a depositar en cuenta2: ");
        double ingresoCuenta2 = sc.nextDouble();
        cuenta2.ingresar(ingresoCuenta2);

        System.out.print("Ingrese la cantidad a retirar de cuenta2: ");
        double retiroCuenta2 = sc.nextDouble();
        cuenta2.retirar(retiroCuenta2);

        // 3.Imprimimos datos de las cuentas con toString
        System.out.println("\nDatos de la cuenta 1 con " + cuenta1.toString());
        System.out.println("\nDatos de la cuenta 2 con " + cuenta2.toString());
    }
    //Se podría hacer de mil maneras, pero esta es una forma sencilla de hacerlo para poder practicar.
}