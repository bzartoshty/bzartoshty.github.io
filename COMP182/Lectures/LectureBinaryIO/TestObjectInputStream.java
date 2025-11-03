import java.io.*;
import java.util.*;

public class TestObjectInputStream {
   public static void main(String[] args) throws IOException {
      try ( // Create an input stream for file object.dat
         ObjectInputStream input =
           new ObjectInputStream(new FileInputStream("object.dat"));
       ) {
         // Write a string, double value, and object to the file
         try {
           String s = (String)input.readUTF();
            System.out.println(s);
            System.out.println((Double)input.readDouble());
            System.out.println((Date)input.readObject());
         
         //   output.writeDouble(85.5);
         //   output.writeObject(new java.util.Date());
         }
         catch(Exception e) {
         System.out.println(e);
         }
      }
   }
}