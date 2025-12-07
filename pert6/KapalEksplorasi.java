public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int modulScan   // kemampuan scan planet (level 1–5)
	private int modulScan;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - modulScan
	public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
		super(namaKendaraan, kapasitasPenumpang);
		this.modulScan = modulScan;
	}

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 15 → "Energi tidak mencukupi untuk memulai ekspedisi!"
    // Jika cukup → "Kapal eksplorasi siap berangkat!"
	@Override
	public void aktifkanMesin() {
		if(getLevelEnergi() < 15) System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
		else System.out.println("Kapal eksplorasi siap berangkat!");
	}

    // @Override jelajah(int jarak)
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.
	@Override
	public void jelajah(int jarak) {
		int percentage = 2;
		int dikonsumi = jarak * percentage;
		int newEnergi = getLevelEnergi() - dikonsumi;
		if(newEnergi < 15) {
			System.out.printf("Energi tidak mencukupi untuk menjelajah sejauh %d km\n", jarak);
		} else {
			System.out.printf("Kapal Eksplorasi menjelajah sejauh %d km.\n", jarak);
			setLevelEnergi(getLevelEnergi() - dikonsumi);
		}
	}

    // @Override isiEnergi(int jumlah)
    // Tambah energi secara bertahap sampai 100%.
    // Tampilkan pesan pengisian.
	@Override
	public void isiEnergi(int jumlah) {
		int newLevelEnergi = getLevelEnergi() + jumlah;
		if(newLevelEnergi <= 100) {
			setLevelEnergi(newLevelEnergi);
			System.out.printf("Kapal Eksplorasi mengisi energi sebanyak %d%% | Energi Saat ini: %d%%\n", getNamaKendaraan(), jumlah, getLevelEnergi());
		} else if(newLevelEnergi > 100) {
			int sisa = Math.abs(100 - newLevelEnergi);
			System.out.printf("Energi sudah full 100%%, sisa tambahan energi yang tidak terpakai %d%%\n", sisa);
			setLevelEnergi(100);
		}
	}

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void scanPlanet(String namaPlanet)
    // Tampilkan:
    // "Melakukan scan pada planet [namaPlanet] dengan modul level [modulScan]."
	public void scanPlanet(String namaPlanet) {
		System.out.printf("Melakukan scan pada planet %s dengan modul level %d.\n", namaPlanet, modulScan);
	}
}
