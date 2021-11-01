package mang;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7,3,1};
        int[] newArr= new int[arr.length+1] ;
        System.out.println("nhâp vào số bạn muốn thêm: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]= number;
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
