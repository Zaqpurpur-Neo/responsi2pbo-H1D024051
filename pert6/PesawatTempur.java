public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int jumlahRudal
    private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - jumlahRudal
    // Panggil super(...) untuk parent.
	public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
		super(namaKendaraan, kapasitasPenumpang);
		this.jumlahRudal = jumlahRudal;
	}

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 20 → tampilkan "Energi terlalu rendah! Mesin tidak dapat diaktifkan."
    // Jika cukup → tampilkan "Mesin pesawat tempur diaktifkan."
	@Override
	public void aktifkanMesin() {
		if(getLevelEnergi() < 20) System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
		else System.out.println("Mesin pesawat tempur diaktifkan.");
	}

    // @Override jelajah(int jarak)
    // Konsumsi energi: 3% per 1 km.
    // Jika energi tidak cukup → tampilkan pesan gagal.
    // Jika cukup → kurangi energi dan tampilkan:
    // "Pesawat tempur menjelajah sejauh [jarak] km."
	@Override
	public void jelajah(int jarak) {
		int percentage = 3;
		int dikonsumi = jarak * percentage;
		int newEnergi = getLevelEnergi() - dikonsumi;
		if(newEnergi < 20) {
			System.out.printf("Energi tidak mencukupi untuk menjelajah sejauh %d km\n", jarak);
		} else {
			System.out.printf("Pesawat Tempur menjelajah sejauh %d km.\n", jarak);
			setLevelEnergi(getLevelEnergi() - dikonsumi);
		}
	}

    // @Override isiEnergi(int jumlah)
    // Tambah energi sampai max 100%.
    // Tampilkan pesan peningkatan energi.
	@Override
	public void isiEnergi(int jumlah) {
		int newLevelEnergi = getLevelEnergi() + jumlah;
		if(newLevelEnergi <= 100) {
			setLevelEnergi(newLevelEnergi);
			System.out.printf("Pesawat Tempur mengisi energi sebanyak %d%% | Energi Saat ini: %d%%\n", jumlah, getLevelEnergi());
		} else if(newLevelEnergi > 100) {
			int sisa = Math.abs(100 - newLevelEnergi);
			System.out.printf("Energi sudah full 100%%, sisa tambahan energi yang tidak terpakai %d%%\n", sisa);
		}
	}


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void tembakRudal(int jumlah)
    // - Jika jumlahRudal cukup → kurangi dan tampilkan:
    //   "Menembakkan [jumlah] rudal!"
    // - Jika tidak cukup → tampilkan pesan gagal.
	public void tembakRudal(int jumlah) {
		int digunakan = jumlahRudal - jumlah;
		if(digunakan <= 0) System.out.println("Rudal tidak mencukupi untuk digunakan");
		else {
			System.out.printf("Menembakkan %d rudal!!\n", jumlah);
		}
	}
}
