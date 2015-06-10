/**
 * Created by Tika on 10/06/2015.
 */
public class Merk {
    private String NamaMerk;
    private double KodeProduksi;
    private String AlamatPerusahaan;



    public Merk(String namaMerk, double kodeProduksi, String alamatPerusahaan) {
        NamaMerk = namaMerk;
        KodeProduksi = kodeProduksi;
        AlamatPerusahaan = alamatPerusahaan;

    }

    public String getNamaMerk() {
        return NamaMerk;
    }

    public void setNamaMerk(String namaMerk) {
        NamaMerk = namaMerk;
    }

    public double getKodeProduksi() {
        return KodeProduksi;
    }

    public void setKodeProduksi(double kodeProduksi) {
        KodeProduksi = kodeProduksi;
    }

    public String getAlamatPerusahaan() {
        return AlamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        AlamatPerusahaan = alamatPerusahaan;
    }


    @Override
    public String toString() {
        return "Merk{" +
                "NamaMerk='" + NamaMerk + '\'' +
                ", KodeProduksi=" + KodeProduksi +
                ", AlamatPerusahaan='" + AlamatPerusahaan + '\'' +
                '}';
    }
}
