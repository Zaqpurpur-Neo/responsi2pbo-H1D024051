public class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas
	
	private int umur;
	private double beratBadan;
	private double tinggiBadan;
	final private double faktorAktivitas = 1.2;

	public Pengguna(int umur, double beratBadan, double tinggiBadan) {
		this.umur = umur;
		this.beratBadan = beratBadan;
		this.tinggiBadan = tinggiBadan;
	}
    
    double hitungBMI() {
		double tinggiMeter = tinggiBadan / 100;
		double BMI = beratBadan / (tinggiMeter * tinggiMeter);
		return BMI;
    }

    void tampilKategori() {
		double BMI = hitungBMI();
		if(BMI < 18.5) System.out.println("Kategori: Kurus");
		else if(BMI < 25) System.out.println("Kategori: Normal");
		else if(BMI >= 25) System.out.println("Kategori: Obesitas");
    }

    double hitungKalori() {
		return beratBadan * faktorAktivitas * 10;
    }

    void tampilInfo() {
		/*
=== Informasi Kesehatan Pengguna ===
Umur: 25 tahun
Berat: 60.0 kg
Tinggi: 170.0 cm
BMI: 20.76
Kategori: Normal
Kebutuhan Kalori: 720 kal/hari
==================================== 
		 * */
		System.out.println("=== Informasi Kesehatan Pengguna ===");
		System.out.printf("Umur: %d tahun\n", umur);
		System.out.printf("Berat: %f kg\n", beratBadan);
		System.out.printf("Tinggi: %f cm\n", tinggiBadan);
		System.out.printf("BMI: %f\n", hitungBMI());
		tampilKategori();
		System.out.printf("Kebutuhan Kategori: %f kal/hari\n", hitungKalori());
		System.out.println("====================================");
    }
}
