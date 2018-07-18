package produk;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String i="y";
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Produk Toko Veganesia");
            System.out.println("==================");
            System.out.println("1. Makanan");
            System.out.println("2. Pakaian");
            System.out.print("Masukkan pilihan anda : ");

            int pilihan = input.nextInt();
            int inputProduk;

            // Memasukkan Data
            Pakaian kaos = new Pakaian("T-shirt", "Friends Not Food", 250, "M", "Black", 150000);
            Pakaian polo = new Pakaian("Polo", "Plant Based Power", 300, "L", "Tosca", 175000);

            Makanan snack = new Makanan("Snack", "LH Natural Almond 250", 300, "Natural Almond 250 gram", "Almond", 72000);
            Makanan bumbu = new Makanan("Bumbu", "Vege Jawi Rendang", 10, "Cabe, Pala, Kapulaga, Merica, Rempah - rempah.", "-", 18500);

            // Memproses Data
            if (pilihan == 1) {
                System.out.println("________________________________________");
                System.out.println("No\tKategori\tNama\t\t\tUkuran\tWarna\tHarga");
                System.out.println("========================================");

                System.out.print("1\t");
                kaos.infoPakaian();

                System.out.print("2\t");
                polo.infoPakaian();

                System.out.println("___________________________________________________");
                System.out.println("Mendapat potongan harga jika pembelian di atas 3");
                System.out.println("===================================================");
                System.out.print("Masukkan Pilihan nomor: ");
                inputProduk = input.nextInt();
                System.out.print("masukkan jumlah Pakaian: ");
                int jmlk = input.nextInt();

                fn_pakaian(jmlk, (int) kaos.getHarga(), inputProduk, kaos, polo);

            } else if (pilihan == 2) {
            System.out.println("________________________________________");
                System.out.println("No \t Kategori \t Nama \t\t\t Rasa \t Harga");
                System.out.println("========================================");

                System.out.print("1\t");
                snack.infoMakanan();
                System.out.print("2\t");
                bumbu.infoMakanan();
                
                System.out.println("___________________________________________________");
                System.out.println("Mendapat potongan harga jika pembelian di atas 3");
                System.out.println("===================================================");
                System.out.print("Masukkan Pilihan nomor: ");
                inputProduk = input.nextInt();
                System.out.print("masukkan jumlah Makanan: ");
                int jmlkem = input.nextInt();
                fn_makanan(jmlkem, (int) snack.getHarga(), inputProduk, snack, bumbu);

            }

            System.out.print("ingin belanja lagi? y/n : ");
            i = input.next();

        } while(i.equalsIgnoreCase("y"));

        System.out.println(".: TERIMA KASIH :.");
    }




    public static void fn_pakaian(int jmlk, int uang, int inputProduk, Pakaian kaos, Pakaian polo)
    {
        if (inputProduk==1){
            if(jmlk>3){
                uang = (int) (kaos.getHarga()*jmlk)*5/100;
                uang= (int) (kaos.getHarga()*jmlk)-uang;
                System.out.println("Uang yang harus dibayar= Rp."+uang+" => Telah mendapatkan potongan 2%");
            }else{
                System.out.println("Uang yang harus dibayar= Rp."+kaos.getHarga()*jmlk);
            }

        }else if(inputProduk==2){
            if(jmlk>3) {
                uang = (int) kaos.getHarga();
                uang = (int) (polo.getHarga() * jmlk) * 10 / 100;
                uang = (int) (polo.getHarga() * jmlk) - uang;
                System.out.println("Uang yang harus dibayar= Rp." + uang+" => Telah mendapatkan potongan 3%");
            }else {
                System.out.println("Uang yang harus dibayar= Rp."+polo.getHarga()*jmlk);
            }
        }
    }
    
    public static void fn_makanan(int jmlk, int uang, int inkemja, Makanan snack,Makanan bumbu)
    {
        if (inkemja==1){
            if(jmlk>3){
                uang = (int) (snack.getHarga()*jmlk)*5/100;
                uang= (int) (snack.getHarga()*jmlk)-uang;
                System.out.println("Uang yang harus dibayar= Rp."+uang+" => Telah mendapatkan potongan 2%");
            }else{
                System.out.println("Uang yang harus dibayar= Rp."+snack.getHarga()*jmlk);
            }
        }else if(inkemja==2){
            if(jmlk>3){
                uang = (int) (bumbu.getHarga()*jmlk)*10/100;
                uang= (int) (bumbu.getHarga()*jmlk)-uang;
                System.out.println("Uang yang harus dibayar= Rp."+uang+" => Telah mendapatkan potongan 3%");
            }else{
                System.out.println("Uang yang harus dibayar= Rp."+bumbu.getHarga()*jmlk);
            }
        }
    }
}
