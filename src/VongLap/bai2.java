package VongLap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng số nguyên tố muốn tìm : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;
        int cuont = 0;
        while (cuont <= number){
           int k = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                   k++ ;
                }

            }
            if(k==0){
                cuont++;
                System.out.println(i);
            }
            i++;
        }

    }
}
