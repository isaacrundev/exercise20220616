import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {

            Scanner input = new Scanner(System.in);
            Cal calculator = new Cal();
            while (true) {

                System.out.println("Please type the first number: ");
                Double firstNum = input.nextDouble();

                System.out.println("Choose an operation: ");
                System.out.println(">Type + for addition");
                System.out.println(">Type - for subtraction");
                System.out.println(">Type * for multiply");
                System.out.println(">Type / for divide");
                String oper = input.next();

                System.out.println("Please type the second number: ");
                Double secondNum = input.nextDouble();
                if (oper.equals("+")) {
                    calculator.add(firstNum, secondNum);
                } else if (oper.equals("-")) {
                    calculator.subtract(firstNum, secondNum);
                } else if (oper.equals("*")) {
                    calculator.multiply(firstNum, secondNum);
                } else if (oper.equals("/")) {
                    calculator.divide(firstNum, secondNum);
                } else {
                    System.out.println("Please enter a valid operator");
                }

                System.out.println("Do you want to continue or quit? ");
                String continueOrNot = input.next();
                if (continueOrNot.toLowerCase().equals("continue")) {
                    continue;
                } else if (continueOrNot.toLowerCase().equals("quit")) {
                    System.out.println("Bye!");
                    break;
                }
                // else {
                // System.out.println("I'd take it as 'quit' anyway. Bye!");
                // break;
                // }
            }
            input.close();
        } catch (InputMismatchException e) {
            System.out.println("Please input a vaild value");
        } catch (Exception x) {
            System.out.println("Can't be divide by 0");
        }
    }
}
