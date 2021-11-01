package kethuahinhtron;

public class Main {
    public static void main(String[] args) {
        HinhTru hinhTru = new HinhTru(4,6);
        hinhTru = new HinhTru(3,7);
        //hinhTru.dienTichMat(3,8);
        //hinhTru.dienTichMat(1,1);
        hinhTru.theTich(1,1);
        hinhTru.toString();
    }
}
