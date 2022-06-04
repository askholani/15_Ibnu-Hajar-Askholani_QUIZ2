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

   public boolean isEmpty () {
      return headPs == null && headPb == null;
   }

   public void add (Pembeli_11 pb ,Pesanan_11 ps) {
      if (isEmpty() ) {
         headPb = new Node (null ,pb ,null);
         headPs = new Node (null ,pb ,null);
      } else {
         Node newNodePb = new Node (headPb , pb ,null);
         Node newNodePs = new Node (headPs , ps ,null);
         headPb.prev = newNodePb;
         headPs.prev = newNodePs;
      }
      size++;
   }

   public void cetak () {
      if (!isEmpty() ) {
         Node tmp = headPb;
         int numb = 1;
         while (tmp != null) {
            System.out.println(numb + "   " + tmp.pembeli.namaPembeli + "   " + tmp.pembeli.NoHP);
            tmp = tmp.next;
         }
         System.out.println("Total Antrian : " + size);
      }
   }

   public void hapus () throws ArrayIndexOutOfBoundsException {
      if (isEmpty() ) {
         throw new ArrayIndexOutOfBoundsException("Antrian masih kosong");
      } else {
         headPb = headPb.next;
         headPb.prev = null;
         size--;
      }
   }

   // public void sortPesananByName () {
   //    String [] sortPs;
   //    sortPs[size];
   //    Node current = headPs;
   //    for (int i = 0 ; i < size ; i++) {
   //       sortPs[i] = current.pesanan.namaPesanan;
   //       current = current.next;
   //    }
   //    Arrays.sort(sortPs);


   // }

   public int hitung () {
      int total = 0;
      Node current = headPs;
      while(current.next != null) {
         total += current.pesanan.harga;
         current = current.next;
      }
      return total;
   }

}
