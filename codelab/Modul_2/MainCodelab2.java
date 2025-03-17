import java.text.DecimalFormat;

class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    DecimalFormat desfor = new DecimalFormat("0.00");

 RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Saldo : Rp." + desfor.format(saldo));
        System.out.println();
    }


    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor uang: Rp" + desfor.format(jumlah) + " | Saldo sekarang: Rp" + desfor.format(saldo));
    }


    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik uang: Rp" + desfor.format(jumlah) + " | Saldo sekarang: Rp." + desfor.format(saldo));
        } else {
            System.out.println("(Gagal, saldo tidak mencukupi!)");
        }
    }
}

public class MainCodelab2 {
    public static void main(String[] args) {
        RekeningBank firstRekening = new RekeningBank("202410370110064", "Rezha Rivai", 20000000);
        RekeningBank secondRekening = new RekeningBank("123456789101112", "anonymous", 30000000);

        System.out.println("Rekening 1");
        firstRekening.tampilkanInfo();

        System.out.println("Rekening 2");
        secondRekening.tampilkanInfo();

        System.out.println("Info setor uang");
        firstRekening.setorUang(5000000);
        secondRekening.setorUang(10000000);
        System.out.println();

        System.out.println("Info tarik uang");
        firstRekening.tarikUang(10000000);
        secondRekening.tarikUang(5000000);
        System.out.println();

        System.out.println("Data Setelah Trankssaksi ");
        firstRekening.tampilkanInfo();
        secondRekening.tampilkanInfo();
    }
}
