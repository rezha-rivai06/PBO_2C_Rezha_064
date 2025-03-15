

class Hewan{
 String Nama;
 String Jenis;
 String Suara;

 Hewan(String Nama, String Jenis, String Suara){
  this.Nama = Nama;
  this.Jenis = Jenis;
  this.Suara = Suara;
 }
 void tampilkaninfo(){
  System.out.println("Nama : "+Nama);
  System.out.println("Jenis : "+Jenis);
  System.out.println("Suara : "+Suara);
  System.out.println();
 }
}

public class MainCodelab1{
 public static void main(String[] args) {
    Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
    Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");
    System.out.print("\"Data Hewan\"\n");
    hewan1.tampilkaninfo();
    hewan2.tampilkaninfo();
 }
}