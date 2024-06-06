package week9;

public class BangunRuang extends BangunDatar {
    private int tinggi;

    // kubus
    public BangunRuang(int sisi) {
        super(sisi);
    }

    // prisma segitiga
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // tabung
    public BangunRuang(double diameter, int tinggi) {
        super(diameter);
        this.tinggi = tinggi;
    }
         
    //untuk hitung"an


        // volume prisma segitiga
    public int volume(int panjang, int lebar, int tinggi) {
        int aoe = super.luas(panjang, lebar);
        return aoe * tinggi;
    }

    // volume kubus
    public int volume(int sisi) {
        int area = super.luas(sisi);
        return area * sisi;
    }

    //volume tabung
    public double volume(double diameter, int tinggi) {
        double area = super.luas(diameter);
        return area * tinggi;
    }
}
