import java.util.Scanner;

class Userlogin {
    public class admin{
         String Username;
         int Password;
    }
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nFormat\nAdminxxx\nPasswordxxx");
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("\nMasukkan password: ");
        String password = input.nextLine();

        String nimAkhir = "064";
        String validUsername = "Admin" + nimAkhir;
        String validPassword = "Password" + nimAkhir;

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login anda gagal! Username atau pasaword salah");
        }

    }
    public class mahasiswa{
        String Username;
        int Password;
    }

    public void login(){

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            login();
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            String validNama = "rezha rivai";
            String validNim = "202410370110064";

            if (nama.equals(validNama) && nim.equals(validNim)) {
                System.out.println();
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Not Found");
        }
        input.close();
    }
}
