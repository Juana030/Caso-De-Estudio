import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        int opcion;
        char dato;

        do {
            System.out.println("\n===== MENU PILA =====");
            System.out.println("1. Push (Insertar)");
            System.out.println("2. Pop (Eliminar)");
            System.out.println("3. Peek (Ver tope)");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese un caracter: ");
                    dato = sc.next().charAt(0);
                    pila.push(dato);
                    break;

                case 2:
                    pila.pop();
                    break;

                case 3:
                    pila.peek();
                    break;

                case 4:
                    pila.mostrar();
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}