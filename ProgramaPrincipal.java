import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        System.out.println("Ingrese la expresión en formato Postfix (por ejemplo, '1 2 + 4 * 3 +'): ");
        Scanner scanner = new Scanner(System.in);
        String expresion = scanner.nextLine();
        scanner.close();

        evaluarExpresion(expresion, pila);
    }

    private static void evaluarExpresion(String expresion, Pila<Integer> pila) {
        Scanner scanner = new Scanner(expresion);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int operando = scanner.nextInt();
                pila.push(operando);
            } else {
                char operador = scanner.next().charAt(0);
                pila.realizarOperacion(operador);
            }
        }
        scanner.close();

        if (!pila.hayError()) {
            int resultado = pila.obtenerResultado();
            System.out.println("Resultado: " + resultado);
        } else {
            String mensajeError = pila.obtenerMensajeError();
            System.out.println("Error: " + mensajeError);
        }
    }
}

