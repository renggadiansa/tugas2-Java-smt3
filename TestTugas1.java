public class TestTugas1 {

    public static class Tabungan {
        int saldo;
        public Tabungan(int initsaldo){
            saldo = initsaldo;
        }
        public int getSaldo(){
            return saldo;
        }
        public void simpanUang(int jumlah){
            saldo = saldo + jumlah;
        }
        public boolean ambilUang(int jumlah){
            if (saldo >= jumlah){
                saldo = saldo - jumlah;
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main (String srt[]){
        boolean status;
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal :"+tabungan.getSaldo());
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status = tabungan.ambilUang(6000);
        System.out.println("Jumlah uang yang diambil : 6000");
        if (status)
        System.out.println("Ok");
        else
        System.out.println("Gagal");
        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan :3500");
        status = tabungan.ambilUang(4000);
        System.out.println("Jumlah uang yang diambil : 4000");
        if (status)
        System.out.println("Ok");
        else
        System.out.println("Gagal");
        status = tabungan.ambilUang(1600);
        System.out.println("Jumlah uang yang diambil : 1600");
        if (status)
        System.out.println("Ok");
        else
        System.out.println("Gagal");
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan :2000");
        System.out.println("Saldo sekarang = " + tabungan.getSaldo());
    }
}
