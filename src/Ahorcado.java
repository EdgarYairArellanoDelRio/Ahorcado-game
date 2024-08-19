import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        

        Scanner Scanner = new Scanner(System.in);

        //Declaraciones
        int intentos = 0;
        int intentosMaximos = 10;
        String palabraSecreta = "cuaderno";
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
        //Bucle
        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " La palabra contiene: " + palabraSecreta.length() + " Letras -" + " Te quedan " + (intentosMaximos - intentos) + " intentos" );

            System.out.println("Introduce una letra por favor:");
            char letra = Character.toLowerCase((Scanner.next().charAt(0)));

            boolean letraCorrecta = false;
            for(int i = 0; i < palabraSecreta.length(); i++ ){
                //CCondición
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta, Intenta otra vez.");

            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);
            }
            
        }

        if(!palabraAdivinada){
            System.out.println("Juego Terminado, No adivinaste la palabra");
        }

        Scanner.close();


    }
}
