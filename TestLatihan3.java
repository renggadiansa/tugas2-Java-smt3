public class TestLatihan3 {

    public static class Truk {
        double muatan;
        double muatanMaks;
        public Truk(double muatanMaks){
            this.muatanMaks = muatanMaks;
        }
        public double getMuatan(){
            return muatan;
        }
        public double getMuatanMaks(){
            return muatanMaks;
        }
        public void tambahMuatan(double berat){
            if ((muatan + berat) <= muatanMaks){
                muatan = muatan + berat;
            }
        }
    }
    
    public static void main(String args[]){
        Truk truk = new Truk(1000);
        System.out.println("Muatan maksimal = "+truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500 ");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan : 350 ");
        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan : 100 ");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150 ");
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
}