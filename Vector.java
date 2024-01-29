import java.util.ArrayList;

public class Vector {
    // Puedes utilizar un ArrayList para manejar el tamaño variable del vector.
    private ArrayList<Integer> elementos;

    public Vector() {
        elementos = new ArrayList<Integer>();
    }

    public <T> void add(T elemento) {
        elementos.add((Integer) elemento);
    }

    public int remove(int index) {
        return elementos.remove(index);
    }

    public int get(int index) {
        return elementos.get(index);
    }

    public int size() {
        return elementos.size();
    }
}

