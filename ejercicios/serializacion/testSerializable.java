package serializacion;

import java.io.*;

public class testSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Crear objeto que voy a serializar para escribir en un fichero
        objetoSerializable os1 = new objetoSerializable(5, 5, 5);

        //Crear fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_16\\Desktop\\1º DAW ANTONIO\\PROGRAMACION\\TEMA7\\objeto.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //Serializacion del objeto
        oos.writeObject(os1);

        //Cierro el flujo para que se escriba el fichero
        oos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_16\\Desktop\\1º DAW ANTONIO\\PROGRAMACION\\TEMA7\\objeto.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Desearizar el contenido del fichero (bytes) a un Object
        objetoSerializable osSalida = (objetoSerializable)ois.readObject();

        System.out.println("Atributo1: " + osSalida.atributo1);
        System.out.println("Atributo2: " + osSalida.atributo2);
        System.out.println("Atributo3: " + osSalida.atributo3);

        ois.close();
    }
}
