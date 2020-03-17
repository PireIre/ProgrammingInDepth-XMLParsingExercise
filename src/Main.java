import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        System.out.println("");
        System.out.println("Application is a little slow, please have patience when things are loading...");
        Display display = new Display();
        display.printDisplay();
        display.selecting();


    }

}
