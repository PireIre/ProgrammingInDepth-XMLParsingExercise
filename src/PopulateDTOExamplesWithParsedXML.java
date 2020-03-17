
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class PopulateDTOExamplesWithParsedXML
{

   public static List<Bar> parseEmployeesXML() throws ParserConfigurationException, SAXException, IOException
   {
      //Initialize a list of bars
      List<Bar> products = new ArrayList<Bar>();
      Bar bar = null;

      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(new File("pid-exercise-1_bars_updated__xml.xml"));
      document.getDocumentElement().normalize();
      NodeList nList = document.getElementsByTagName("bar");


      for (int temp = 0; temp < nList.getLength(); temp++)
      {
         Node node = nList.item(temp);
         if (node.getNodeType() == Node.ELEMENT_NODE)
         {
            Element eElement = (Element) node;
             //Node test =  eElement.getElementsByTagName("bar").item(0);
            //Create new Bar Object
             bar = new Bar();
             bar.setSN(eElement.getAttribute("SN"));

             String fett = eElement.getElementsByTagName("fett").item(0).getTextContent();
             String energy = eElement.getElementsByTagName("energy").item(0).getTextContent();
             String protein = eElement.getElementsByTagName("protein").item(0).getTextContent();
             String kolhydrat = eElement.getElementsByTagName("kolhydrat").item(0).getTextContent();
             String fiber = eElement.getElementsByTagName("fiber").item(0).getTextContent();

             bar.setFett(Double.parseDouble(fett));
             bar.setEnergy(Double.parseDouble(energy));
             bar.setProtein(Double.parseDouble(protein));
             bar.setKolhydrat(Double.parseDouble(kolhydrat));
             bar.setFiber(Double.parseDouble(fiber));

             //Add Employee to list
             products.add(bar);
         }
      }
      return products;
   }
}
