import java.lang.reflect.Array;

public class Juego {

private char [][] tablero;
private int turn;

    public char[][] getTabla() {
        return tablero;
    }

    public int getTurn() {
        return turn;
    }

    public void nuevaPartida(){
        tablero = new char[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void jugar(int fila, int columna){
        tablero [fila][columna] = 'X';
    }

    public boolean jugadaGanadora(short fila, short columna){
        return false;
    }

}
