import java.util.Scanner;

public class Tinh_tien_luong { // Luu y: Ten file phai la Tinh_tien_luong.java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap du lieu
        System.out.print("Nhap so gio lam viec: ");
        double soGioLam = sc.nextDouble();

        System.out.print("Nhap muc luong moi gio: ");
        double luongMoiGio = sc.nextDouble();

        double tongLuong;

        // Xu ly logic tinh luong
        if (soGioLam <= 40) {
            // Truong hop lam viec binh thuong
            tongLuong = soGioLam * luongMoiGio;
        } else {
            // Truong hop lam them gio (Overtime)
            double gioTieuChuan = 40;
            double gioLamThem = soGioLam - 40;

            // Luong = (40 gio dau * gia goc) + (gio thua * gia goc * 1.5)
            tongLuong = (gioTieuChuan * luongMoiGio) + (gioLamThem * luongMoiGio * 1.5);
        }

        // Xuat ket qua
        System.out.println("--- Ket qua ---");
        System.out.printf("Tong tien luong nhan duoc: %,.2f VND\n", tongLuong);

        sc.close();
    }
}