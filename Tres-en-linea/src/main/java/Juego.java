public class Juego {

    private char[][] tablero;
    private int turn;

    public char[][] getTabla() {
        return tablero;
    }



    public int getTurn() {

        return turn;
    }

    public void nuevaPartida() {
        tablero = new char[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
            turn = 1;
        }

    }

    public boolean jugar(int fila, int columna) {

        boolean lleno = false;
        if (tablero[fila][columna] == '-') {
            if (turn % 2 == 1){
                tablero[fila][columna]='0';
                turn++;
                return true;
            }
            else {
                tablero[fila][columna]='X';
                turn++;
                return true;
            }
        }else if (tablero[fila][columna] == '0' || tablero[fila][columna] == 'X'){
            return lleno;
        }
        return lleno;
    }


       /** if (tablero[fila][columna] != '-') {
            return false;
        }

        if (turn % 2 == 1) {
            tablero[fila][columna] = 'O';
        } else {
            tablero[fila][columna] = 'X';
        }
        turn++;

        return true;*/


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
        return false;

    }
}
