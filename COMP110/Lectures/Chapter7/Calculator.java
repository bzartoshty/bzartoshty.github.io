public class Calculator {
  /** Main method */
  public static void main(String[] args) {
    // Check number of strings passed
    if (args.length != 3) {
      System.out.println(
        "Usage: java Calculator operand1 operator operand2");
      System.exit(1);
    }

    // The result of the operation
    int result = 0;

    // Determine the operator
    switch (args[1]) { 
      case "+": result = Integer.parseInt(args[0]) + 
                         Integer.parseInt(args[2]);
                break;
      case "-": result = Integer.parseInt(args[0]) -
                         Integer.parseInt(args[2]);
                break;
      case ".": result = Integer.parseInt(args[0]) *
                         Integer.parseInt(args[2]);
                break;
      case "/": result = Integer.parseInt(args[0]) /
                         Integer.parseInt(args[2]);
                 break;
        case "%": result = Integer.parseInt(args[0]) %
                         Integer.parseInt(args[2]);
                 break;

       default: System.out.println("Illegal Operator");
                System.exit(2);
    }

    // Display result
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
      + " = " + result);
  }
}