import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welome to my calculator!");
        System.out.println("Enter your first number.");
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        System.out.println("What operation would you like to do?");
        String operation = s.next();
        System.out.println("Enter your second number.");
        int second = s.nextInt();
        if(operation.equals("+"))
        {
            System.out.println("Answer: " + (first + second));
        }
        else if(operation.equals("-"))
        {
            System.out.println("Answer: " + (first - second));
        }
        else if(operation.equals("*"))
        {
            System.out.println("Answer: " + (first * second));
        }
        else if(operation.equals("/") && second != 0)
        {
            System.out.println("Answer: " + (first / second));
        }
        else if(operation.equals("%") && second != 0)
        {
            System.out.println("Answer: " + (first % second));
        }
        else if(operation.equals("/") && second == 0)
        {
            System.out.println("Divide by 0 error, does not exist");
        }
        else if(operation.equals("%") && second == 0)
        {
            System.out.println("Divide by 0 error, does not exist");
        }
        else
        {
            System.out.println("Invalid operation");
        }
        s.close();
    }
}