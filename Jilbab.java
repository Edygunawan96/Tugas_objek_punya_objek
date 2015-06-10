/**
 * Created by Tika on 10/06/2015.
 */
public class Jilbab {
    private String warna;
    private String motif;
    private String bentuk;
    private Merk Merek;//atribut baru

    public Jilbab(String motif, String warna, String bentuk, Merk merek) {
        this.motif = motif;
        this.warna = warna;
        this.bentuk = bentuk;
        Merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public Merk getMerek() {
        return Merek;
    }

    public void setMerek(Merk merek) {
        Merek = merek;
    }

    @Override
    public String toString() {
        return "Jilbab{" +
                "warna='" + warna + '\'' +
                ", motif='" + motif + '\'' +
                ", bentuk='" + bentuk + '\'' +
                ", Merek=" + Merek +
                '}';
    }
}
