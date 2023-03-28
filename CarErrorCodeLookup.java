import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarErrorCodeLookup {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Error Code Lookup Tool!");
        System.out.println();

        // Map of common car error codes and their meanings
        Map<String, String> errorCodes = new HashMap<>();
        errorCodes.put("P0300" ,"Random/Multiple Cylinder Misfire Detected");
        errorCodes.put("P0301", "Cylinder 1 Misfire Detected");
        errorCodes.put("P0302", "Cylinder 2 Misfire Detected");
        errorCodes.put("P0303", "Cylinder 3 Misfire Detected");
        errorCodes.put("P0304", "Cylinder 4 Misfire Detected");
        errorCodes.put("P0420", "Catalyst System Efficiency Below Threshold (Bank 1)");
        errorCodes.put("P0442", "Evaporative Emission Control System Leak Detected (Small Leak)");
        errorCodes.put("P0455", "Evaporative Emission Control System Leak Detected (Large Leak)");
        errorCodes.put("P0505", "Idle Control System Malfunction");
        errorCodes.put("P0700", "Transmission Control System Malfunction");

        // Prompt user to enter error code
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the car error code: ");
        String errorCode = scanner.nextLine().toUpperCase(); // convert user input to uppercase

        // Check if error code is in the map and print the corresponding meaning
        if (errorCodes.containsKey(errorCode)) {
            System.out.println("The error code " + errorCode + " means: " + errorCodes.get(errorCode));
        } else {
            System.out.println("Sorry, the error code you entered is not in our database. Please try again with a different error code.");
        }

        scanner.close();
    }
}
