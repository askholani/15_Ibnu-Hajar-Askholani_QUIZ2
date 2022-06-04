public class Node {
   Node prev ,next;
   Pembeli_11 pembeli;
   Pesanan_11 pesanan;

   Node (Node p ,Pembeli_11 c ,Node n) {
      pembeli = c;
      prev = p;
      next = n;
   }

   Node (Node p , Pesanan_11 c , Node n) {
      pesanan = c;
      prev = p;
      next = n;
   }
}
