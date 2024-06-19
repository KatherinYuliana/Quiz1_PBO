public class ModaDarat extends Pengiriman {
    private double tarif = 15000;

    public ModaDarat(double berat, double panjang, double lebar, double tinggi, boolean barangBerharga, double tarif) {
        super(berat, panjang, lebar, tinggi, barangBerharga);
        this.tarif = tarif;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    @Override
    public double hitungBiaya() {
        double biaya = tarif * berat;
        if (barangBerharga) {
            biaya *= 1.05;
        }
        return biaya;
    }

}
