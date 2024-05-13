import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Instanciamos de las clases juego y tui fuera de metodo main
    static TUI tui = new TUI();
    static Juego joc = new Juego();

    public static void main(String[] args) {
        //instanciamos las clases TUI y Juego



        int resultado = tui.mostrarMenu();


        //llamada de los metodos e invocarlos "metodo intermediario"
        switch (resultado){
            case 1:
                nuevapartida();//pide a la clase juego una nueva partida
                                //este pediria el tablero a "Juego" y le pedira a el tui que muestre el tablero.
                                //luego pedira jugada a "TUI" y mandandosela a Juego en un bucle hasta el fin de la partida.
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
    public static void nuevapartida() {
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