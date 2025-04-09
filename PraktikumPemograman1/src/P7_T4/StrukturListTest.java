package P7_T4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen di awal list
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);

        // List sekarang:
        System.out.print("List awal: ");
        list.displayList();

        // Hapus elemen terakhir
        list.removeTail(); 
        System.out.print("Setelah removeTail: ");
        list.displayList();

        // Hapus elemen pertama
        list.removeHead(); 
        System.out.print("Setelah removeHead: ");
        list.displayList();

        // Hapus elemen terakhir
        list.removeTail(); 
        System.out.print("Setelah removeTail lagi: ");
        list.displayList(); 
    }
}