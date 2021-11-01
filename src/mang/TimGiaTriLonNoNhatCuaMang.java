package mang;

import java.util.Scanner;

public class TimGiaTriLonNoNhatCuaMang {
    public static void main(String[] args) {
        System.out.println("nhập số phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập vào phần tử thứ "+(i+1)+" của mảng");
            arr[i]= scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(min>arr[i]){
                min = arr[i];
            }
            if(max <arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Số bé nhất mảng là " + min);
        System.out.println("Số lớn nhất của mảng là "+max);
    }
}
