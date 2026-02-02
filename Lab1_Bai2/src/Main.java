import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.printf("Chu vi: %.2f | Diện tích: %.2f | Cạnh nhỏ: %.2f\n",
                chuVi, dienTich, canhNho);
    }
}