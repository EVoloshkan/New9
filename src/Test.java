import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        double[] massive = new double[n];
        double a = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите значение элемента " + i);
            massive[i] = scanner.nextDouble();
            a += massive[i];
        }
        double d = a / n;
        System.out.println("Среднее арифметическое: " + d);
        for(int i = 0; i < n; i++){
            System.out.println("Значение элемента умноженное на среднее арифметическое: " + massive[i] * d);
        }
    }
}
