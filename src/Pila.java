public class Pila {

    private Nodo tope;

    // Constructor
    public Pila() {
        tope = null;
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return tope == null;
    }

    // PUSH
    public void push(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
        System.out.println("Elemento agregado: " + dato);
    }

    // POP
    public void pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elemento eliminado: " + tope.dato);
            tope = tope.siguiente;
        }
    }

    // PEEK
    public void peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elemento en el tope: " + tope.dato);
        }
    }

    // Mostrar pila
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }

        Nodo aux = tope;
        System.out.println("\nContenido de la pila:");

        while (aux != null) {
            System.out.println("| " + aux.dato + " |");
            aux = aux.siguiente;
        }
    }
}