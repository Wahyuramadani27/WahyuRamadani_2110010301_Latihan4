package penilaian;

public class Mahasiswa {
    private String nama;
    private String npm;

    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    // Getter untuk variabel nama
    public String getNama() {
        return nama;
    }

    // Setter untuk variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk variabel NPM
    public String getNpm() {
        return npm;
    }

    // Setter untuk variabel NPM
    public void setNpm(String npm) {
        this.npm = npm;
    }
}
