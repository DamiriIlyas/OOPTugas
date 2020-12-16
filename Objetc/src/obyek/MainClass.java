package obyek;
 
public class MainClass {
    
    public static void main(String[] args) {
        Teman Elang = new Teman("Elang");
        Teman Kucing = new Teman("Kucing");
        
        Elang.beratTeman(5);
        Elang.jumlahKakiTeman(2);
        Elang.cetakTeman();
        
        Kucing.beratTeman(2);
        Kucing.jumlahKakiTeman(4);
        Kucing.cetakTeman();
    }
}