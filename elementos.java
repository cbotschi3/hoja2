import java.util.ArrayList;
import java.util.List;

public interface elementos<T> {
    int size();

    T remove(int index);

    void add(T elemento);

    boolean isEmpty();
}

class ImplementacionElementos<T> implements elementos<T> {
    private List<T> lista = new ArrayList<>();

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < lista.size()) {
            return lista.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    @Override
    public void add(T elemento) {
        lista.add(elemento);
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
