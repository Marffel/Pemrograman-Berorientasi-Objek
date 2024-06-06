package week9;

public class DatarBangun
{
    private int panjang;
    private int lebar;
    private int diameter;
    private int sisi;
    private double jari;
    private static final double pi = 3.14;

    public DatarBangun(int sisi)
    {
        this.sisi = sisi;
    }

    public DatarBangun(int panjang,int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public DatarBangun(int jari,double pi)
    {
        this.jari = jari;
        this.diameter = diameter;
    }

    public int luas (int a)
    {
        return a*a;
    }

    public int luas (int a,int b)
    {
        return a*b;
    }

    public double luas(double a,double b)
    {
        return (a*b)/2;
    }

    public double lingkaran(double jari)
    {
        return pi*jari*jari;
    }

    public int getPanjang()
    {
        return panjang;
    }
    
    public int getLebar()
    {
        return lebar;
    }
    
    public int getDiameter()
    {
        return diameter;
    }
    
    public int getSisi()
    {
        return sisi;
    }
    
    public double getJari()
    {
        return jari;
    }

}