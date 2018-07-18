package produk;

public class Makanan extends Produk {
    private String komposisi;
    private String rasa;
    private double harga;

    public Makanan(String kategori, String nama, int berat, String komposisi, String rasa, double harga)
    {
        super(kategori, nama, berat);
        this.komposisi = komposisi;
        this.rasa = rasa;
        this.harga = harga;
    }

    public String getKomposisi()
    {
        return komposisi;
    }

    public void setKomposisi(String komposisi)
    {
        this.komposisi = komposisi;
    }

    public String getrasa()
    {
        return rasa;
    }

    public void setrasa(String rasa)
    {
        this.rasa = rasa;
    }

    public double getHarga()
    {
        return harga;
    }

    public void setHarga(double harga)
    {
        this.harga = harga;
    }

    public void infoMakanan()
    {
        System.out.println(super.getKategori()+"\t\t"+super.getNama()+"\t"+rasa+"\t"+harga);
    }
}