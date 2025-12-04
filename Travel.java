public class Travel {
    private String rute;
    private Mobil mobil;
    private Karyawan karyawan;
    private int biaya;

    public Travel(String rute, Mobil mobil, Karyawan karyawan, int biaya) {
        this.rute = rute;
        this.mobil = mobil;
        this.karyawan = karyawan;
        this.biaya = biaya;
    }

    public String getRute() {
        return rute;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Karyawan getKaryawan(){
        return karyawan;
    }

    public int getBiaya() {
        return biaya;
    }

    public String infoTravel() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rute: ").append(rute).append("\n");
        sb.append("Mobil:\n");
        sb.append(mobil != null ? mobil.infoMobil() : "-").append("\n");
        sb.append("Biaya: Rp ").append(biaya).append("\n");
        sb.append("--------------------------");
        return sb.toString();
    }
}
