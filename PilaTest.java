import static org.junit.Assert.*;
import org.junit.Test;

public class PilaTest {

    @Test
    public void testPushAndPop() {
        Pila<Integer> pila = new Pila<>();
        assertTrue(pila.isEmpty());

        pila.push(1);
        pila.push(2);
        pila.push(3);

        assertFalse(pila.isEmpty());
        assertEquals(Integer.valueOf(3), pila.pop());
        assertEquals(Integer.valueOf(2), pila.pop());
        assertEquals(Integer.valueOf(1), pila.pop());

        assertTrue(pila.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopEmptyStack() {
        Pila<String> pila = new Pila<>();
        assertTrue(pila.isEmpty());

        pila.pop();
    }

}

class MiVector<T> {
    private ArrayList<T> elementos;

    public MiVector() {
        elementos = new ArrayList<>();
    }

    public void add(T elemento) {
        elementos.add(elemento);
    }

    public T remove(int index) {
        return elementos.remove(index);
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}

import java.util.ArrayList;

public class Pila<T> {
    private MiVector<T> elementos;

    public Pila() {
        elementos = new MiVector<>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (!isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        } else {
            throw new IllegalStateException("La pila está vacía");
        }
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void realizarOperacion(char operador) {
        throw new UnsupportedOperationException("Unimplemented method 'realizarOperacion'");
    }

    public boolean hayError() {
        throw new UnsupportedOperationException("Unimplemented method 'hayError'");
    }

    public int obtenerResultado() {
        throw new Unsupport
    }
}
