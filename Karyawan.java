public class Karyawan {
    private String nama;
    private String alamat;
    private String noTelp;
    private String jenisKelamin;
    private String kategori;
    private String[] behaviour;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setBehaviour(String[] behaviour) {
        this.behaviour = behaviour;
    }

    public String infoKaryawan() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nama: ").append(nama).append("\n");
        sb.append("Alamat: ").append(alamat).append("\n");
        sb.append("No Telp: ").append(noTelp).append("\n");
        sb.append("Jenis Kelamin: ").append(jenisKelamin).append("\n");
        sb.append("Kategori: ").append(kategori).append("\n");
        sb.append(formatBehaviourSentence());
        sb.append("\n--------------------------");
        return sb.toString();
    }

    private String formatBehaviourSentence() {
        if (behaviour == null || behaviour.length == 0) {
            return "Behaviour: Tidak ada behaviour.";
        }
        StringBuilder result = new StringBuilder("Behaviour: ");
        for (int i = 0; i < behaviour.length; i++) {
            String b = behaviorNormalize(behaviour[i]);
            if (i == 0) result.append(b);
            else if (i == behaviour.length - 1) result.append(" dan ").append(b);
            else result.append(", ").append(b);
        }
        result.append(".");
        return result.toString();
    }

    private String behaviorNormalize(String s) {
        String t = s.trim().toLowerCase();
        if (t.equals("makan")) return "sedang makan";
        if (t.equals("minum")) return "sedang minum";
        if (t.equals("jaga shift")) return "sedang jaga shift";
        if (t.equals("bermain")) return "sedang bermain";
        if (t.equals("membersihkan")) return "sedang membersihkan";
        return "sedang " + s.trim();
    }
}
