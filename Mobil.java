public class Mobil {
    String Merk;
    String Warna;
    String Type;
    int CC;
    int Umur;
    
    public Mobil(String Merk, String Warna, String Type, int CC, int Umur) {
        this.Merk = Merk;
        this.Warna = Warna;
        this.Type = Type;
        this.CC = CC;
        this.Umur = Umur;
    }

    public void infoMobil() {
        System.out.println("Merk: " + Merk);
        System.out.println("Warna: " + Warna);
        System.out.println("Tipe: " + Type);
        System.out.println("Kapasitas Mesin: " + CC + " cc");
        System.out.println("Umur: " + Umur + " Tahun");
        System.out.println();
    }
}
