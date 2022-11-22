import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static int inputSize() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = input.nextInt();
        return size;
    }


    public static double[] SetSalaries() {
        int size = inputSize();
        double[] salaries = new double[size];

        for (int i = 0; i < salaries.length; i++) {

            Scanner inputSalaries = new Scanner(System.in);
            System.out.println("enter salary for employee NO:" + (i + 1));
            salaries[i] = inputSalaries.nextDouble();
        }

        double sum=0;
        double average;

        for (int i = 0; i < salaries.length; i++) {

        }
        System.out.println(Arrays.toString(salaries));
        for (int i = 0; i < salaries.length; i++) {


           sum+=salaries[ i];
        }

        System.out.println("sum "+sum);
        return salaries;
    }





    public static void main(String[] args) {


        SetSalaries();


    }
}