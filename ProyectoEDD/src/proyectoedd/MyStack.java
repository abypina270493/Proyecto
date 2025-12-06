package proyectoedd;

import java.util.ArrayList;

/**
 *
 * @author apina
 */
public class MyStack<T> {
    private ArrayList<T> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    // Agregar un elemento a la pila
    public void push(T value) {
        stack.add(value);
    }

    // Quitar el último elemento ingresado
    public T pop() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("La pila esta vacia. No se puede hacer pop.");
        }
        return stack.remove(stack.size() - 1);
    }

    // Ver el último elemento sin eliminarlo
    public T peek() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("La pila esta vacia. No se puede hacer peek.");
        }
        return stack.get(stack.size() - 1);
    }

    // Saber si está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Tamaño de la pila
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
