import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class EvaluadorPostfix {
    public static int evaluarExpresion(String expresion) {
        Pila<Integer> pila = new Pila<>();

        Scanner scanner = new Scanner(expresion);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                pila.push(scanner.nextInt());
            } else {
                int operandoB = pila.pop();
                int operandoA = pila.pop();
                char operador = scanner.next().charAt(0);
                int resultado = realizarOperacion(operandoA, operandoB, operador);
                pila.push(resultado);
            }
        }
        scanner.close();

        return pila.pop();
    }

    private static int realizarOperacion(int operandoA, int operandoB, char operador) {
        switch (operador) {
            case '+':
                return operandoA + operandoB;
            case '-':
                return operandoA - operandoB;
            case '*':
                return operandoA * operandoB;
            case '/':
                if (operandoB != 0) {
                    return operandoA / operandoB;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("datos.txt"));
            while (fileScanner.hasNextLine()) {
                String expresion = fileScanner.nextLine();
                int resultado = evaluarExpresion(expresion);
                System.out.println("Resultado: " + resultado);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
