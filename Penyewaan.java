public class Penyewaan {
    private Mobil mobil;
    private int lamaSewa;
    private int biaya;

    public Penyewaan (Mobil mobil, int lamaSewa, int biaya) {
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
        this.biaya = biaya;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public int getBiaya() {
        return biaya;
    }

    public String infoPemesanan() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mobil:\n");
        sb.append(mobil != null ? mobil.infoMobil() : "-").append("\n");
        sb.append("Lama Sewa: ").append(lamaSewa).append(" hari\n");
        sb.append("Total Biaya: Rp ").append(biaya).append("\n");
        sb.append("--------------------------");
        return sb.toString();
    }
}
