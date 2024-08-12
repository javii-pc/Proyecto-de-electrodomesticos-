
package proyectoelectrodomesticos;

import java.util.Scanner;


public class ProyectoElectrodomesticos {

    public static void main(String[] args) {
        //arreglo para electrodomesticos 
        electrodomestico datos[] = new electrodomestico[15];
        //menu para gaurdar estudiantes
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        while (op != 5) {
            System.out.println("1. Guardar nuevo electrodomestico");
            System.out.println("2. Buscar electrodomestico ");
            System.out.println("3. Ver elctrodomesticos guaradados");
            System.out.println("4. Modificar datos del electrodomestico");
            System.out.println("5. Salir");
            System.out.println("Ingrese el numero de opcion ");

            op = teclado.nextInt();
            //opcion uno de nuevo alumno
            if (op == 1) {
                System.out.println("-------------------------------");
                System.out.println("Ingrese el codigo");
                int clave = teclado.nextInt();
                System.out.println("-------------------------------");
                System.out.println("Ingrese el nombre");
                String nombre = letras.nextLine();
                System.out.println("-------------------------------");
                System.out.println("Ingrese la marca");
                String grado = letras.nextLine();
                System.out.println("-------------------------------");
                System.out.println(nuevoAlumno(clave, nombre, grado, datos));
                System.out.println("-------------------------------");

            } else if (op == 2) {
                System.out.println("Ingrese la clave ");
                int codigo = teclado.nextInt();
                System.out.println(buscarelectrodoestico(codigo, datos));
            }
            

        }
    }
}



