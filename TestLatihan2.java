public class TestLatihan2 {

    public static class Mahasiswa {
        int nrp;
        String nama;
        public Mahasiswa(int nrp, String nama){
            this.nrp = nrp;
            this.nama = nama;
        }
        public int getNrp(){
            return nrp;
        }
        public String getnama(){
            return nama;
        }
    }
    
    public static void main(String args[]){
        Mahasiswa mhs = new Mahasiswa(12345, "Jono");
        System.out.println("NRP : " + mhs.getNrp());
        System.out.println("Nama : " + mhs.getnama());
    }
}
