package ClassesPkg;

public class FibonacciSeries {
    int[] arr;

    public FibonacciSeries(int[] arr) {
        this.arr = arr;
    }

    public void fibonacciSeries(int givenNumber) {
        arr[0] = 0;
        arr[1] = 1;

        System.out.print(arr[0]+" "+arr[1]);
        for (int i = 2; i < givenNumber; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(" "+arr[i]);
        }

    }
}
