import java.util.Scanner;

public class QUY_DOI_TIEN_TE {
    public static void main(String[] args) {
        // Khoi tao Scanner de doc du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Dinh nghia ty gia (Hang so)
        final double TI_GIA_USD = 23500;
        final double TI_GIA_EUR = 27000;

        System.out.println("--- CHUONG TRINH QUY DOI TIEN TE ---");

        // 1. Quy doi USD sang VND
        System.out.print("Nhap so tien USD muon doi: ");
        double usd = scanner.nextDouble();
        double vndTuUsd = usd * TI_GIA_USD;
        System.out.printf("%.2f USD = %,.0f VND\n", usd, vndTuUsd);

        System.out.println("------------------------------------");

        // 2. Quy doi EUR sang VND
        System.out.print("Nhap so tien EUR muon doi: ");
        double eur = scanner.nextDouble();
        double vndTuEur = eur * TI_GIA_EUR;
        System.out.printf("%.2f EUR = %,.0f VND\n", eur, vndTuEur);

        // Dong scanner
        scanner.close();
    }
}