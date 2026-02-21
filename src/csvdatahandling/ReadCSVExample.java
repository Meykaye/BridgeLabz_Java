package csvdatahandling;

/*
 * This program reads a CSV file containing student details
 * (ID, Name, Age, Marks) and prints each record
 * in a structured format.
 */
import java.io.*;

public class ReadCSVExample {

    public static void main(String[] args) {

        String filePath = "students.csv"; // CSV file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header if present
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                Student student = new Student(
                        parts[0],
                        parts[1],
                        Integer.parseInt(parts[2]),
                        Double.parseDouble(parts[3])
                );

                System.out.println(student);
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}

