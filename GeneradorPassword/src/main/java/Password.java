public class Password {
    private final static int LONG_DEF = 8;
    private int longitud;
    private String contrasenia;
    public Password(int longitud) {
        this.longitud = longitud;
        contrasenia = generarPassword();
    }

    public String getContrasenia() {
        return contrasenia;
    }

    private String generarPassword() {
        StringBuilder contrasenia = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));
            switch (eleccion) {
                case 1:
                    contrasenia.append((char) ((int) Math.
                            floor(Math.random() * (90 - 65) + 65)));
                    break;
                case 2:
                    contrasenia.append((char) ((int) Math.
                            floor(Math.random() * (122 - 97) + 97)));
                    break;
                case 3:
                    contrasenia.append((char) ((int) Math.
                            floor(Math.random() * (57 - 48) + 48)));
                    break;
            }
        }
        return contrasenia.toString();
    }

    public boolean esFuerte() {
        //Contadores para cada tipo de carácter
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < contrasenia.length(); i++) {

            // Esto se hace para convertir la cadena a un array de caracteres
            char[] caracteres = contrasenia.toCharArray();

            for (char c : caracteres) {
                if (c >= 'A' && c <= 'Z') {
                    mayusculas++;
                } else if (c >= 'a' && c <= 'z') {
                    minusculas++;
                } else if (c >= '0' && c <= '9') {
                    numeros++;
                }
            }
        }
        // La contraseña es fuerte si tiene al menos 2 mayúsculas, 1 minúscula y 5 números como pide el anunciado
        return mayusculas >= 2 && minusculas >= 1 && numeros >= 5;
    }

}
