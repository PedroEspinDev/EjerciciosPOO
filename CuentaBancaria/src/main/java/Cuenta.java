
public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "titular: " + titular + ", cantidad: " + cantidad;
    }

    public void ingresar(double cantidad) {
        //Verificamos que la cantidad sea positiva antes de sumar cantidades
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa.");
            return;
        }
        // Realizamos suma de cantidades
        this.cantidad += cantidad;
        System.out.println("Ingreso exitoso! \n---Nuevo saldo: " + this.cantidad + "---");
    }

    public void retirar(double cantidad) {
        // Verificamos si la cantidad es positiva
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva.");
            return;
        }
        // Verificamos si el saldo es suficiente para el retiro
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            // Si el saldo no es suficiente, establece el saldo a 0
            this.cantidad = 0;
            System.out.println("El retiro supera el saldo disponible. Saldo actual: " + this.cantidad);
        }
    }
}