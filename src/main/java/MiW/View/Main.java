package MiW.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) {
            writeln("Bienvenido a MasterMind");
            writeln("1. Partida\n 2. Demo\n");
            String gameType = input.readLine();
            Partida.juego(gameType);
            writeln("Se acabaron los intentos");
            writeln("Deseas continuar? Y or N");
            String newGame = input.readLine();
            if (newGame.equals("N") || newGame.equals("n")) {
                break;
            }
        }
    }

    public static void writeln(String string) {
        System.out.println(string);
    }

    }
