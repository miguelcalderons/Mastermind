package View;

import Controller.MMController;
import Model.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Partida extends Main {

    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static MMController mm = new MMController();
    private static int intentos = 10;

    public void juego (String gameType)  throws IOException {

        while (mm.guesses < intentos) {
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
                    break;
                } else {
                    System.out.println("Muertos " + mm.muerto + " Heridos " + mm.herido + "\n");
                }
            } else {
                System.out.println("#### number format!");
            }
        }
        mm.guesses = 0;
    }
}
