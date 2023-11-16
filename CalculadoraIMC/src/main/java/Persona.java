public class Persona {
    private static final int IMC_BAJO_PESO = -1;
    private static final int IMC_PESO_NORMAL = 0;
    private static final int IMC_SOBREPESO = 1;

    private static final int MAYORIA_DE_EDAD = 18;

    private static final char SEXO_POR_DEFECTO = 'H';
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;


    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI= generarDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String DNI,char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }     }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return IMC_BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            return IMC_PESO_NORMAL;
        } else {
            return IMC_SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= MAYORIA_DE_EDAD;
    }

    private void setSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_POR_DEFECTO;
        }
    }
    private String generarDNI() {
        StringBuilder dni = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            dni.append((int) (Math.random() * 10));
        }
        char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.parseInt(dni.toString()) % 23);
        dni.append(letra);
        return dni.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: " + peso + " kg\nAltura: " + altura + " m";
    }
}
