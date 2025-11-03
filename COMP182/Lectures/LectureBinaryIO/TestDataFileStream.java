import java.io.*;

public class TestDataFileStream {
   public static void main(String[] args) throws IOException {
      try (
      // Create an output stream to the file
      DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
      ) {
      // Output values to the file
         for (int i = 1; i <= 500; i++)
            output.writeInt(i);
      }
   
      try (
      // Create an input stream for the file
      DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
      ) {
      // Read values from the file
         int value;
      /*  while(true){
      try {
      value = input.readInt();
        System.out.print(value + " ");
        }
        catch(EOFException e){
        break;
        }
      } 
      */ 
         while(input.available()!=0){
            value = input.readInt();
            System.out.print(value + " ");
         
         }
      }
   }
}