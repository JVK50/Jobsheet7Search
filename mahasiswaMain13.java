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
        Scanner sc = new Scanner(System.in);
        int jumlahMhs = 5;
        
        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13(jumlahMhs);
        
        // Array pilihan IPK yang tersedia
        double[] ipkOptions = {3.0, 3.1, 3.2, 3.5, 3.7, 3.9};
        
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            
            System.out.println("Pilih IPK:");
            for (int j = 0; j < ipkOptions.length; j++) {
                System.out.println((j + 1) + ". " + ipkOptions[j]);
            }
            System.out.print("Pilihan (1-" + ipkOptions.length + ") : ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            double ipk = ipkOptions[pilihan - 1];
            
            mahasiswa13 m = new mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        System.out.println("\n=============================");
        System.out.println("Pencarian data Binary");
        System.out.println("=============================");
        System.out.println("Mengurutkan data terlebih dahulu (ASC)");
        list.selectionSort();
        list.tampil();
        
        System.out.println("\nPilih IPK mahasiswa yang dicari:");
        for (int j = 0; j < ipkOptions.length; j++) {
            System.out.println((j + 1) + ". " + ipkOptions[j]);
        }
        System.out.print("Pilihan (1-" + ipkOptions.length + ") : ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        
        double cari = ipkOptions[pilihan - 1];
        System.out.println("\nMenggunakan binary searching");
        
        int posisiFound = list.findBinarySearch(cari, 0, jumlahMhs - 1);
        int[] allPositions = list.findAllOccurrences(cari, posisiFound);
        
        if (allPositions.length > 0) {
            System.out.println("Data mahasiswa dengan IPK " + cari + " ditemukan pada indeks: ");
            for (int i = 0; i < allPositions.length; i++) {
                System.out.print(allPositions[i]);
                if (i < allPositions.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
        list.tampilAllDataSearch(cari, allPositions);
        sc.close();
    }
}
