//Driver Class
import java.util.Scanner;

public class TesSiswa{  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
        //membuat obyek
        Siswa adi = new Siswa();
        Siswa lia = new Siswa();

        Siswa ria = new Siswa(10, "Dara", 50);
        Siswa cahya= new Siswa(40,"Cahya",4);
        
        adi.setID(100);
        adi.setNama("Adi");
        adi.setIpk(4);
        System.out.println("Ini Data Adi");
        adi.print();

        lia.setID(100);
        lia.setNama("Lia");
        lia.setIpk(5);
        System.out.println("Ini Data Lia");
        lia.print();

        ria.setID(20);
        ria.setNama("Ria");
        ria.setIpk(4);
        System.out.println("Ini Data Ria");
        ria.print();

        cahya.setID(40);
        cahya.setNama("Cahya");
        cahya.setIpk(5);
        System.out.println("Ini data Cahya");
        cahya.print();
        System.out.println(ria.print2());
    }                
}
