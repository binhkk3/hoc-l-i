package kethuahinhtron;

public class HinhTron {
    private int banKinh;

    public HinhTron() {
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "chuVi=" + banKinh +
                '}';
    }

    public HinhTron(int chuVi) {
        this.banKinh = chuVi;
    }
}
