import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Indicamos el tamaño de la contraseña que vamos a generar
        String texto = JOptionPane.showInputDialog("Introduce cuantas contraseñas quieres generar: ");
        int tamanio = Integer.parseInt(texto);

        texto = JOptionPane.showInputDialog("Introduce el tamaño de la contraseña: ");
        int longitud = Integer.parseInt(texto);


        Password listaPassword[] = new Password[tamanio];
        boolean contraseniaValida[] = new boolean[tamanio];

        for (int i = 0; i < listaPassword.length; i++) {
            listaPassword[i] = new Password(longitud);
            contraseniaValida[i] = listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContrasenia() + " " + contraseniaValida[i]);
        }
    }
}
