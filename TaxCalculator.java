import java.util.*;

public class TaxCalculator {
    public static void main(String[]args) {
        TaxCalculator tax = new TaxCalculator();

        String userString; //Var representing user Province/Territory choice
        boolean check; // Var representing return boolean from tax calculating function

        Scanner lineReader = new Scanner(System.in);

        tax.listOfPlaces();
        do {
            System.out.println("Please enter a Province/Territory:");
            
            userString = lineReader.nextLine().trim(); // Trims unwanted white spaces in user input
            check = tax.switchCases(userString); 
        } while (check == true);
    }

    /**
     * Method Prints the list of possible Provinces/Territories to choose from.
     */
    private void listOfPlaces() {
        System.out.println("\n ________________________________________________________________________________________________");
        System.out.println("|                                    Provinces/Territories                                       |");
        System.out.println("|------------------------------------------------------------------------------------------------|");
        System.out.println("|Alberta                British Colombia    Manitoba    New Brunswick   Newfoundland and Labrador|");
        System.out.println("|Northwest Territories  Nova Scotia         Nunavut     Ontario         Prince Edward Island     |");
        System.out.println("|Quebec                 Saskatchewan        Yukon                                                |");
        System.out.println("|------------------------------------------------------------------------------------------------|");
        System.out.println("|________________________________________________________________________________________________|\n");
    }

    /**
     * Method determines appropriate tax amount given the user's choice of Province/Territory
     * @param userString
     * @return
     */
    private boolean switchCases(String userString) {

        double purchaseTax; //Var representing taxable amount
        double userTax; //Var representing user input including taxable amount
        double userInput; //Var representing user input

        // Switch case for determine taxable amount given each Province/Territory
        switch(userString) { // Each case multiplies the appropriate taxable rate by the user input
            case "Alberta":
                System.out.println("\nAlberta charges 5% GST (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.05;
                userTax = userInput * 1.05;
                break;
            case "British Colombia":
                System.out.println("\nBritish Colombia charges 7% PST (Provincial Sales Tax) in addition to a 5% GST charge (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.12;
                userTax = userInput * 1.12;
                break;
            case "Manitoba":
                System.out.println("\nManitoba charges 8% RST (Retail Sales Tax) in addition to a 5% GST charge (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.13;
                userTax = userInput * 1.13;
                break;
            case "New Brunswick":
                System.out.println("\nNew Brunswick charges 15% HST (Harmonized Sales Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.15;
                userTax = userInput * 1.15;
                break;
            case "Newfoundland and Labrador":
                System.out.println("\nNewfoundland and Labrador charge 15% HST (Harmonized Sales Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.15;
                userTax = userInput * 1.15;
                break;
            case "Northwest Territories":
                System.out.println("\nNorthwest Territories charge 5% GST (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.05;
                userTax = userInput * 1.05;
                break;
            case "Nova Scotia":
                System.out.println("\nNova Scotia charges 15% HST (Harmonzied Sales Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.15;
                userTax = userInput * 1.15;
                break;
            case "Nunavut":
                System.out.println("\nNunavut charges 5% GST (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.05;
                userTax = userInput * 1.05;
                break;
            case "Ontario":
                System.out.println("\nOntario charges 13% HST (Harmonzied Sales Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.13;
                userTax = userInput * 1.13;
                break;
            case "Prince Edward Island":
                System.out.println("\nPrince Edward Island charges 15% HST (Harmonized Sales Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.15;
                userTax = userInput * 1.15;
                break;
            case "Quebec":
                System.out.println("\nQuebec charges 9.975% QST (Quebec Sales Tax) in addition to a 5% GST charge (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.14975;
                userTax = userInput * 1.14975;
                break;
            case "Saskatchewan":
                System.out.println("\nSaskatchewan charges 6% PST (Provincial Sales Tax) in addition to a 5% GST charge (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.11;
                userTax = userInput * 1.11;
                break;
            case "Yukon":
                System.out.println("\nYukon charges 5% GST (Goods and Services Tax)");
                userInput = printMsg();
                purchaseTax = userInput * 0.05;
                userTax = userInput * 1.05;
                break;
            default:
                System.out.println("\nInvalid Input\n");
                
                // Return true to continue the loop
                return true;
        }

        // Output for taxable amount
        System.out.print("\nThe tax applied to your purchase is ");
        System.out.printf("$%.2f", purchaseTax);
        System.out.println(" CDN");

        // Output for user input including taxable amount
        System.out.print("Your purchase including tax is ");
        System.out.printf("$%.2f", userTax);
        System.out.println(" CDN");
        
        // Default return a false to stop loop when output is displayed
        return false;
    }
    
    /**
     * Method prompts user for their purchase amount, return's a double representing the user's input.
     * @return userNum
     */
    private double printMsg() {
        Scanner doubleReader = new Scanner(System.in);
        double userNum = 0;

        System.out.print("Please enter the purchase amount (CDN$): ");
        userNum = doubleReader.nextDouble();

        return userNum;
    }
}