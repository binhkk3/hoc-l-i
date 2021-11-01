package LopDoiTuong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vào chiều rộng: ");
        int chieuDai = scanner.nextInt();
        System.out.println("nhập vào chiều rộng: ");
        int chieuRong = scanner.nextInt();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai,chieuRong);
        hinhChuNhat.setChiDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);
        //int dienTich = hinhChuNhat.chuVi();
        System.out.println("diện tích là "+ hinhChuNhat.chuVi());
        System.out.println("chu vi là "+ hinhChuNhat.dienTich());

    }
}
