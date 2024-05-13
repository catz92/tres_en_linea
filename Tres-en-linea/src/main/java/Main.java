import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Instanciamos de las clases juego y tui fuera de metodo main

    public static void main(String[] args) {

        TUI tui = new TUI();
        Juego joc = new Juego();

        int resultado = tui.mostrarMenu();

        switch (resultado){
            case 1:
                nuevapartida(joc, tui);
                break;
            case 2:
                cargapartida();
                break;
            case 3:
                configuracion();
                break;
            case 4:
                salir();
                break;
        }
    }
    public static void nuevapartida(Juego joc, TUI tui) {
        joc.nuevaPartida();
        tui.mostrarTablero(joc.getTabla(), joc.getTurn());
        tui.recogerJugada();
    }

    private static void cargapartida() {
        System.out.println("llegamos a CARGAR PARTIDA");

    }

    private static void configuracion() {
        System.out.println("llegamos a CONFIGURACION");

    }
    private static void salir() {
        System.out.println("llegamos a SALIR");
    }
}