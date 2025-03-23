
// operacion sin decimal con un numero entero con genericdad 
class OperacionesMatInteger<N extends Number> implements Operable<N> {
    @Override
    
    //metodo sumar con genercidad para ser accedida desde cualquier parte de las clases 
    public N suma(N operando1, N operando2) {
   // si el operando esta con double ingresa el numero 1 y luego el numero 2 
        return calcular(operando1.doubleValue() + operando2.doubleValue());
    }

    @Override
    public N resta(N operando1, N operando2) {
        return calcular(operando1.doubleValue() - operando2.doubleValue());
    }

    @Override
    public N producto(N operando1, N operando2) {
        return calcular(operando1.doubleValue() * operando2.doubleValue());
    }

    @Override
    public N division(N operando1, N operando2) {
        if (operando2.doubleValue() == 0) throw new ArithmeticException("División por cero no permitida");
        return calcular(operando1.doubleValue() / operando2.doubleValue());
    }

    @Override
    public N potencia(N base, N exponente) {
        return calcular(Math.pow(base.doubleValue(), exponente.doubleValue()));
    }

    @Override
    public N raizCuadrada(N operando) {
        return calcular(Math.sqrt(operando.doubleValue()));
    }

    @Override
    public N raizCubica(N operando) {
        return calcular(Math.cbrt(operando.doubleValue()));
    }

    // Método para convertir el resultado al tipo genérico correcto 
    @SuppressWarnings("unchecked")
    private N calcular(Double resultado) {
        return (N) Double.valueOf(resultado);
    }
}
