package Practica7;

import java.util.Scanner;

public class SeleccionAlumno {
    public static void main(String[] args) {
        daw1 alumnos = new daw1();
        // código para cargar la información de los alumnos en la lista alumnos

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Menú:");
            System.out.println("1. Seleccionar alumno");
            System.out.println("2. Exportar XML");
            System.out.println("3. Importar XML");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    daw1 alumnoSeleccionado = alumnos.seleccionarAlumno();
                    System.out.println("El alumno seleccionado es: " + alumnoSeleccionado.getNombre() + " " + alumnoSeleccionado.getApellidos());
                    break;
                case 2:
                    System.out.println("Introduce el nombre del archivo XML:");
                    String nombreArchivoExportacion = scanner.next();
                    alumnos.exportarXML(nombreArchivoExportacion);
                    break;
                case 3:
                    System.out.println("Introduce el nombre del archivo XML:");
                    String nombreArchivoImportacion = scanner.next();
                    alumnos.importarXML(nombreArchivoImportacion);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
