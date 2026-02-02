import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh khối lập phương: ");
        double canh = scanner.nextDouble();

        // Cách 1: canh * canh * canh
        // Cách 2: Math.pow(canh, 3)
        double theTich = Math.pow(canh, 3);

        System.out.printf("Thể tích khối lập phương: %.2f\n", theTich);
    }
}