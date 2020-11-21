package BangunRuang;

/**
 * Deskripsi Class
 * untuk mendapatkan volume tabung
 */

public class Tabung implements BangunRuang{
    
    private final double phi = 3.14;
    private int jariJari;
    private int tinggi;
    private double luasAlas;
    private double volume;
    
    public Tabung(int jariJari, int tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    
    public double hitungLuasAlas(){
        return luasAlas = (phi * Math.pow(jariJari,2));
    }

    @Override
    public double hitungVolume() {
         return volume = luasAlas * tinggi;
    }

    @Override
    public void tampilHasil() {
        hitungLuasAlas();
        hitungVolume();
        System.out.printf("\n====Hitung Volume Tabung====\n");
        System.out.printf("Dik. Jari Jari (r) = %d cm\n",jariJari);
        System.out.printf("Dik. Tinggi (t) = %d cm\n",tinggi);
        System.out.printf("Hasil : Volume Bola = %.0f cm3\n",volume);
    }
    
    
    
    
}
