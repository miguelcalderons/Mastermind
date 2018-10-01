package miw.view;

import miw.controller.MMController;
import miw.model.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Partida extends Main {

    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static MMController mm = new MMController();

    public static void juego(String gameType)  throws IOException {
        int intentos = 10;
        writeln("Respuesta: ****");
        while (mm.guesses < intentos) {
            writeln(" Ingresa los colores: [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,B-blanco, N-negro]");
            String guess;
            if(gameType.equals("1")) {
                guess = input.readLine();
            } else {
                guess = Random.generate();
            }
            if (guess.length() == 4) {
                if (mm.validate(guess)) {
                    writeln("Ganaste en " + mm.guesses + " intentos\n");
                    break;
                } else {
                    writeln("Muertos " + mm.muerto + " Heridos " + mm.herido + "\n");
                }
            } else {
                writeln("#### number format!");
            }
        }
        mm.guesses = 0;
    }
}
