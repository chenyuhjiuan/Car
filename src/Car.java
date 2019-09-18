import java.util.Scanner;

public class Car {
    public static void main (String args[]){

        CarDB car1 = new CarDB();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the car's make.");
        String input="";
        input=sc.nextLine();
        car1.setMake(input);


        System.out.println("Please enter the car's model.");

        String input1=sc.nextLine();
        car1.setModel(input1);

        System.out.println("Please enter the car's making year.");
        int inputint =sc.nextInt();
        car1.setYear(inputint);


        String result=car1.displayCarInf();
        System.out.println("The information of the car is "+result);
    }
}
