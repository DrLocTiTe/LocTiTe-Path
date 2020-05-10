package U8.Tarea1;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class tarea1xml {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("personasXML.xml"));
            NodeList nl = doc.getElementsByTagName("persona");
            System.out.println("En este fichero tengo "+nl.getLength()+" etiquetas persona");
            
            for (int i = 0; i < nl.getLength() ; i++) {
                Node nodo = nl.item(i);
                Element e = (Element) nl.item(i);
                System.out.println("Estoy en una etiqueta: "+e.getTagName());

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    if (nodo.hasChildNodes()) {
                        System.out.println("Y esta etiqueta tiene a su vez "+nodo.getChildNodes().getLength()+" nodos hijos");
                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {
                            if  (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("Uno de los nodos hijos es la etiqueta "+eHijo.getTagName());
                                System.out.println("Cuyo contenido es: "+eHijo.getTextContent());
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}