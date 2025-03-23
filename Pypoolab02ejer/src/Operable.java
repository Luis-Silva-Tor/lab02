// Interfaz generica donde esta suma resta producto division potencia raiz cuadrada 
// Ponemos los parametros con N que es de tipo generico 
interface Operable<N extends Number> {
    N suma(N operando1, N operando2);
    N resta(N operando1, N operando2);
    N producto(N operando1, N operando2);
    N division(N operando1, N operando2);
    N potencia(N base, N exponente);
    N raizCuadrada(N operando);
    N raizCubica(N operando);
}

