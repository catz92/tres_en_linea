public class Juego {

    private char[][] tablero;
    private int turn;

    public char[][] getTabla() {
        return tablero;
    }


    public int getTurn() {

        return turn;
    }

    /**
     * Inicia una nueva partida de tres en raya.
     *
     * Este metodo reinicia el tablero a una matriz de 3x3 y llena todas las
     * posiciones con el caracter '-'. Tambien establece el turno inicial a 1.
     *
     */

    public void nuevaPartida() {
        tablero = new char[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
            turn = 1;
        }
    }

    /**
     * Juega una jugada en la posicion especificada del tablero.
     * Este metodo coloca una marca en la posición especificada del tablero si esta vacia.
     * Si el turno es impar, coloca un '0', y si es par, coloca una 'X'.
     *
     * @param fila    La fila del tablero donde se quiere hacer la jugada.
     * @param columna La columna del tablero donde se quiere hacer la jugada.
     * @return true si la jugada se realizo exitosamente cuando la posicion estaba vacía y se coloco una marca
     * false si la posicion ya estaba ocupada.
     */

    public boolean jugar(int fila, int columna) {

        boolean lleno = false;
        if (tablero[fila][columna] == '-') {
            if (turn % 2 == 1) {
                tablero[fila][columna] = '0';
                turn++;
                return true;
            } else {
                tablero[fila][columna] = 'X';
                turn++;
                return true;
            }
        } else if (tablero[fila][columna] == '0' || tablero[fila][columna] == 'X') {
            return lleno;
        }
        return lleno;
    }


    /**
     * @param fila    la fila de la posicion jugada
     * @param columna la columna de la posicion jugada
     * @return true si la jugada en la posicion (fila, columna) resulta en una victoria; false en caso contrario.
     */
    public boolean jugadaGanadora(int fila, int columna) {
        char jugador = tablero[fila][columna];

        if (tablero[fila][0] == jugador && tablero[fila][1] == jugador && tablero[fila][2] == jugador) {
            return true;
        }

        if (tablero[0][columna] == jugador && tablero[1][columna] == jugador && tablero[2][columna] == jugador) {
            return true;
        }

        if (fila == columna && tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }

        if (fila + columna == 2 && tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        // Si no se cumple ninguna de las condiciones anteriores, la jugada no es ganadora.

        return false;

    }
}
