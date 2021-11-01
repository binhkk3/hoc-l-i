package mang;

import java.util.ArrayList;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 6, 7, 9, 11};
        System.out.println("nhập vào so bạn can ");
        Scanner scanner = new Scanner(System.in);
        int numble = scanner.nextInt();
        int viTriCanXoa = find(a, numble);
        if (viTriCanXoa == -1) {
            System.out.println("không tìm thấy số cần xóa");
        } else {
            a = delete(a, viTriCanXoa);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    static int find(int[] daySo, int numble) {
        int viTri = -1;
        for (int i = 0; i < daySo.length; i++) {
            if (numble == daySo[i]) {
                System.out.println("có");
                viTri = i;
            }
        }
        return viTri;
    }

    static int[] delete(int[] daySo, int viTri) {
        int[] mangMoi = new int[daySo.length - 1];
        for (int i = 0; i < viTri; i++) {
            mangMoi[i] = daySo[i];
        }
        for (int i = viTri + 1; i < daySo.length; i++) {
            mangMoi[i - 1] = daySo[i];
        }
        return mangMoi;
    }
}
