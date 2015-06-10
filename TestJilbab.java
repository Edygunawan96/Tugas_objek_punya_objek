/**
 * Created by Tika on 10/06/2015.
 */
public class TestJilbab {
    public static void main(String[] args) {
        Merk Merkbaru = new Merk("Paris", 1002 ,"Jalan Gadang");
        Jilbab JilbabBaru = new Jilbab("Polos","Pink","Persegi",Merkbaru);

        System.out.println(JilbabBaru.toString());//untuk mengeluarkan data jilbab baru
        Merkbaru.setAlamatPerusahaan("Jalan Mawar");//mengubah settingan alamat
        System.out.println(JilbabBaru.toString());

    }
}
