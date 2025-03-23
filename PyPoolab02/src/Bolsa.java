import java.util.ArrayList;
import java.util.Iterator;


// Devuelve un iterador para recorrer los elementos de la bolsa.
public class Bolsa<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<>();
    private int tope;
//  Agrega un elemento a la bolsa si no ha alcanzado el límite
    //en caso contrario, lanza una excepción
    public Bolsa(int tope) {
        this.tope = tope;
    }

    public void add(T objeto) {
        if (lista.size() < tope) { // Corrección: Permitir agregar solo si no se supera el límite
            lista.add(objeto);
        } else {
            throw new RuntimeException("No caben más elementos en la bolsa");
        }
    }

    public Iterator<T> iterator() {
        return lista.iterator();
    }
}


