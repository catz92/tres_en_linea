import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @Test
    void getTabla() {

    }

    @Test
    void getTurn() {
    }

    @Test
    void nuevaPartida() {
        Juego jue = new Juego();
        jue.nuevaPartida();
        char[][] tableroEsperado = new char[3][3];
        for (int i = 0; i < tableroEsperado.length; i++) {
            for (int j = 0; j < tableroEsperado.length; j++) {
                tableroEsperado[i][j] = '-';
            }
        }

        // Comprueba si las matrices son iguales
        assertArrayEquals(tableroEsperado, jue.getTabla());
//        char [][] matrizllena = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
    }

    @Test
    void jugar() {
    Juego jue = new Juego();
//    int fila = 1 ;
//    int columna = 2;
//    jue.jugar(1,2);
//
////    Verificar
//        assertEquals('0',jue.getTabla());
    }

    @Test
    void jugadaGanadora() {
    }

}