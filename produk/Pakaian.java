package produk;

public class Pakaian extends Produk {
    private String ukuran;
    private String warna;
    private int harga;

    public Pakaian(String kategori, String nama, int berat, String ukuran, String warna, double harga)
    {
        super(kategori, nama, berat);
        this.ukuran = ukuran;
        this.warna = warna;
        this.harga = (int) harga;
    }

    public String getUkuran()
    {
        return ukuran;
    }

    public void setUkuran(String ukuran)
    {
        this.ukuran = ukuran;
    }

    public String getWarna()
    {
        return warna;
    }

    public void setWarna(String warna)
    {
        this.warna = warna;
    }

    public double getHarga()
    {
        return harga;
    }

    public void setHarga(double harga)
    {
        this.harga = (int) harga;
    }

    public void infoPakaian()
    {
        System.out.println(super.getKategori()+"\t\t"+super.getNama()+"\t"+ukuran+"\t"+warna+"\t"+harga);
    }
}