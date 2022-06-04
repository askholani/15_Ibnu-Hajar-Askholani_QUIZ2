import java.util.Scanner;
public class DLLMain {
   public static void menu () {
      System.out.println("Menu:");
      System.out.println("1. Tambah Antrian");
      System.out.println("2. Cetak Antrian");
      System.out.println("3. Hapus Antrian");
      System.out.println("4. Laporan Pengurutan pesanan");
      System.out.println("5. Hitung total pendapatan");
      System.out.println("6. Keluar");
   }
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("==================== Quiz 2 Praktikum ASD TI - 1F ====================");
      String name = "Ibnu Hajar Askholani";
      String nim = "2141720170";
      String absen = "11 / 15";
      System.out.println("dibuat oleh : " + name);
      System.out.println("NIM : " + nim);
      System.out.println("Absen : " + absen);

      String np1 = "Mamluatul";
      String np11 = "082245000000";
      String np2 = "Abyaz A.M";
      String np22 = "082245111111";
      String np3 = "Yoshinoya";
      String np33 = "082245222222";
      String np4 = "Susi Susanti";
      String np44 = "081234456";

      String nps1 = "Bugologi";
      int nps11 = 25000;
      String nps2 = "Mie Goreng";
      int nps22 = 15000;
      String nps3 = "Nasi Rendang";
      int nps33 = 25000;
      String nps4 = "Soto Ayam";
      int nps44 = 15000;

      DoubleLinkedList m = new DoubleLinkedList();
      Pembeli_11 pb1 = new Pembeli_11(np1, np11);
      Pembeli_11 pb2 = new Pembeli_11(np2, np22);
      Pembeli_11 pb3 = new Pembeli_11(np3, np33);
      Pembeli_11 pb4 = new Pembeli_11(np4, np44);

      Pesanan_11 ps1 = new Pesanan_11(1, nps1, nps11);
      Pesanan_11 ps2 = new Pesanan_11(2, nps2, nps22);
      Pesanan_11 ps3 = new Pesanan_11(3, nps3, nps33);
      Pesanan_11 ps4 = new Pesanan_11(4, nps4, nps44);

      m.add(pb1, ps1);
      m.add(pb2, ps2);
      m.add(pb3, ps3);
      m.add(pb4, ps4);

      m.cetak();

   }
}
