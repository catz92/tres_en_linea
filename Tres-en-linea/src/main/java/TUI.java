import java.util.Scanner;

public class TUI {
    Scanner sc = new Scanner(System.in);

    /**
     * Muestra el menu principal del juego Tres en raya
     * y permite al usuario seleccionar una opcion.
     *
     * @return La opcion seleccionada por el usuario.
     */
    public int mostrarMenu() {
        System.out.println("Bienvenidos a Tres en linea");
        System.out.println("Selecciona la opcion deseada");
        int opcion = 0;
        do {
            System.out.println("1. Nueva partida");
            System.out.println("2. Cargar partida");
            System.out.println("3. Configuracion");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    return opcion;
                case 2:
                    return opcion;
                case 3:
                    return opcion;
                default:
                    System.out.println("Elija una opcion correcta");
                    break;
            }
        }while (opcion!=4);
        return opcion;
    }

    /**
     * Muestra el estado actual del tablero del juego y el turno actual.
     *
     * @param tablero El tablero del juego representado como una matriz de caracteres.
     * @param turno El numero de turno actual en el juego.
     */
    public void mostrarTablero(char[][] tablero, int turno) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Turno: " + turno);
    }

    /**
     * Metodo para recoger la jugada del usuario.
     *
     * @return Un array de enteros de longitud 2 donde el primer elemento representa la fila
     * y el segundo la columna de la jugada.
     */
    public int[] recogerJugada() {

        int [] ejemplo = new int[2];
        System.out.println("Fila");
        int fila;
        fila = sc.nextShort();
        System.out.println("Columna");
        int columna;
        columna = sc.nextShort();
        ejemplo[0]= fila;
        ejemplo[1]= columna;
        return ejemplo;
    }

    public void finDePartida(short ganador) {
        throw new NotImplementedException();

    }


}

