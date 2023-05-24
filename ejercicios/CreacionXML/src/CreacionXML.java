import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreacionXML {
    public static void main(String[] args) {
        try {
            Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

            // Creación del nodo raíz
            Element listaContactos = document.createElement("contactos");
            document.appendChild(listaContactos);

            // Creamos el primer nodo contacto
            Element primerContacto = document.createElement("contacto");
            listaContactos.appendChild(primerContacto);

            // Creamos el primer nodo nombre
            Element primerNombre = document.createElement("nombre");
            primerContacto.appendChild(primerNombre);

            // Creamos el primer nodo de texto
            Text nombre = document.createTextNode("Antonio Jesús Téllez Perdigones");
            primerNombre.appendChild(nombre);

            // Creamos el nodo de dirección
            Element primeraDireccion = document.createElement("direccion");
            primerContacto.appendChild(primeraDireccion);

            // Creamos el nodo texto de dirección
            Text direccion = document.createTextNode("Calle Alcalde Alfonso Arroyal, Cádiz");
            primeraDireccion.appendChild(direccion);

            // Creamos el nodo de teléfono
            Element telefono = document.createElement("telefono");
            primerContacto.appendChild(telefono);

            // Creamos el segundo nodo de texto
            Text tlfno = document.createTextNode("657368712");
            telefono.appendChild(tlfno);

            // Clases necesarias para la transformación del fichero
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("C:\\Users\\ajtpe\\Desktop\\1ºDAW\\PROGRAMACIÓN\\TEMA7\\TEMA7\\src\\XML\\Contactos.xml"));

            // Se realiza la transformación de document a fichero
            transformer.transform(source, result);

            System.out.println("Archivo XML creado exitosamente.");
        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello world!");
    }
}