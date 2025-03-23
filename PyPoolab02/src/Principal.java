public class Principal {
    public static void main(String[] args) {
        // Crear una bolsa de Chocolatinas con un tope de 3
        Bolsa <Chocolatina> bolsaCho = new Bolsa<>(3);

        // Se agrega los nombres de ccada en cho
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Chocolatina c3 = new Chocolatina("KitKat");

        bolsaCho.add(c1);
        bolsaCho.add(c2);
        bolsaCho.add(c3);

        // Recorrer la bolsa e imprimir las marcas de las chocolatinas
        System.out.println("Contenido de la bolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }
        
       // ACTIVIDDAD 07  
        
        

        // Crear una bolsa de Golosinas con un tope de 3
        Bolsa<Golosina> bolsaGol = new Bolsa<>(3);

        // Agregar Golosinas (se necesita el peso según el constructor de Golosina)
        Golosina g1 = new Golosina("Caramelo", 5.0);
        Golosina g2 = new Golosina("Gomita", 3.5);
        Golosina g3 = new Golosina("Chicle", 2.0);

        bolsaGol.add(g1);
        bolsaGol.add(g2);
        bolsaGol.add(g3);

        // Recorrer la bolsa e imprimir los nombres de las Golosinas
        System.out.println("Contenido de la bolsa de Golosinas:");
        for (Golosina golosina : bolsaGol) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso() + "g");
        }
    }
}



