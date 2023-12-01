// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaPalabras = new ArrayList<>();
        String[] palabras = {"perro", "manzana", "azul", "teclado", "juego", "programa", "agua", "parque", "luz", "carro"};
        for(String palabra:palabras){
            listaPalabras.add(palabra);
        }
        Random aleatorio = new Random();
        int indiceP = aleatorio.nextInt(listaPalabras.size());
        String palabraA = listaPalabras.get(indiceP);
        String copia = new String(palabraA);
        copia = copia.replaceAll(".", "_");
        System.out.println("Tienes 7 intentos.\n Adivina la palabra. Escribe una letra:  " + copia);
        Scanner miVariable = new Scanner(System.in);
        int intentos = 0;
        boolean igual = false;
        while (intentos <= 7 && !igual) {
            char p = miVariable.next().charAt((0));
            if (palabraA.contains(Character.toString(p))) {
                for (int i = 0; i < palabraA.length(); i++) {
                    if (palabraA.charAt(i) == p) {
                        copia = copia.substring(0, i) + p + copia.substring(i + 1);
                    }
                }
                System.out.println("Adivina la palabra: " + copia);
                System.out.println("Ingresa otra letra: ");
            } else {
                intentos ++;
                int opor = 7 - intentos;
                System.out.println("Has fallado. Te quedan " + opor + " intentos");
            }
            if (copia.equals(palabraA)) {
                System.out.println("Acertaste.La palabra era " + copia);
                igual = true;
            }
            if (intentos == 1) {
                System.out.println("______   ");
                System.out.println("|    |   ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("Adivina la palabra: "+copia);
                System.out.println("Ingresa otra letra: ");
            } else if (intentos == 2) {
                System.out.println("______   ");
                System.out.println("|    |   ");
                System.out.println("|    O   ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("Adivina la palabra: "+copia);
                System.out.println("Ingresa otra letra: ");
            } else if (intentos == 3) {
                System.out.println("______   ");
                System.out.println("|    |   ");
                System.out.println("|    O   ");
                System.out.println("|    |   ");
                System.out.println("|    |   ");
                System.out.println("|        ");
                System.out.println("Adivina la palabra: "+copia);
                System.out.println("Ingresa otra letra: ");
            } else if (intentos == 4) {
                System.out.println("______   ");
                System.out.println("|    |   ");
                System.out.println("|    O   ");
                System.out.println("|   /|   ");
                System.out.println("|    |   ");
                System.out.println("|        ");
                System.out.println("Adivina la palabra: "+copia);
                System.out.println("Ingresa otra letra: ");
            } else if (intentos == 5) {
                System.out.println("______   ");
                System.out.println("|    |   ");
                System.out.println("|    O   ");
                System.out.println("|   /|\\ ");
                System.out.println("|    |   ");
                System.out.println("|        ");
                System.out.println("Adivina la palabra: "+copia);
                System.out.println("Ingresa otra letra: ");
            } else if (intentos == 6) {
                System.out.println("______   ");
                System.out.println("|    |   ");
                System.out.println("|    O   ");
                System.out.println("|   /|\\ ");
                System.out.println("|    |   ");
                System.out.println("|   /    ");
                System.out.println("Adivina la palabra: "+copia);
                System.out.println("Ingresa otra letra: ");
            } else if (intentos == 7){
                System.out.println("Perdiste!!!");
                System.out.println("______   ");
                System.out.println("|    |   ");
                System.out.println("|    O   ");
                System.out.println("|   /|\\ ");
                System.out.println("|    |   ");
                System.out.println("|   / \\ ");
                System.out.println("La palabra era: " + palabraA);
                igual = true;
            }
        }
    }
}