import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nDepan, nBelakang, NPM;
  int jumlahSks;
  double IPK;
  
  System.out.println("*****Masukkan Data Anda dengan Benar!*****");
  System.out.print("Nama depan                    : ");
  nDepan = scanner.nextLine();
  System.out.print("Nama belakang                 : ");
  nBelakang = scanner.nextLine();
  System.out.print("NPM                           : ");
  NPM = scanner.nextLine();
  System.out.print("Jumlah SKS yang sudah ditempuh: ");
  jumlahSks = scanner.nextInt();
  System.out.print("Masukkan IPK sementara        : ");
  IPK = scanner.nextDouble();
  double jumlah = IPK * jumlahSks;
  
  System.out.println();
  System.out.println();
  System.out.println();
  System.out.println("======================================");
  System.out.println("             Data Mahasiwa            ");
  System.out.println("======================================");
  System.out.println("Nama Lengkap : "+nDepan+" "+nBelakang);
  System.out.println("NPM          : "+NPM);
  System.out.println("Total Nilai  : "+jumlah);
  System.out.println("======================================");
 }
}


