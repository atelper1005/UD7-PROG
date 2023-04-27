package ejercicios;

import serializacion.objetoSerializable;

import java.io.*;

public class PersonaSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona p1 = new Persona();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_16\\Desktop\\1º DAW ANTONIO\\PROGRAMACION\\TEMA7\\objeto.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p1);

        oos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_16\\Desktop\\1º DAW ANTONIO\\PROGRAMACION\\TEMA7\\objeto.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Persona osSalida = (Persona) ois.readObject();

        System.out.println("El nombre del personaje es: " + osSalida.nombre);

        ois.close();
    }
}
