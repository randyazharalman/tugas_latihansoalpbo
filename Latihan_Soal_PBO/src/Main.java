
public class Main {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    Mahasiswa mhs2 = new Mahasiswa();
    Segitiga segitiga = new Segitiga();
    Kucing kucing1 = new Kucing("Oyen", 4, "Jalanan");
    Kucing kucing2 = new Kucing("Blacky", 3, "Jalanan");

    System.out.println("\n=============================================\n");
    mhs1.nama = "Randy";
    mhs1.NIM = "C2083207014";
    System.out.println("Nama: " + mhs1.getNama());
    System.out.println("NIM: " + mhs1.getNim());
    mhs2.nama = "Azhar";
    mhs2.NIM = "C2083207000";
    System.out.println("Nama: " + mhs1.getNama());
    System.out.println("NIM: " + mhs1.getNim());
    System.out.println("\n=============================================\n");

    segitiga.alas = 5;
    segitiga.tinggi = 10;
    segitiga.sisi_a = 5;
    segitiga.sisi_b = 5;
    segitiga.sisi_c = 5;
    System.out.println("Luas Segitiga dari Alas " + segitiga.alas + " dan Tinggi " + segitiga.tinggi + " adalah "
        + segitiga.hitungLuas(segitiga.alas, segitiga.tinggi));
    System.out.println("Keliling Segitiga dari sisi a = " + segitiga.sisi_a + " + sisi b = " + segitiga.sisi_b
        + " + sisi c = " + segitiga.sisi_c + " adalah "
        + segitiga.hitungKeliling(segitiga.sisi_a, segitiga.sisi_b, segitiga.sisi_c));

    System.out.println("\n=============================================\n");
    kucing1.tidur();
    kucing1.makan("ikan");

    kucing2.tidur();
    kucing2.makan("ayam");
    System.out.println("\n=============================================\n");

  }
}
