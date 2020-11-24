import java.util.Random;
import java.util.Scanner;

public class flota {
    public static void main(String[] args) {
        final int columnes = 3;
        final int files = 3;
        final int fitxes = 3;
        boolean buclePare = true;
        boolean bucle1 = true;
        boolean bucle2 = true;
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        char[][] taulell = new char[columnes][files];
// Torn del jugador
        for (int i = 0; i < files; i++) {
            buclePare = true;
            while (buclePare) {
                bucle1 = true;
                bucle2 = true;
                while (bucle1) {
                    System.out.println("Introdueix una coordenada per la posició x: ");
                    x = sc.nextInt();
                    sc.nextLine();
                    if (x < 1 || x > columnes) {
                        System.out.println("Coordenada invàlida");
                    } else {
                        bucle1 = false;
                    }
                }
                while (bucle2) {
                    System.out.println("Introdueix una coordenada per la posició y: ");
                    y = ran.nextInt();
                    sc.nextLine();
                    if (y < 1 || y < columnes) {
                        System.out.println("Coordenada invàlida!");
                    } else {
                        bucle2 = false;
                        buclePare=false;
                    }
                }
            }
        }
        for (int t = 0; t< fitxes; t++) {
            buclePare = true;
            while (buclePare) {
                x = ran.nextInt(columnes);
                y = ran.nextInt(files);
                if (taulell[y][x] == 'x') {
                    System.out.println("coordenada ocupada!!");
                } else {
                    taulell[y][x] = 'x';
                    buclePare = false;
                }
            }
        }
        int puntsJugador = 0;
        int puntsMaquina = 0;
        buclePare = true;
/*
        while (buclePare) {
                puntsJugador++;
            if (puntsJugador==3){
                buclePare=false;
                System.out.println("Has guanyat una partida a la màquina!!");
            }else {
                puntsMaquina == 3;
                buclePare = false;
                System.out.println("Has perdut contra la màquina manco!!");
            }
        }
        while (buclePare) {
            for (int q = 0; q < fitxes; q++){
                System.out.println("1 punt per a la màquina");
                puntsMaquina++;
            }
        }
        if (puntsMaquina == 3) {
            buclePare = false;
            System.out.println("Has perdut contra la màquina manco!!");
 */
    }
}