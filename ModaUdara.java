public class ModaUdara extends Pengiriman {
    private double tarif_ekspres = 45;
    private double tarif_regular = 60;
    private double asuransi = 0.15;
    private boolean ekspres;

    public ModaUdara(double berat, double panjang, double lebar, double tinggi, boolean barangBerharga,
            double tarif_ekspres, double tarif_regular, double asuransi) {
        super(berat, panjang, lebar, tinggi, barangBerharga);
        this.tarif_ekspres = tarif_ekspres;
        this.tarif_regular = tarif_regular;
        this.asuransi = asuransi;
    }

    public double getTarif_ekspres() {
        return tarif_ekspres;
    }

    public void setTarif_ekspres(double tarif_ekspres) {
        this.tarif_ekspres = tarif_ekspres;
    }

    public double getTarif_regular() {
        return tarif_regular;
    }

    public void setTarif_regular(double tarif_regular) {
        this.tarif_regular = tarif_regular;
    }

    public double getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(double asuransi) {
        this.asuransi = asuransi;
    }

    public boolean isEkspres() {
        return ekspres;
    }

    public void setEkspres(boolean ekspres) {
        this.ekspres = ekspres;
    }

    @Override
    public double hitungBiaya() {
        double volume = panjang * lebar * tinggi;
        double biaya = ekspres ? tarif_ekspres * volume : tarif_regular * volume;
        biaya *= asuransi;
        if (barangBerharga) {
            biaya *= 1.05;
        }
        return biaya;
    }

}
