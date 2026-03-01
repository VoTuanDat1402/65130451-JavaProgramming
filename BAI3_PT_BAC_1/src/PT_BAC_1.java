import java.util.Scanner;

public class PT_BAC_1 {
    public static void main(String[] args) {
        // Khoi tao Scanner de nhap du lieu
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- GIAI PHUONG TRINH BAC NHAT: ax + b = 0 ---");

        // Nhap he so a
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        // Nhap he so b
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        // Thuat toan giai phuong trinh
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            // Cong thuc: x = -b / a
            double x = -b / a;
            System.out.printf("Nghiem cua phuong trinh la: x = %.2f\n", x);
        }

        // Dong scanner
        scanner.close();
    }
}