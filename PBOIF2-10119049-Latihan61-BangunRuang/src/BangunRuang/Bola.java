package BangunRuang;

/**
 * Deskripsi Class
 * untuk mendapatkan volume bola
 */

public class Bola implements BangunRuang{
    
    private final double phi = 3.14;
    private int jariJari;
    private double volume;

    public Bola(int jariJari) {
        this.jariJari = jariJari;
    }
                
    @Override
    public double hitungVolume() {
        // Rumus Hitung Volume Bola
        // V = 4/3 × π × r³
        return volume = (4 * phi * Math.pow(jariJari,3)/3);
    }

    @Override
    public void tampilHasil() {
        hitungVolume();
        System.out.printf("====Hitung Volume Bola====\n");
        System.out.printf("Dik. Jari Jari (r) = %d cm\n",jariJari);
        System.out.printf("Hasil : Volume Bola = %.1f cm3\n",volume);
    }
    
    
}
