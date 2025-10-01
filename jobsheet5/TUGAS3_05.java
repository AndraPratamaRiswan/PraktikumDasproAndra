package jobsheet5;
import java.util.Scanner;
public class TUGAS3_05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Pengguna : ");
        String pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("dosen")){
            System.out.println("Akses diberikan");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")){
            System.out.print("Masukan Jumlah SKS : ");
            int sks = sc.nextInt();
            if (sks >= 12){
                System.out.println("Akses diberikan");
            }else {
                System.out.println("Akses ditolak");
            }
        }
    }
}