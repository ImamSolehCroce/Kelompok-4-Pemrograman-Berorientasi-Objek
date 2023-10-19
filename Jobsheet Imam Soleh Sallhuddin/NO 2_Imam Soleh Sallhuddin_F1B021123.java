class Hp {
    String nama;
    String seri;
    int ram;
    int memori;
    String baterai;
}

public class Main {

    public static void main(String[] args) throws Exception {
        
        Hp Redmi = new Hp();
        Redmi.nama = "Redmi";
        Redmi.seri = "A21S";
        Redmi.ram = 8;
        Redmi.memori = 128;
        Redmi.baterai = "5000 mAh";
        
        Hp Xiaomi = new Hp();
        Xiaomi.nama = "Xiaomi";
        Xiaomi.seri = "Nova 5T";
        Xiaomi.ram = 8;
        Xiaomi.memori = 256;
        Xiaomi.baterai = "5000 mAh";
        
        Hp Oppo = new Hp();
        Oppo.nama = "Oppo";
        Oppo.seri = "A73";
        Oppo.ram = 6;
        Oppo.memori = 128;
        Oppo.baterai = "4000 mAh";
        
        System.out.println("Informasi Redmi:");
        System.out.println("Nama: " + Redmi.nama);
        System.out.println("Seri: " + Redmi.seri);
        System.out.println("RAM: " + Redmi.ram + " GB");
        System.out.println("Memori: " + Redmi.memori + " GB");
        System.out.println("Kapasitas Baterai: " + Redmi.baterai);
        
        System.out.println("\nInformasi Xiaomi:");
        System.out.println("Nama: " + Xiaomi.nama);
        System.out.println("Seri: " + Xiaomi.seri);
        System.out.println("RAM: " + Xiaomi.ram + " GB");
        System.out.println("Memori: " + Xiaomi.memori + " GB");
        System.out.println("Kapasitas Baterai: " + Xiaomi.baterai);
        
        System.out.println("\nInformasi Oppo:");
        System.out.println("Nama: " + Oppo.nama);
        System.out.println("Seri: " + Oppo.seri);
        System.out.println("RAM: " + Oppo.ram + " GB");
        System.out.println("Memori: " + Oppo.memori + " GB");
        System.out.println("Kapasitas Baterai: " + Oppo.baterai);
    }
}
