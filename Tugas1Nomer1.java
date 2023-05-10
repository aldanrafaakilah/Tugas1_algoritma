package tugassebelumuts;
import java.util.Scanner;
public class Tugas1Nomer1 {
    public static void main(String[] args) {
        //Membuat dan menyatakan variabel jumlahm sebagai integer
        int jumlahm;
        //Membuat dan menyatakan variabel totalnilai sebagai integer dengan nilai awal 0
        int totalnilai=0;
        //Membuat dan menyatakan variabel rataratan sebagai double
        double rataratan;
        //Membuat scanner untuk mengambil input an yang berasal dari keyboard
        Scanner keyboard=new Scanner(System.in);
        
        //Menampilkan "Masukkan jumlah mahasiswa: " pada output
        System.out.print("Masukkan jumlah mahasiswa: ");
        //Memasukan input an yang telah diberikan dari keyboard pada variabel jumlahm
        jumlahm=keyboard.nextInt();
        
        //Membuat array nama dengan tipe data string
        String[] nama=new String[jumlahm];
        //Membuat array nilai dengan tipe data integer
        int[] nilai=new int[jumlahm];
        //Perulangan for yang berfungsi untuk mengulang input an nama dan nilai sesuai dengan jumlah array nama
        for (int a=0; a<nama.length; a++){
            //Menampilkan "Nama: " pada output
            System.out.print("Nama: ");
            //Memasukan input an yang telah diberikan dari keyboard pada variabel nama[a]
            nama[a]=keyboard.next();
            //Menampilkan "Nilai: " pada output
            System.out.print("Nilai: ");
            //Memasukan input an yang telah diberikan dari keyboard pada variabel nilai[a]
            nilai[a]=keyboard.nextInt();
            //Menjumlahkan seluruh nilai yang berada pada indeks array nilai dan memasukkan total nilai tersebut ke dalam variabel totalnilai
            totalnilai+=nilai[a];
        }
        
        //Menampilkan "Total nilai mahasiswa: " beserta variabel totalnilai pada output
        System.out.println("Total nilai mahasiswa: "+totalnilai);
        /*Menghitung rata rata nilai dari seluruh mahasiswa dengan cara membagi variabel totalnilai dengan variabel jumlahm
        lalu memasukkan hasil pembagian tersebut ke variabel rataratan*/
        rataratan=totalnilai/jumlahm;
        //Menampilkan "Rata rata nilai mahasiswa: " beserta variabel rataratan pada output
        System.out.println("Rata rata nilai mahasiswa: "+rataratan);
    }
    
}
