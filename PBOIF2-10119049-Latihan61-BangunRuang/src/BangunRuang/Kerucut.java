package BangunRuang;

/**
 * Deskripsi Class
 * untuk mendapatkan volume kerucut
 */

public class Kerucut implements BangunRuang{
    
    private final double phi = 3.14;
    private int jariJari;
    private int tinggi;
    private double volume;

    public Kerucut(int jariJari, int tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
           
    @Override
    public double hitungVolume() {
        return volume = (phi * Math.pow(jariJari,2)*tinggi) / 3;
    }

    @Override
    public void tampilHasil() {
        hitungVolume();
        System.out.printf("\n====Hitung Volume Kerucut====\n");
        System.out.printf("Dik. Jari Jari (r) = %d cm\n",jariJari);
        System.out.printf("Dik. Tinggi (t) = %d cm\n",tinggi);
        System.out.printf("Hasil : Volume Bola = %.1f cm3\n",volume);
    }
    
}
