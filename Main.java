import koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;
import model.Kelas;
import model.JadwalKuliah;

public class Main{
 public static void main(String [] args){
  System.out.println("Ini program main");
  Database.hubungkan();
  Dosen.tampilanInfo();
  Mahasiswa.tampilanInfo();
  MataKuliah.tampilanInfo();
  Kelas.tampilanInfo();
  JadwalKuliah.tampilanInfo();
 }
}

