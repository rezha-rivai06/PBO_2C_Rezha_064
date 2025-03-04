import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = input.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = input.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String jenisKelaminOutput;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminOutput = "Laki-Laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminOutput = "Perempuan";
        } else {
            jenisKelaminOutput = "Tidak Diketahui";
        }

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminOutput);
        System.out.println("Umur          : " + umur + " tahun");

        input.close(); // Menutup Scanner
    }
}
