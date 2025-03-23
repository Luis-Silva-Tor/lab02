//operaciones con clase decimal
// Implementa la interfaz Operable<N> para la genericidad 
class OperacionesMatDouble<N extends Number> implements Operable<N> {
    @Override
   //Metodo suma con genericdad 
    public N suma(N operando1, N operando2) {
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
        if (operando2.doubleValue() == 0) throw new ArithmeticException("cero entre cero, cero");
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
    private N calcular(Double resultado) {
        return (N) resultado; // Aquí podría ser problemático en compilación si N no es Double
    }
}
