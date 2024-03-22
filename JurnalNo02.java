import java.util.Scanner;

public class JurnalNo02 {

    public static void main(String[] args) {
         ProgramQueue<String> queue = new ProgramQueue<>();
            // queue.enqueue(3);
            // queue.enqueue(2);
            // queue.enqueue(4);
            // queue.enqueue(6);
            // queue.dequeue();
            // queue.dequeue();

            // queue.viewQueue();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1. Menambahkan Data \n 2. Menghapus Data \n 3. Lihat Data \n 4. Keluar");
                System.out.print("Pilih menu: ");
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        System.out.print("Masukkan data: ");
                        String data = scanner.nextLine();
                        queue.enqueue(data);
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        queue.viewQueue();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Menu tidak tersedia");
                        break;
                }

            }
    }
}