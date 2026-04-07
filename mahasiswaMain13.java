package Praktikum5;

import java.util.Scanner;

public class mahasiswaMain13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Mengkonsumsi newline
        
        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13(jumlah);
        
        // Input data mahasiswa secara dinamis
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n===== Input Data Mahasiswa " + (i + 1) + " =====");
            
            System.out.print("NIM: ");
            String nim = input.nextLine();
            
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine(); // Mengkonsumsi newline
            
            mahasiswa13 m = new mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        System.out.println("\n\n====== Data mahasiswa sebelum sorting: ======");
        list.tampil();
        
        System.out.println("\n====== Data mahasiswa setelah sorting berdasarkan IPK (DESC): ======");
        list.bubbleSort();
        list.tampil();
        
        input.close();
    }
}

class MahasiswaDemo13 {
    public static void main(String[] args) {
        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13(5);
        mahasiswa13 m1 = new mahasiswa13("123", "Zidan", "2A", 3.2);
        mahasiswa13 m2 = new mahasiswa13("124", "Ayu", "2A", 3.5);
        mahasiswa13 m3 = new mahasiswa13("125", "Sofi", "2A", 3.1);
        mahasiswa13 m4 = new mahasiswa13("126", "Sita", "2A", 3.9);
        mahasiswa13 m5 = new mahasiswa13("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data yang sudah terutur menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terutur menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
