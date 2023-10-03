import java.util.Scanner;
import java.util.InputMismatchException;

// import necessary packages

class UnitConvert {

    public static void convertInchestoFeet(Scanner scan) {
        // inches to feet
        try {
            System.out.println("Input a value of inches to convert to feet: ");

            double inches = scan.nextDouble();
            double feet = inches / 12;

            System.out.println(inches + " inches is " + feet + " feet ");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not a valid numeric value for inches.");
        }
    }

    public static void convertGramstoPounds(Scanner scan) {
        // grams to pounds
        try {
            System.out.println("Input a value of grams to convert to pounds: ");
            double grams;
            double pounds;

            grams = scan.nextFloat();
            pounds = (float) grams / 453.592;

            System.out.println(grams + " grams is " + pounds + " pounds. ");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not a valid numeric value for grams.");
        }
    }

    public static void convertMilligramstoKilograms(Scanner scan) {
        // milligrams to kilograms
        try {
            System.out.println("Input a value of milligrams to convert to kilograms: ");
            double milligrams;
            double kilograms;
            double grams;

            milligrams = scan.nextDouble();
            kilograms = milligrams / 1000000;
            grams = milligrams / 1000;

            System.out.println(
                    milligrams + " milligrams are equivalent to " + kilograms + " kilograms, and " + grams + " grams.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not a valid numeric value for miligrams.");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // open scanner

        convertInchestoFeet(scan);
        convertGramstoPounds(scan);
        convertMilligramstoKilograms(scan);
        scan.close();
    }
}
