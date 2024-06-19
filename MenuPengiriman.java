import java.util.Scanner;

public class MenuPengiriman {
    private Scanner scanner = new Scanner(System.in);

    public int getMode() {
        System.out.println("Pilih moda transportasi: \n1. Darat \n2. Laut \n3. Udara");
        return scanner.nextInt();
    }

    public boolean getBarangBerharga() {
        System.out.println("Apakah barang berharga? (true/false)");
        return scanner.nextBoolean();
    }

    public double getBerat() {
        System.out.println("Masukkan berat (kg):");
        return scanner.nextDouble();
    }

    public double[] getVolume() {
        double[] volume = new double[3];
        System.out.println("Masukkan panjang (cm):");
        volume[0] = scanner.nextDouble();
        System.out.println("Masukkan lebar (cm):");
        volume[1] = scanner.nextDouble();
        System.out.println("Masukkan tinggi (cm):");
        volume[2] = scanner.nextDouble();
        return volume;
    }

    public boolean getEkspres() {
        System.out.println("Pengiriman ekspres? (true/false)");
        return scanner.nextBoolean();
    }

    public void tampilkanBiaya(double biaya) {
        System.out.printf("Biaya pengiriman: Rp %.2f%n", biaya);
    }
}
