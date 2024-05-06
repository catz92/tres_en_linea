import java.util.Scanner;

public class TUI {
    Scanner sc = new Scanner(System.in);


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

    public void mostrarTablero(char tablero[], short turno) {
        throw new NotImplementedException();
    }

    public short[] recogerJugada() {
        short[] ejemplo = new short[1];
        return ejemplo;
    }

    public void finDePartida(short ganador) {
        throw new NotImplementedException();

    }


}

