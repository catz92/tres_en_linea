import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }
    public  static void showMenu(){
        System.out.println("Bienvenidos a Tres en linea");
        System.out.println("Selecciona la opcion deseada");

        int opcion = 0;
        do{
            System.out.println("1. Nueva partida");
            System.out.println("2. Cargar partida");
            System.out.println("3. Configuración");
            System.out.println("4. Salir");

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Empezo la partida");
                    break;
                case 2:
                    System.out.println("Cargando");
                    break;
                case 3:
                    System.out.println("Configuracion");
                    break;
                case 4:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
            }
        }while (opcion!=4);
    }
}