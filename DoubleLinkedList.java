import java.rmi.Remote;
import java.util.Arrays;
public class DoubleLinkedList {
   Node headPb;
   Node headPs;
   int size;

   DoubleLinkedList () {
      headPb = null;
      headPs = null;
      size = 0;
   }

   public void addFirstPb (Pembeli_11 pb) {
      if (headPb == null ) {
         headPb = new Node (null ,pb ,null);
      } else {
         Node newNodepb = new Node(null, pb, headPb);
         headPb.next =newNodepb;
      }
   }

   public void addFirstPs (Pesanan_11 ps) {
      if (headPs == null ) {
         headPs = new Node(null ,ps ,null);
      } else {
         Node newNodePs = new Node(null, ps, null);
         headPs.next = newNodePs;
      }
   }

   
   public void addPb (int urutan ,Pembeli_11 pb ) throws ArrayIndexOutOfBoundsException {
      if (headPb == null ) {
         addFirstPb(pb);
      } else if (urutan - 1 < 0 || urutan-1 > size) {
         throw new ArrayIndexOutOfBoundsException("NIlai urutan di luar batas");
      } else {
         Node currentPb = headPb;
         int i = 1;
         while (i < urutan-1) {
            currentPb = currentPb.next;
            i++;
         }
         if (currentPb.prev == null) {
            Node newNodePb = new Node(currentPb , pb, null);
            currentPb.next = newNodePb;
         } else {
            Node newNodePb = new Node(currentPb, pb, null);
            currentPb.next = newNodePb;
         }
      }
      size++;
   }

   public void addPs (int urutan ,Pesanan_11 ps ) throws ArrayIndexOutOfBoundsException {
      if (headPs == null ) {
         addFirstPs(ps);
      } else if (urutan - 1 < 0 ) {
         throw new ArrayIndexOutOfBoundsException("nomer pesanan di luar batas");
      } else {
         Node currentPs = headPs;
         int i = 1;
         while (i < urutan-1) {
            currentPs = currentPs.next;
            i++;
         }
         if (currentPs.prev == null) {
            Node newNodePs = new Node(currentPs , ps, null);
            currentPs.next = newNodePs;
         } else {
            Node newNodePs = new Node(currentPs, ps, null);
            currentPs.next = newNodePs;
         }
      }
   }



   public void cetak () {
      if (!(headPb == null) ) {
         Node tmp = headPb;
         int numb = 1;
         while (tmp != null) {
            System.out.println(numb + "   " + tmp.pembeli.namaPembeli + "   " + tmp.pembeli.NoHP);
            tmp = tmp.next;
         }
         System.out.println("Total Antrian : " + size);
      }
   }

   public void cetak1 () {
      if(!(headPs == null)) {
         Node tmp = headPs;
         while(tmp != null) {
            System.out.println(tmp.pesanan.kodePesanan + "   " + tmp.pesanan.namaPesanan + "   " + tmp.pesanan.harga);
            tmp = tmp.next;
         }
      }
   }

   public void hapus () throws ArrayIndexOutOfBoundsException {
      if (headPb == null) {
         throw new ArrayIndexOutOfBoundsException("antrian masih kosong");
      } else {
         System.out.println(headPb.pembeli.namaPembeli + " telah memesan menu");
         System.out.println("+++++++++++++++++++++++++++");
         System.out.println("Transaksi Input Pesanan");
         System.out.println("+++++++++++++++++++++++++++");
         System.out.println("Nomor Pesanan : " + headPs.pesanan.kodePesanan);
         System.out.println("Pesanan : " + headPs.pesanan.namaPesanan);
         System.out.println("Harga : " + headPs.pesanan.harga);
         headPb = headPb.next;
         headPb.prev = null;
         headPs = headPs.next;
         headPs.prev = null;
      }
   }



   public int hitung () {
      int total = 0;
      Node current = headPs;
      while(current != null) {
         total += current.pesanan.harga;
         current = current.next;
      }
      return total;
   }

}
