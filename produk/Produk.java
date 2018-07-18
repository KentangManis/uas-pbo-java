package produk;

public class Produk {
    private String kategori;
    private String nama;
    private int berat;

    public Produk(String kategori, String nama, int berat)
    {
        this.kategori = kategori;
        this.nama = nama;
        this.berat = berat;
    }

    public String getKategori()
    {
        return kategori;
    }

    public void setKategori(String kategori)
    {
        this.kategori = kategori;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public int getBerat()
    {
        return berat;
    }

    public void setBerat(int berat)
    {
        this.berat = berat;
    }

}