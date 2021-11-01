package mang;

public class GopMang {
    public static void main(String[] args) {
        int [] array = {1,4,6,3,2,6};
        int [] array2 = {2,4,6,7,43};
        int [] newarray = new int [array.length+ array2.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        for (int i = array.length; i < newarray.length; i++) {
            newarray[i] = array2[i- array.length];
        }
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i]);
        }
    }
}
