public class ModaLaut extends Pengiriman {
    private double tarif_volume_bawah = 100;
    private double tarif_volume_atas = 75;
    private double batas_volume = 2500;

    public ModaLaut(double berat, double panjang, double lebar, double tinggi, boolean barangBerharga,
            double tarif_volume_bawah, double tarif_volume_atas, double batas_volume) {
        super(berat, panjang, lebar, tinggi, barangBerharga);
        this.tarif_volume_bawah = tarif_volume_bawah;
        this.tarif_volume_atas = tarif_volume_atas;
        this.batas_volume = batas_volume;
    }

    public double getTarif_volume_bawah() {
        return tarif_volume_bawah;
    }

    public void setTarif_volume_bawah(double tarif_volume_bawah) {
        this.tarif_volume_bawah = tarif_volume_bawah;
    }

    public double getTarif_volume_atas() {
        return tarif_volume_atas;
    }

    public void setTarif_volume_atas(double tarif_volume_atas) {
        this.tarif_volume_atas = tarif_volume_atas;
    }

    public double getBatas_volume() {
        return batas_volume;
    }

    public void setBatas_volume(double batas_volume) {
        this.batas_volume = batas_volume;
    }

    @Override
    public double hitungBiaya() {
        double volume = panjang * lebar * tinggi;
        double biaya = (volume <= batas_volume) ? tarif_volume_bawah * volume : tarif_volume_atas * volume;
        if (barangBerharga) {
            biaya *= 1.05;
        }
        return biaya;
    }

}
