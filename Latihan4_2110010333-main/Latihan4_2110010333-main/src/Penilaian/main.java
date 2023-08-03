package penilaian;

public class main {
    public static void main(String[] args) {
        // Membuat objek nilaiAkhir
        nilaiAkhir nilaiAkhir = new nilaiAkhir("Wahyu Ramadani", "210010301", 80, 85, 90);

        // Menggunakan getter untuk mengakses variabel nama, npm, uts, uas, tugas
        System.out.println("Nama: " + nilaiAkhir.getNama());
        System.out.println("NPM: " + nilaiAkhir.getNpm());
        System.out.println("Nilai UTS: " + nilaiAkhir.getUts());
        System.out.println("Nilai UAS: " + nilaiAkhir.getUas());
        System.out.println("Nilai Tugas: " + nilaiAkhir.getTugas());

        // Menghitung nilai akhir menggunakan method hitungNilaiAkhir
double nilaiAkhirValue = nilaiAkhir.hitungNilaiAkhir();
System.out.println("Nilai Akhir: " + nilaiAkhirValue);

    }
}
