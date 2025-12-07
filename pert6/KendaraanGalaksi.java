public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    // TODO:
    // - String namaKendaraan
    // - int levelEnergi         (0–100)
    // - int kapasitasPenumpang
	private String namaKendaraan;
	private int levelEnergi = 100;
	private int kapasitasPenumpang;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    // levelEnergi default = 100.
	public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
		this.namaKendaraan = namaKendaraan;
		this.kapasitasPenumpang = kapasitasPenumpang;
	}

    // ==========================================================
    // GETTER
    // ==========================================================

    // TODO: Getter namaKendaraan
    // TODO: Getter levelEnergi
    // TODO: Getter kapasitasPenumpang
	public String getNamaKendaraan() {
		return namaKendaraan;
	}

	public int getLevelEnergi() {
		return levelEnergi;
	}

	public int getKapasitasPenumpang() {
		return kapasitasPenumpang;	
	}

	public void setLevelEnergi(int levelEnergi) {
		this.levelEnergi = levelEnergi;
	}

    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // TODO:
    // Method final tampilStatus()
    // Format:
    // "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak"
	public void tampilStatus() {
		System.out.printf("%s | Energi: %d%% | Kapasitas: %d awak", namaKendaraan, levelEnergi, kapasitasPenumpang);
	}

    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    abstract void aktifkanMesin();

    abstract void jelajah(int jarak);

    abstract void isiEnergi(int jumlah);
}
