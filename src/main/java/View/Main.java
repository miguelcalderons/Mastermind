package View;

import Controller.MMController;
import Model.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static MMController mm = new MMController();

    public static void main(String [] args) throws IOException {
        while (true) {

            System.out.println("Bienvenido a MasterMind");
            System.out.println("1. Partida\n 2. Demo\n");
            String gameType = input.readLine();

            juego(gameType);

            System.out.println("Se acabaron los intentos");
            System.out.println("Deseas continuar? Y or N");
            String newGame = input.readLine();
            if(newGame.equals("Y") || newGame.equals("y")){
                mm.intentos = 10;
                continue;
            }else {
                System.exit(0);
            }
            }
        }

    private static void juego (String gameType)  throws IOException {
            while (mm.guesses < mm.intentos) {
                System.out.println("Respuesta: " + mm.answer);
                System.out.println(" Ingresa los colores: [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,B-blanco, N-negro]");
                String guess;
                if(gameType.equals("1")) {
                    guess = input.readLine();
                } else {
                    guess = Random.generate();
                }
                if (guess.length() == 4) {
                    if (mm.validate(guess)) {
                        System.out.println("Ganaste en " + mm.guesses + " intentos\n");
                        System.exit(0);
                    } else {
                        System.out.println("Muertos " + mm.muerto + " Heridos " + mm.herido + "\n");
                    }
                } else {
                    System.out.println("#### number format!");
                }
            }
        }
    }
