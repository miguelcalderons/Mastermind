package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static Partida partida = new Partida();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Bienvenido a MasterMind");
            System.out.println("1. Partida\n 2. Demo\n");
            String gameType = input.readLine();
            partida.juego(gameType);
            System.out.println("Se acabaron los intentos");
            System.out.println("Deseas continuar? Y or N");
            String newGame = input.readLine();
            if (newGame.equals("Y") || newGame.equals("y")) {

            } else System.exit(0);
        }
    }
    }
