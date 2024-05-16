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
                tablero[fila][columna]='O';
                turn++;
                return true;
            }
            else {
                tablero[fila][columna]='X';
                turn++;
                return true;
            }
        }else if (tablero[fila][columna] == 'O' || tablero[fila][columna] == 'X'){
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

        char x = tablero[fila][columna];
        char O = tablero[fila][columna];


        if (tablero[fila][0] == x && tablero[fila][1] == x && tablero[fila][2] == x || tablero[fila][0] == O && tablero[fila][1] == x && tablero[fila][2] == O  ) {
            return true;
        }

        if (tablero[0][columna] == x && tablero[1][columna] == x && tablero[12][columna] == x || tablero[0][columna] == O && tablero[1][columna] == O && tablero[2][columna] == O) {
            return true;
        }

        if (fila == columna && tablero[0][0] == x && tablero[1][1] == x && tablero[2][2] == x || fila == columna && tablero[0][0] == O && tablero[1][1] == O && tablero[2][2] == O) {
            return true;
        }

        if (fila + columna == 2 && tablero[0][2] == x && tablero[1][1] == x && tablero[2][0] == x || fila + columna == 2 && tablero[0][2] == O && tablero[1][1] == O && tablero[2][0] == O) {
            return true;

        }
        return false;

    }
}
