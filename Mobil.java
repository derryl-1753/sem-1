public class Mobil {
    private String noPlat;
    private String merk;
    private String warna;
    private int tahun;
    private String[] behaviour;

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setBehaviour(String[] behaviour) {
        this.behaviour = behaviour;
    }

    public String infoMobil() {
        StringBuilder sb = new StringBuilder();
        sb.append("No Plat: ").append(noPlat).append("\n");
        sb.append("Merk: ").append(merk).append("\n");
        sb.append("Warna: ").append(warna).append("\n");
        sb.append("Tahun: ").append(tahun).append("\n");
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
            else if (i == behaviour.length - 1) result.append(", lalu ").append(b);
            else result.append(", ").append(b);
        }
        result.append(".");
        return result.toString();
    }

    private String behaviorNormalize(String s) {
        String t = s.trim().toLowerCase();
        if (t.equals("maju")) return "maju";
        if (t.equals("mundur")) return "mundur";
        if (t.equals("belok kiri")) return "belok kiri";
        if (t.equals("belok kanan")) return "belok kanan";
        if (t.equals("start engine")) return "start engine";
        if (t.equals("stop engine")) return "stop engine";
        if (t.equals("parkir")) return "parkir";
        if (t.equals("berjalan")) return "berjalan";
        return s.trim();
    }
}
