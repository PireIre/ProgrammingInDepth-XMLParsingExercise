import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort  {
    PopulateDTOExamplesWithParsedXML domParser = new PopulateDTOExamplesWithParsedXML();

    public void sortBasedOnProtein() throws IOException, SAXException, ParserConfigurationException {
        List<Bar> products = PopulateDTOExamplesWithParsedXML.parseEmployeesXML();
        products.stream().sorted(Comparator.comparing(Bar::getProtein).reversed()).forEachOrdered(System.out::println);

    }

    public void ShowAllInfoInRandomOrder() throws IOException, SAXException, ParserConfigurationException {
        List<Bar> products = PopulateDTOExamplesWithParsedXML.parseEmployeesXML();
        System.out.println(products);
    }

    public void sortBasedOnFat() throws IOException, SAXException, ParserConfigurationException {
        List<Bar> products = PopulateDTOExamplesWithParsedXML.parseEmployeesXML();
        products.stream().sorted(Comparator.comparing(Bar::getFett).reversed()).forEachOrdered(System.out::println);


    }

    public void sortBasedOnFibersStartingWithX(double fiberLimit) throws IOException, SAXException, ParserConfigurationException {
        List<Bar> products = PopulateDTOExamplesWithParsedXML.parseEmployeesXML();

       products.stream()
               .filter(c -> c.getFiber() > fiberLimit)
               .sorted(Comparator.comparing(Bar::getFiber)
                       .reversed())
               .forEachOrdered(System.out::println);
    }

}
