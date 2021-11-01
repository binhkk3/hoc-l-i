package kethuahinhtron;

public class HinhTru extends HinhTron{
    private int chieuCao;

    public HinhTru(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public HinhTru(int banKinh, int chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public HinhTru() {
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }
    public void dienTichMat(int chieuCao,int banKinh){
        System.out.println("diejn tích mặt là: "+(chieuCao*banKinh*2*3.14+banKinh*banKinh*3.14));
    }
    public void theTich (int chieuCao,int banKinh){
        System.out.println("thể tích là: "+chieuCao*banKinh*banKinh*3.14);
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "chieuCao=" + chieuCao +
                '}';
    }
}
