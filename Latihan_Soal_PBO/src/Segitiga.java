public class Segitiga {
  double alas, tinggi, sisi_a, sisi_b, sisi_c;

  public double hitungLuas(double alas, double tinggi) {
    return 0.5 * alas * tinggi;
  }

  public double hitungKeliling(double sisi_a, double sisi_b, double sisi_c) {
    return sisi_a + sisi_b + sisi_c;
  }

  public static void main(String[] args) {
    Segitiga segitiga = new Segitiga();
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

  }
}
