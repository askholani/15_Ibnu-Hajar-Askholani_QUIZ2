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
      System.out.print("pilih (1-5) : ");
   }
   public static void main(String[] args) {
      System.out.println("==================== Quiz 2 Praktikum ASD TI - 1F ====================");
      String name = "Ibnu Hajar Askholani";
      String nim = "2141720170";
      String absen = "11 / 15";
      System.out.println("dibuat oleh : " + name);
      System.out.println("NIM : " + nim);
      System.out.println("Absen : " + absen);

      Scanner s = new Scanner(System.in);
      DoubleLinkedList m = new DoubleLinkedList();
      boolean again = true;
      menu();
      int pilih = s.nextInt();
      while (again) {
         while (again) {
            if (pilih == 1) {
               System.out.println("=============================");
               System.out.println("Masukkan Data Pembeli");
               System.out.println("=============================");

               String np1 = "Mamluatul";
               String np11 = "082245000000";
               String np2 = "Abyaz A.M";
               String np22 = "082245111111";
               String np3 = "Yoshinoya";
               String np33 = "082245222222";
               String np4 = "Susi Susanti";
               String np44 = "081234456";

            Pembeli_11 pb1 = new Pembeli_11(np1, np11);
            Pembeli_11 pb2 = new Pembeli_11(np2, np22);
            Pembeli_11 pb3 = new Pembeli_11(np3, np33);
            Pembeli_11 pb4 = new Pembeli_11(np4, np44);

            m.addPb(1, pb1);
            m.addPb(2, pb2);
            m.addPb(3, pb3);
            m.addPb(4, pb4);

               menu();
            }  else if (pilih == 2) {
               System.out.println("+++++++++++++++++++++++++++++++");
               System.out.println("Daftar Antrian Resto Royal Delish");
               System.out.println("+++++++++++++++++++++++++++++++");
               m.cetak();

               String nps1 = "Bugologi";
               int nps11 = 25000;
               String nps2 = "Mie Goreng";
               int nps22 = 15000;
               String nps3 = "Nasi Rendang";
               int nps33 = 25000;
               String nps4 = "Soto Ayam";
               int nps44 = 15000;

               Pesanan_11 ps1 = new Pesanan_11(1, nps1, nps11);
               Pesanan_11 ps2 = new Pesanan_11(2, nps2, nps22);
               Pesanan_11 ps3 = new Pesanan_11(3, nps3, nps33);
               Pesanan_11 ps4 = new Pesanan_11(4, nps4, nps44);      
               
               m.addPs(1, ps1);
               m.addPs(2, ps2);
               m.addPs(3, ps3);
               m.addPs(4, ps4);
               menu();
            } else if (pilih == 3) {
               m.hapus();
               menu();
            } else if (pilih  == 4) {
               m.cetak1();
               menu();
            } else if (pilih == 5) {
               System.out.println(m.hitung());
               menu();
            } else {
               again =false;
               break;
            }
            pilih = s.nextInt();
         }
      }


      // System.out.println("==================== Quiz 2 Praktikum ASD TI - 1F ====================");
      // String name = "Ibnu Hajar Askholani";
      // String nim = "2141720170";
      // String absen = "11 / 15";
      // System.out.println("dibuat oleh : " + name);
      // System.out.println("NIM : " + nim);
      // System.out.println("Absen : " + absen);

      // String np1 = "Mamluatul";
      // String np11 = "082245000000";
      // String np2 = "Abyaz A.M";
      // String np22 = "082245111111";
      // String np3 = "Yoshinoya";
      // String np33 = "082245222222";
      // String np4 = "Susi Susanti";
      // String np44 = "081234456";

      // String nps1 = "Bugologi";
      // int nps11 = 25000;
      // String nps2 = "Mie Goreng";
      // int nps22 = 15000;
      // String nps3 = "Nasi Rendang";
      // int nps33 = 25000;
      // String nps4 = "Soto Ayam";
      // int nps44 = 15000;

      // DoubleLinkedList m = new DoubleLinkedList();
      // Pembeli_11 pb1 = new Pembeli_11(np1, np11);
      // Pembeli_11 pb2 = new Pembeli_11(np2, np22);
      // Pembeli_11 pb3 = new Pembeli_11(np3, np33);
      // Pembeli_11 pb4 = new Pembeli_11(np4, np44);

      // Pesanan_11 ps1 = new Pesanan_11(1, nps1, nps11);
      // Pesanan_11 ps2 = new Pesanan_11(2, nps2, nps22);
      // Pesanan_11 ps3 = new Pesanan_11(3, nps3, nps33);
      // Pesanan_11 ps4 = new Pesanan_11(4, nps4, nps44);      
      
      // m.addPs(1, ps1);
      // m.addPs(2, ps2);
      // m.addPs(3, ps3);
      // m.addPs(4, ps4);
   }
}
