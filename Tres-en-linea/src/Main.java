public class Main {
    public static void main(String[] args) {
        TUI tui = new TUI();
        Juego joc = new Juego();

        int resultado = tui.mostrarMenu();
        System.out.print(resultado);
        switch (resultado){
            case 1:
                nuevapartida();
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
    private static void nuevapartida() {
        System.out.println("llegamos a nueva partida");
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