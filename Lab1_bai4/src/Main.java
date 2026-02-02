import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các hệ số phương trình bậc 2 (ax^2 + bx + c = 0):");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        // Sử dụng Math.abs để tránh lỗi nếu delta âm khi lấy căn bậc 2 (nếu chỉ cần lấy trị số)
        double canDelta = Math.sqrt(delta);

        System.out.printf("Delta: %.2f | Căn Delta: %.2f\n", delta, canDelta);
    }
}