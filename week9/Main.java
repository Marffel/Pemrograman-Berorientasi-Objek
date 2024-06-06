package week9;

public class Main{
    public static void main(String[] args){
        BangunDatar nano = new BangunDatar(0);
        BangunRuang rano = new BangunRuang(0,0);

        System.out.println("Luas: " + nano.luas(5));
        System.out.println("Luas: " + nano.luas(6, 5));
        System.out.println("Luas: " + nano.luas(10.0, 3.0));
        System.out.println("===============");
        System.out.println("Luas Kotak: " + rano.volume(5));
        System.out.println("Luas Balok: " + rano.volume(3,5,6));
        System.out.println("Luas Tabung: " + rano.volume(6.0, 6));
        
    }
}