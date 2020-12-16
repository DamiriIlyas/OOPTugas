package obyek;
 
public class Teman {
    String nama;
    int berat;
    int jumlahKaki;
    // Ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Teman(String namaTeman) {
        nama = namaTeman;
    }
    public void beratTeman(int beratTeman) {
        berat = beratTeman;
    }
    public void jumlahKakiTeman(int jumlahKakiTeman) {
        jumlahKaki = jumlahKaki;
    }
 
    public void cetakTeman() {
        System.out.println("Nama teman : " + nama);
        System.out.println("Berat teman : " + berat + " kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }
}