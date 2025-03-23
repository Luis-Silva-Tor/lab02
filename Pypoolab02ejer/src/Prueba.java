import java.util.Scanner;

//definimos lA CLASE PRUEBA 
public class Prueba {
    public static void main(String[] args) {
    	
   //Metodo para recibir entrada del teclado 
    	
   //FUNCION MENU Y ESCANER COMO PARAMETRO 
        Scanner scanner = new Scanner(System.in);
        Menu(scanner);
    }

  // Metodo estatico privado se encargar de mostrar el menu y las operaciones matematicas 
    private static void Menu(Scanner scanner  	) {
    	OperacionesMatDouble<Double> operaciones = new OperacionesMatDouble<>();
        int opcion;

        do {
      // MENU DE OPERACIONES DE LA CLASE para la calculadora 
            System.out.println("Menú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            opcion = scanner.nextInt();
            // del uno las 1 se ingresa dos numeros para realizar la operacion  
            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();
                calculadora(operaciones, opcion, num1, num2);
           // la opciones 6 y 7 solo se necesita ingresar un numero para elevar a la potencia y raiz cubica 
            } else if (opcion == 6 || opcion == 7) {
                System.out.print("Ingrese un número: ");
                double num = scanner.nextDouble();
                calculadora(operaciones, opcion, num, null);
            }
        } while (opcion != 8);
        
        System.out.println("Programa finalizado.");
    }
//este metodo privado llamara a las clases con generacidad para la operacione num1 y num2 son los numeros
    // para ingresar por separado y no uno mismo 
    private static void calculadora(OperacionesMatDouble<Double> operaciones, int opcion, Double num1, Double num2) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + operaciones.suma(num1, num2));
            case 2 -> System.out.println("Resultado: " + operaciones.resta(num1, num2));
            case 3 -> System.out.println("Resultado: " + operaciones.producto(num1, num2));
            case 4 -> System.out.println("Resultado: " + operaciones.division(num1, num2));
            case 5 -> System.out.println("Resultado: " + operaciones.potencia(num1, num2));
            case 6 -> System.out.println("Resultado: " + operaciones.raizCuadrada(num1));
            case 7 -> System.out.println("Resultado: " + operaciones.raizCubica(num1));
        }
    }
}