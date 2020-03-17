import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Display {
    private Scanner reader;
    private Sort sorter;

    public Display(){
        reader = new Scanner(System.in);
        sorter = new Sort();
    }

    public void printDisplay(){
        System.out.println();
        System.out.println("(1) Show the name of all bars");
        System.out.println("(2) Sort bars based on highest protein content");
        System.out.println("(3) Sort bars based on highest fat content");
        System.out.println("(4) Filter bars which has less than selected number of fibers and sort them highest to lowest");
        System.out.println("(5) Find all protein bars with more than X protein reviewed by Y");
        System.out.println("(6) Quit");

    }

    public void selecting() throws ParserConfigurationException, SAXException, IOException {

        //TODO: wrap in while and change if to else if or switch

    while(true){

        String option = reader.nextLine();

        if (option.equals("1")){
            sorter.ShowAllInfoInRandomOrder();
            printDisplay();

        }
        else if (option.equals("2")){
            sorter.sortBasedOnProtein();
            printDisplay();
        }
        else if (option.equals("3")){
            sorter.sortBasedOnFat();
            printDisplay();
        }
        else if (option.equals("4")){
            System.out.println("Enter the lowest limit of fiber");
            double fiberLimit = Double.parseDouble(reader.nextLine());

            sorter.sortBasedOnFibersStartingWithX(fiberLimit);
            printDisplay();
        }
        else if(option.equals("5")){
            System.out.println("Function in development. Thank you for your patience :)");
        }
        else if(option.equals("6")){
            System.out.println("Thank you for using application!");
            break;
        }

        else{
            System.out.println("Function not available, please select again.");
        }
    }
    }
}
