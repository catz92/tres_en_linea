public class Main {

    public static void main(String[] args) {

        TUI tui = new TUI();
        Juego joc = new Juego();

        int resultado = tui.mostrarMenu();

        switch (resultado) {
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

    private static void nuevapartida(Juego joc, TUI tui) {
        joc.nuevaPartida();

        boolean ganador = false;

        while (!ganador) {
            tui.mostrarTablero(joc.getTabla(), joc.getTurn());
            int[] jugada = tui.recogerJugada();



            try {
                joc.jugadaGanadora(jugada[0], jugada[1]);

                tui.mostrarTablero(joc.getTabla(), joc.getTurn());

                int fila = jugada[0];
                int columna = jugada[1];
                if (joc.getTabla()[fila][columna] != '-') {
                    System.out.println("posicion ocupada");


                    joc.jugar(fila, columna);
                    ganador = joc.jugadaGanadora(jugada[0], jugada[1]);
                }


                if (ganador) {
                    System.out.println("¡Tenemos un ganador!");
                }
                else  {
                    joc.jugar(fila,columna);

                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            tui.mostrarTablero(joc.getTabla(), joc.getTurn());
        }
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