
public class Mahasiswa {
    public String nama = "tes";
    private int nim;

    public Mahasiswa(){};

    public Mahasiswa(String nama){
        this.nama = nama;
    };

    public Mahasiswa(int nim){
        this.nim = nim;
    }

    public Mahasiswa(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public int getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

}