import ClassesPkg.FibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int givenNumber;
        System.out.print("Enter a number to shoe fibonacci series: ");
        givenNumber= input.nextInt();
        FibonacciSeries fs = new FibonacciSeries(new int[20]);
        fs.fibonacciSeries(givenNumber);
    }
}