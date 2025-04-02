import java.io.*;
import java.util.*;

public class ReplaceText2 {
  public static void main(String[] args) throws Exception {
    // Check command line parameter usage
    if (args.length != 3) {
      System.out.println(
        "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
      System.exit(1);
    }

    // Check if source file exists
    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
      System.out.println("Source file " + args[0] + " does not exist");
      System.exit(2);
    }
    
    StringBuilder sb = new StringBuilder();
    
    try (
      // Create input and output files
      Scanner input = new Scanner(sourceFile);
         ) {        
      while (input.hasNext()) {
        String s1 = input.nextLine();
        String s2 = s1.replaceAll(args[1], args[2])+"\n";
       sb.append(s2);
             }
    }
    
    try ( PrintWriter output = new PrintWriter(sourceFile); )
    {
      output.print(sb.toString());
    }
  }
}