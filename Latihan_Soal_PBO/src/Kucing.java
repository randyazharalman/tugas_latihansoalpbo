public class Kucing {
  String nama, ras;
  int umur;
  //Constructor 
  Kucing(String nama, int umur, String ras){
    this.nama = nama;
    this.umur = umur;
    this.ras = ras;
  }

  public void tidur(){
    System.out.println(nama + " Sedang Tidur");
  }

  public void makan(String makanan){
    System.out.println(nama +" sedang memakan "+ makanan);
  }
  public static void main(String[] args) {
    Kucing kucing1 = new Kucing("Oyen", 4, "Jalanan");
    Kucing kucing2 = new Kucing("Blacky", 3, "Jalanan");

    kucing1.tidur();
    kucing1.makan("ikan");

    kucing2.tidur();
    kucing2.makan("ayam");
    
  }
}
