import java.util.Scanner;

public class Lab1_Bai1_DTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Điểm trung bình: ");
        double dtb = scanner.nextDouble();

        System.out.printf("%s: %.2f điểm\n", hoTen, dtb);
    }
}