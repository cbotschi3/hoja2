

public class PilaTest {
    @Test
    public void testPila() {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        assertEquals(Integer.valueOf(2), pila.pop());
        assertEquals(Integer.valueOf(1), pila.pop());
        assertEquals(true, pila.isEmpty());
    }

    private void assertEquals(boolean b, boolean empty) {
       
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testVector() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        assertEquals(2, vector.size());
        assertEquals(1, vector.get(0));
        assertEquals(2, vector.get(1));
        assertEquals(1, vector.remove(0));
        assertEquals(1, vector.size());
    }

    private void assertEquals(int i, int j) {
        
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}
