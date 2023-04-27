package ejercicios;

import java.io.*;
public class Actividad7_2 {
    public static void main(String[] args) throws IOException {
        /**
         * Crea un fichero llamado alumnos.txt dentro de una nueva carpeta con nombre 1DAW, controlando que si ya existe
         * no haga nada. La carpeta debe estar en la raíz de tu usuario.
         * */
        File archivo=new File("C:\\Users\\Usuario\\1DAW");
        File archivoTexto=new File("C:\\Users\\Usuario\\1DAW\\alumnos.txt");
        if (!archivo.exists()){
            archivo.mkdir();
            archivoTexto.createNewFile();
        }else
            System.out.println("No se puede realizar pues ya existen los archivos");

        /**
         * Introduce los nombres de los alumnos de la clase, una alumno por línea del fichero. Utiliza un buffer para
         * realizar esta operación
         * */
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\1DAW\\alumnos.txt"));
        bw.write("Adrian");
        bw.newLine();
        bw.write("Diego");
        bw.newLine();
        bw.write("David");
        bw.newLine();
        bw.write("Antonio");
        bw.newLine();
        bw.write("Jorge");
        bw.newLine();
        bw.write("Jonathan");
        bw.newLine();
        bw.write("Juan Manuel Herrera");
        bw.newLine();
        bw.write("Daniel Alfonso");
        bw.newLine();
        bw.write("Juan Jesus");
        bw.newLine();
        bw.write("Ricardo");
        bw.newLine();
        bw.write("Julián");
        bw.newLine();
        bw.write("Juan María");
        bw.newLine();
        bw.write("Victor");
        bw.newLine();
        bw.write("Jossie");
        bw.newLine();
        bw.write("Juanma Saborido");
        bw.newLine();
        bw.write("John");
        bw.newLine();
        bw.write("Pablo");
        bw.newLine();
        bw.write("José");
        bw.close();

        /**
         * Copia (lee y escribe) el contenido del anterior fichero a uno nuevo con nombre prog.txt
         * */
        File archivoNuevo = new File("C:\\Users\\Usuario\\1DAW\\prog.txt");
        BufferedReader bfr = new BufferedReader(new FileReader(archivoTexto));
        BufferedWriter bfw = new BufferedWriter(new FileWriter(archivoNuevo));
        String indexLinea="";
        while((indexLinea = bfr.readLine()) != null){
            bfw.write(indexLinea);
            bfw.newLine();
        }
        bfw.close();

        /**
         * Renombra el fichero a prog_codificado.txt
         * */
        File archivoRenom = new File("C:\\Users\\Usuario\\1DAW\\prog_codificado.txt");
        archivoNuevo.renameTo(archivoRenom);

        /**
         * En este último fichero, añade al final un alumno nuevo
         * */
        FileWriter flw =new FileWriter("C:\\Users\\Usuario\\1DAW\\prog_codificado.txt",true);
        flw.write("Pedro");
        flw.close();
    }
}
