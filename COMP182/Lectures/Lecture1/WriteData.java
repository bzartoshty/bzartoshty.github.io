import java.io.*;
public class WriteData {
  public static void main(String[] args) throws IOException {
    File file = new File("scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    // Create a file
    java.io.PrintWriter output = new java.io.PrintWriter(file);

    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(100);
    output.print("Eric K Jones ");
    output.println(77);
        // Close the file
    output.close();
  }
}