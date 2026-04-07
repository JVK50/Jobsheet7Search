package Praktikum5;

public class mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    mahasiswa13() {
    }

    // Konstruktor berparameter
    mahasiswa13(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilinformasi() {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
