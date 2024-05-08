import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @Test
    void getTabla() {

    }

    @Test
    void getTurn() {
    }

    @Test
    void nuevaPartida_taullel() {
        Juego jue = new Juego();
        jue.nuevaPartida();
        char[][] tableroEsperado = new char[3][3];
        Arrays.stream(tableroEsperado).forEach(a -> Arrays.fill(a, '-'));

        // Comprueba si las matrices son iguales
        assertArrayEquals(tableroEsperado, jue.getTabla());
    }

    @Test
    void jugar() {
        Juego jue = new Juego();
        jue.nuevaPartida();
        jue.getTurn();
        jue.jugar(0, 0);

//        Matriz creada para prueba
        char[][] tableroEsperado = new char[3][3];
        for (int i = 0; i < tableroEsperado.length; i++) {
            for (int j = 0; j < tableroEsperado.length; j++) {
                tableroEsperado[i][j] = '-';
            }
        }
        tableroEsperado[0][0] = '0';
        assertArrayEquals(tableroEsperado,jue.getTabla());
    }

    @Test
    void jugadaGanadora() {
    }

}