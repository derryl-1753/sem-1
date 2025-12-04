import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Karyawan[] karyawan = new Karyawan[7];
        Mobil[] mobil = new Mobil[7];
        Travel[] travel = new Travel[7];
        Penyewaan[] pemesanan = new Penyewaan[7];

        int jumlahKaryawan = 0;
        int jumlahMobil = 0;
        int jumlahTravel = 0;
        int jumlahPemesanan = 0;

        while (true) {
            System.out.println("=== FILKOM Tour and Travel ===");
            System.out.println("1. Input Karyawan");
            System.out.println("2. Input Mobil");
            System.out.println("3. Lihat Karyawan");
            System.out.println("4. Lihat Mobil");
            System.out.println("5. Pemesanan Travel");
            System.out.println("6. Penyewaan Mobil");
            System.out.println("7. Lihat History Travel");
            System.out.println("8. Lihat History Penyewaan");
            System.out.println("9. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");

            int pilih;
            if (input.hasNextInt()) {
                pilih = input.nextInt();
                input.nextLine();
            } else {
                input.nextLine();
                System.out.println("Masukkan angka yang valid!");
                continue;
            }

            // Keluar dari Aplikasi
            if (pilih == 9) {
                System.out.println("Berhasil Keluar dari Aplikasi.");
                break;
            }

            // Input Karyawan
            if (pilih == 1) {
                int jumlah;
                while (true) {
                    System.out.print("Masukkan jumlah data karyawan: ");
                    if (!input.hasNextInt()) {
                        input.nextLine();
                        System.out.println("Masukkan angka yang valid.");
                        continue;
                    }
                    jumlah = input.nextInt();
                    input.nextLine();

                    if (jumlahKaryawan == 0 && jumlah < 3) {
                        System.out.println("Input pertama minimal 3.");
                        continue;
                    }
                    if (jumlahKaryawan + jumlah > 7) {
                        System.out.println("Melebihi kapasitas. Sisa kuota: " + (7 - jumlahKaryawan));
                        continue;
                    }
                    break;
                }

                for (int i = 0; i < jumlah; i++) {
                    Karyawan k = new Karyawan();

                    System.out.println("Data Karyawan ke-" + (i + 1));

                    System.out.print("Nama: ");
                    k.setNama(input.nextLine().trim());

                    System.out.print("Alamat: ");
                    k.setAlamat(input.nextLine().trim());

                    System.out.print("No Telp: ");
                    k.setNoTelp(input.nextLine().trim());

                    System.out.print("Jenis Kelamin: ");
                    k.setJenisKelamin(input.nextLine().trim());

                    System.out.print("Kategori: ");
                    k.setKategori(input.nextLine().trim());

                    System.out.println("=== Daftar Behaviour Karyawan ===");
                    System.out.println("1. makan");
                    System.out.println("2. minum");
                    System.out.println("3. jaga shift");
                    System.out.println("4. bermain");
                    System.out.println("5. membersihkan");

                    System.out.print("Jumlah behaviour: ");
                    int b = 0;
                    if (input.hasNextInt()) {
                        b = input.nextInt();
                        input.nextLine();
                    } else {
                        input.nextLine();
                        System.out.println("Tidak valid. Dianggap 0.");
                    }

                    String[] list = new String[b];
                    for (int x = 0; x < b; x++) {
                        System.out.print("Pilih behaviour ke-" + (x + 1) + ": ");
                        int pilihB = input.nextInt();
                        input.nextLine();

                        if (pilihB == 1) list[x] = "makan";
                        else if (pilihB == 2) list[x] = "minum";
                        else if (pilihB == 3) list[x] = "jaga shift";
                        else if (pilihB == 4) list[x] = "bermain";
                        else if (pilihB == 5) list[x] = "membersihkan";
                        else list[x] = "unknown";
                    }

                    k.setBehaviour(list);

                    karyawan[jumlahKaryawan] = k;
                    jumlahKaryawan++;
                    System.out.println();
                }
            }

            // Input Mobil
            else if (pilih == 2) {
                int jumlah;
                while (true) {
                    System.out.print("Masukkan jumlah data mobil: ");
                    if (!input.hasNextInt()) {
                        input.nextLine();
                        System.out.println("Masukkan angka yang valid.");
                        continue;
                    }
                    jumlah = input.nextInt();
                    input.nextLine();

                    if (jumlahMobil == 0 && jumlah < 3) {
                        System.out.println("Input pertama minimal 3.");
                        continue;
                    }
                    if (jumlahMobil + jumlah > 7) {
                        System.out.println("Melebihi kapasitas. Sisa kuota: " + (7 - jumlahMobil));
                        continue;
                    }
                    break;
                }

                for (int i = 0; i < jumlah; i++) {
                    Mobil m = new Mobil();

                    System.out.println("Data Mobil ke-" + (i + 1));

                    System.out.print("No Plat: ");
                    m.setNoPlat(input.nextLine().trim());

                    System.out.print("Merk: ");
                    m.setMerk(input.nextLine().trim());

                    System.out.print("Warna: ");
                    m.setWarna(input.nextLine().trim());

                    System.out.print("Tahun: ");
                    if (input.hasNextInt()) {
                        m.setTahun(input.nextInt());
                        input.nextLine();
                    } else {
                        input.nextLine();
                        System.out.println("Tahun tidak valid. Diisi 0.");
                        m.setTahun(0);
                    }

                    System.out.println("=== Daftar Behaviour Mobil ===");
                    System.out.println("1. maju");
                    System.out.println("2. mundur");
                    System.out.println("3. belok kiri");
                    System.out.println("4. belok kanan");
                    System.out.println("5. start engine");
                    System.out.println("6. stop engine");
                    System.out.println("7. parkir");
                    System.out.println("8. berjalan");

                    System.out.print("Jumlah behaviour: ");
                    int b = 0;
                    if (input.hasNextInt()) {
                        b = input.nextInt();
                        input.nextLine();
                    } else {
                        input.nextLine();
                        System.out.println("Tidak valid. Dianggap 0.");
                    }

                    String[] list = new String[b];

                    for (int x = 0; x < b; x++) {
                        System.out.print("Pilih behaviour ke-" + (x + 1) + ": ");
                        int pilihB = input.nextInt();
                        input.nextLine();

                        if (pilihB == 1) list[x] = "maju";
                        else if (pilihB == 2) list[x] = "mundur";
                        else if (pilihB == 3) list[x] = "belok kiri";
                        else if (pilihB == 4) list[x] = "belok kanan";
                        else if (pilihB == 5) list[x] = "start engine";
                        else if (pilihB == 6) list[x] = "stop engine";
                        else if (pilihB == 7) list[x] = "parkir";
                        else if (pilihB == 8) list[x] = "berjalan";
                        else list[x] = "unknown";
                    }

                    m.setBehaviour(list);

                    mobil[jumlahMobil] = m;
                    jumlahMobil++;
                    System.out.println();
                }
            }

            // Lihat Karyawan
            else if (pilih == 3) {
                if (jumlahKaryawan == 0) System.out.println("Belum ada data karyawan.");
                else {
                    for (int i = 0; i < jumlahKaryawan; i++) {
                        System.out.println("Data Karyawan ke-" + (i + 1));
                        System.out.println(karyawan[i].infoKaryawan());
                    }
                }
            }

            // Lihat Mobil
            else if (pilih == 4) {
                if (jumlahMobil == 0) System.out.println("Belum ada data mobil.");
                else {
                    for (int i = 0; i < jumlahMobil; i++) {
                        System.out.println("Data Mobil ke-" + (i + 1));
                        System.out.println(mobil[i].infoMobil());
                    }
                }
            }

            // Pemesanan Travel
            else if (pilih == 5) {

                if (jumlahMobil == 0) {
                    System.out.println("Mobil belum tersedia!");
                    continue;
                }

                System.out.println("=== Daftar Rute Travel ===");
                String[] ruteList = {
                    "Surabaya - Malang",
                    "Madura - Malang",
                    "Banyuwangi - Malang",
                    "Situbondo - Malang",
                    "Tulungagung - Malang"
                };

                int[] hargaTravel = {150000, 180000, 250000, 230000, 170000};

                for (int i = 0; i < ruteList.length; i++) {
                    System.out.println((i + 1) + ". " + ruteList[i] + " (Rp " + hargaTravel[i] + ")");
                }

                System.out.print("Pilih rute: ");
                int r = input.nextInt();
                input.nextLine();

                if (r < 1 || r > ruteList.length) {
                    System.out.println("Rute tidak tersedia!");
                    continue;
                }

                // pilih mobil
                System.out.println("=== Pilih Mobil ===");
                for (int i = 0; i < jumlahMobil; i++) {
                    System.out.println((i + 1) + ". " + mobil[i].infoMobil());
                }

                System.out.print("Pilih mobil: ");
                int m = input.nextInt();
                input.nextLine();

                if (m < 1 || m > jumlahMobil) {
                    System.out.println("Mobil tidak tersedia!");
                    continue;
                }

                Travel t = new Travel(ruteList[r - 1], mobil[m - 1], karyawan[m - 1], hargaTravel[r - 1]);
                travel[jumlahTravel] = t;
                jumlahTravel++;

                System.out.println("=== Travel Berhasil Dipesan ===");
                System.out.println(t.infoTravel());
            }

            // Penyewaan Mobil
            else if (pilih == 6) {

                if (jumlahMobil == 0) {
                    System.out.println("Mobil belum tersedia!");
                    continue;
                }

                System.out.println("=== Daftar Mobil ===");
                for (int i = 0; i < jumlahMobil; i++) {
                    System.out.println((i + 1) + ". " + mobil[i].infoMobil());
                }

                System.out.print("Pilih mobil: ");
                int m = input.nextInt();
                input.nextLine();

                if (m < 1 || m > jumlahMobil) {
                    System.out.println("Mobil tidak valid!");
                    continue;
                }

                System.out.print("Masukkan lama sewa (hari): ");
                int hari = input.nextInt();
                input.nextLine();

                int biaya = hari * 300000; // biaya contoh

                Penyewaan p = new Penyewaan(mobil[m - 1], hari, biaya);
                pemesanan[jumlahPemesanan] = p;
                jumlahPemesanan++;

                System.out.println("=== Penyewaan Berhasil ===");
                System.out.println(p.infoPemesanan());
            }

            // History Travel
            else if (pilih == 7) {
                if (jumlahTravel == 0) {
                    System.out.println("Belum ada pemesanan travel.");
                } else {
                    for (int i = 0; i < jumlahTravel; i++) {
                        System.out.println("Travel ke-" + (i + 1));
                        System.out.println(travel[i].infoTravel());
                    }
                }
            }

            // History Penyewaan
            else if (pilih == 8) {
                if (jumlahPemesanan == 0) {
                    System.out.println("Belum ada penyewaan.");
                } else {
                    for (int i = 0; i < jumlahPemesanan; i++) {
                        System.out.println("Penyewaan ke-" + (i + 1));
                        System.out.println(pemesanan[i].infoPemesanan());
                    }
                }
            }

            else {
                System.out.println("Pilihan tidak dikenali.");
            }

        }

        input.close();
    }
}