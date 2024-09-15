public class Main {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Rengga";
        student1.age = 20;
        student1.study();
        System.out.println("Umur "+ student1.name + " " + student1.age + " tahun");
        
        Students student2 = new Students();
        student2.name = "Budi";
        student2.age = 22;
        student2.study();
        System.out.println("Umur "+ student2.name + " " + student2.age + " tahun");
    
    }
    
}
