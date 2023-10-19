class Hp {
    String nama;
    String jenis;
    String warna;
    String model;
    String harga;
    
    public Hp(String nama, String jenis, String warna, String model, String harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.model = model;
        this.harga = harga;
    }
    
    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);       
    }
}

public class JSNO3 {
    public static void main(String[] args) {
        Hp a = new Hp("Samsung", "samsung galaxy s23", "blue", "HP", "14.999.000"); 
        Hp b = new Hp("iPhone", "iPad 14 pro max", "silver", "HP", "10.500.000"); 
        
        Hp c = new Hp("Redmi", "Redmi Note 10", "black", "HP", "5.999.000");

        System.out.println("Informasi Ponsel Samsung:");
        a.tampilkan();

        System.out.println("\nInformasi Ponsel iPhone:");
        b.tampilkan();
        
        System.out.println("\nInformasi Ponsel Redmi:");
        c.tampilkan();
    }
}
