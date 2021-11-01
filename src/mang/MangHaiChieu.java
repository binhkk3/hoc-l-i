package mang;

import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 34, 56, 4},
                {2, 4, 5, 4, 3, 2},
                {5, 5, 4, 3, 9, 67}};
        System.out.println("nhập vào giá trị bạn muốn tìm: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int cont = -1;
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    System.out.println(number + " ở vị trí " + i + j);
                    cont++;
                }
                if(min>array[i][j]){
                    min = array[i][j];
                }
                if(max<array[i][j]){
                    max = array[i][j];
                }
            }
        }
        if (cont == -1) {
            System.out.println(" không có số bạn muốn tìm: ");
        }
        System.out.println("Số lớn nhất mảng là " + max);
        System.out.println("Số lớn nhất mảng là " + min);
    }
}
