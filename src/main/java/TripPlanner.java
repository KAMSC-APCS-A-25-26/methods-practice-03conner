import java.text.DecimalFormat;
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Calculate travel time using a return method
        System.out.print("Enter trip distance (miles): ");
        int distance = sc.nextInt();
        System.out.print("Enter average speed (mph): ");
        int speed = sc.nextInt();
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        int effic = sc.nextInt();
        System.out.print("Enter fuel price per gallon ($): ");
        double price = sc.nextDouble();
        System.out.println("Results:");
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println("Travel Time: " + format.format(quotient(distance, speed)) + " hours");
        System.out.println("Fuel Needed: " + format.format(quotient(distance, effic)) + " gallons");
        System.out.println("Trip Cost: $" + format.format(product(price, quotient(distance, effic))) );
    }
        public static double product(double a, double b ) {
        double product;
        product = a * b;
        return product;
        }
    public static double quotient(double a, double b ) {
        double quotient;
        quotient = a / b;
        return quotient;
    }
        // TODO: Calculate fuel needed using a return method
        
        // TODO: Calculate trip cost using a return method
        
        // TODO: Display results using a void method
        
    }
    
    // TODO: Implement calculateTravelTime method
    
    // TODO: Implement calculateFuelNeeded method
    
    // TODO: Implement calculateTripCost method
    
    // TODO: Implement displayResults method
    

