public class ControllerPengiriman {
    private MenuPengiriman menu;
    
    public ControllerPengiriman(MenuPengiriman menu) {
        this.menu = menu;
    }

    public void prosesPengiriman() {
        int mode = menu.getMode();
        boolean barangBerharga = menu.getBarangBerharga();
        double berat = menu.getBerat();

        Pengiriman pengiriman = null;
        
        if (mode == 1) {
            pengiriman = new ModaDarat(berat, berat, berat, berat, barangBerharga, berat);
        } else if (mode == 2) {
            double[] volume = menu.getVolume();
            pengiriman = new ModaLaut(berat, volume[0], volume[1], volume[2], barangBerharga, berat, berat, berat);
        } else if (mode == 3) {
            // double[] volume = menu.getVolume();
            // boolean ekspres = menu.getEkspres();
            // pengiriman = new ModaUdara(berat, volume[0], volume[1], volume[3], barangBerharga, berat, mode, berat);
        }

        if (pengiriman != null) {
            double biaya = pengiriman.hitungBiaya();
            menu.tampilkanBiaya(biaya);
        } else {
            System.out.println("Mode transportasi tidak valid.");
        }
    }
}
