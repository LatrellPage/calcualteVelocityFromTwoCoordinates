import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input starting point coordinates
        System.out.print("Enter starting latitude: ");
        double startLatitude = scanner.nextDouble();
        System.out.print("Enter starting longitude: ");
        double startLongitude = scanner.nextDouble();

        // Input destination coordinates
        System.out.print("Enter destination latitude: ");
        double destLatitude = scanner.nextDouble();
        System.out.print("Enter destination longitude: ");
        double destLongitude = scanner.nextDouble();

        // Input speed in miles per hour
        System.out.print("Enter speed in miles per hour: ");
        double speed = scanner.nextDouble();

        // Calculate the distance in miles
        double distanceInMiles = Calculate_distance.calculate_distance(startLatitude, startLongitude, destLatitude, destLongitude);

        // Calculate the time to travel
        double time = distanceInMiles / speed;

        // Find the direction
        String direction = Find_direction.find_direction(startLatitude, startLongitude, destLatitude, destLongitude);


        System.out.printf("You will arrive at your destination in %.2f hours traveling %s.%n", time, direction);
    }
}



