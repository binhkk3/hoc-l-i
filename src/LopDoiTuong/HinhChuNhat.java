package LopDoiTuong;

public class HinhChuNhat {
    private int chiDai;
    private int chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chiDai, int chieuRong) {
        this.chiDai = chiDai;
        this.chieuRong = chieuRong;
    }

    public int getChiDai() {
        return chiDai;
    }

    public void setChiDai(int chiDai) {
        this.chiDai = chiDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chiDai=" + chiDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
    public int chuVi(){
        return (chiDai+chieuRong)*2;
    }
    public int dienTich(){
        return chieuRong*chiDai;
    }
}
