import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasMain {
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    List<Persona> personas = new ArrayList<>();

    //Empezamos con el menu

    boolean salir= false;

        while(!salir) {
            mostrarMenu();
            try{
                salir=ejecutarOperacion(consola,personas);
            } catch (Exception e ) {
                System.out.println("Ocurrio un error: "+ e.getMessage());
            }
            System.out.println();
        }


    }


private static void mostrarMenu() {
    //Mostramos las opciones
    System.out.println("""
            *** Listado Personas App ***
            1. Agregar
            2. Listar
            3. Salir
            """);

    System.out.println("Proporciona la opcion?");
}

private static boolean ejecutarOperacion (Scanner consola, List<Persona> personas) {
        int opcion = Integer.parseInt(consola.nextLine());
        boolean salir = false;

        //revisamo la opcion proporcionada
    switch (opcion) {
        case 1 -> {
            //Agregar persona a la lista
            System.out.println("Proporciona el nombre: ");
            String nombre = consola.nextLine();
            System.out.println("Proporciona el telefono");
            String telefono = consola.nextLine();
            System.out.println("Proporciona el email: ");
            String email= consola.nextLine();

            //Ahora vamos a crear el objeto persona

            Persona persona = new Persona(nombre,telefono,email);
            personas.add(persona);
            System.out.println("La lista tiene: "+ personas.size()+ " elementos");
        }

        case 2 -> {
            //Listar las personas
            System.out.println("Listado de Personas");
//            personas.forEach((persona -> System.out.println(persona)));
            personas.forEach(System.out::println);
        }

        case 3 -> {
            System.out.println("Hasta pronto...");
            salir=true;
        }

        default -> System.out.println("Opcion erronea: " + opcion);
    }

    return salir;

}

}

