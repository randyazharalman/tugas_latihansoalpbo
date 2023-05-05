public class Mahasiswa{
  String nama, NIM;

  public String getNama(){
    return nama;
  }
  public String getNim(){
    return NIM;
  }
  public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa();
    mhs.nama = "Randy";
    mhs.NIM = "C2083207014";
    System.out.println("Nama: " + mhs.getNama());
    System.out.println("NIM: " +mhs.getNim());

  }
}
