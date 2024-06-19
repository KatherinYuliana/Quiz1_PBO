public abstract class Pengiriman {
    protected double berat;
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected boolean barangBerharga;
    
    public Pengiriman(double berat, double panjang, double lebar, double tinggi, boolean barangBerharga) {
        this.berat = berat;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.barangBerharga = barangBerharga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public boolean isBarangBerharga() {
        return barangBerharga;
    }

    public void setBarangBerharga(boolean barangBerharga) {
        this.barangBerharga = barangBerharga;
    }

    public abstract double hitungBiaya();
}
