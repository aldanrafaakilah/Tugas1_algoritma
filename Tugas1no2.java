//TUGAS 1 NOMER 2
import java.util.Scanner;
public class Tugas1no2 {
    public static void main(String[] args) {
        // Membuat Scanner untuk mengambil inputan yang berasal dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Memasukan jumalah data dari pengguna
        System.out.print("Masukan jumlah data : ");
        // Memasukan inputan yang telah diberikan dari keyboard pada variabel jumdat
        int jumdat = input.nextInt();
        
        // Membuat array menggunakan Tipe Data String dengan nama variabel "namaMahasiswa"
        String[] namaMahasiswa = new String[jumdat];
        // Membuat array menggunakan Tipe Data integer dengan nama variabel "nilaiUTS"
        int[] nilaiUTS = new int[jumdat];
        // Membuat array menggunakan Tipe Data integer dengan nama variabel "nilaiUAS"
        int[] nilaiUAS = new int[jumdat];
        // Membuat array menggunakan Tipe Data integer dengan nama variabel "total" dan memberikan nilai awal 0
        int total = 0;
        // Membuat array menggunakan Tipe Data double dengan nama variabel "rata" dan memberikan nilai awal 0
        double rata = 0;
        
        // Meminta input dari data pengguna
        for (int a = 0; a < jumdat; a++){
            System.out.println("Jumlah Data ke-" + (a + 1));
            
            // Menampilkan output Nama:
            System.out.print("Nama: ");
            // Memasukan inputan yang telah diberikan dari keyboard pada variabel nama
            namaMahasiswa[a] = input.next();
            
            // Menampilkan output Nilai UTS:
            System.out.print("Nilai UTS: ");
            // Memasukan inputan yang telah diberikan dari keyboard pada variabel nialiUTS
            nilaiUTS[a] = input.nextInt();
            
            // Menampilakan output Nilai UAS:
            System.out.print("Nilai UAS: ");
            // // Memasukan inputan yang telah diberikan dari keyboard pada variabel nilaiUAS
            nilaiUAS[a] = input.nextInt();
           
        }
        // Menghitung total nilai
        for (int a = 0; a < jumdat; a++) {
            total = nilaiUTS[a] + nilaiUAS[a];
            // Menghitung Rata Rata
            rata = total / 2;
            
        // Menamapilkan output Keterangan Tabel
        System.out.println("No\tNama\tUTS\tUAS\ttotal\tRata-Rata");
        // Menampilkan output Garis Pembatas
        System.out.println("=================================================");
        // Menampilakan output Hasil Akhir Dari Inputan Yang Telah Di Berikan
        System.out.println((a+1)+"\t"+namaMahasiswa[a]+"\t"+nilaiUTS[a]+"\t"+nilaiUAS[a]+"\t"+total+"\t"+rata);
        }       
    }
}