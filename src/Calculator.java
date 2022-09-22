import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1 - To add two numbers");
        System.out.println("2 - To subtract two numbers");
        System.out.println("3 - To multiply two numbers");
        System.out.println("4 - To divide two numbers");
        System.out.println("5 - To exit");
        System.out.println("enter the option");
        int option=input.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter the first number");
                int FirstNum = input.nextInt();
                System.out.println("Enter the second number");
                int SecondNum =input.nextInt();
                System.out.println("The answer is : "+ (FirstNum+SecondNum));
                break;
            case 2:
                System.out.println("Enter the first number");
                FirstNum= input.nextInt();
                System.out.println("Enter the second number");
                SecondNum= input.nextInt();
                System.out.println("The answer is :" +(FirstNum-SecondNum));
                break;
            case 3:
                System.out.println("Enter the first number");
                FirstNum= input.nextInt();
                System.out.println("Enter the second number");
                SecondNum= input.nextInt();
                System.out.println("The answer is :"+(FirstNum*SecondNum));
                break;
            case 4:
                System.out.println("Enter the first number");
                FirstNum= input.nextInt();
                System.out.println("Enter the second number");
                SecondNum= input.nextInt();
                System.out.println("The answer is :" +(FirstNum/SecondNum));
                break;
            case 5:
                System.out.println("Exit...");
                break;
        }

    }
}
