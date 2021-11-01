package mang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemSoHocSinhDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number ;
        do {
            try {
                System.out.println("Nhập vào số học sinh: ");
                number = scanner.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Không đc chữ chỉ nhập số thôi !");
                number = 31;
            }


        }
        while (number>30||number<0);
        double [] array = new double[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập điểm học thứ: "+(i+1));
            array[i] = scanner.nextDouble();
        }
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if(max<array[i]){
                max = array[i];
            }
            if(min <array[i]){
                min = array[i];
            }
        }
        System.out.println("học sinh điểm cao nhất là: "+max);
        System.out.println("học sinh có điểm thấp nhất là: "+min);

    }
}
