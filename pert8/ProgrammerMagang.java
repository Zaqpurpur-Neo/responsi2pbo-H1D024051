// CLASS ProgrammerMagang harus MENGIMPLEMENTASIKAN (implements) KaryawanKontrak dan AksesSistem
public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    
    // ==========================================================
    // ATRIBUT/STATE (Dibutuhkan untuk menyimpan data objek)
    // ==========================================================
    
    // Deklarasikan 4 atribut private:
    // 1. String nama
    // 2. double gajiPerJam
    // 3. String pinRahasia
    // 4. boolean sedangLogin
    private String nama;
	private double gajiPerJam;
	private String pinRahasia;
	private boolean sedangLogin = false;
    
    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    
    // Buat satu constructor yang menerima 3 parameter (nama, gajiPerJam, pinRahasia).
    // Inisialisasi atribut sedangLogin dengan nilai default 'false'.
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
		this.nama = nama;
		this.gajiPerJam = gajiPerJam;
		this.pinRahasia = pinRahasia;
	}

	public String getNama() {
		return nama;
	}
    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI KaryawanKontrak
    // ==========================================================
    
    // @Override: IMPLEMENTASIKAN hitungGaji(int jamKerja)
    // LOGIKA: Hitung gaji (jamKerja * gajiPerJam) dan tampilkan hasilnya.
   
    // @Override: IMPLEMENTASIKAN perpanjangKontrak(int durasiBulan)
    // LOGIKA: Tampilkan pesan konfirmasi perpanjangan kontrak.
    
    // @Override: IMPLEMENTASIKAN getStatusCuti() (Override Default Method)
    // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Tersedia 5 hari".
   	@Override
	public double hitungGaji(int jamKerja) {;
		return (jamKerja * gajiPerJam);
	}

	@Override
    public void perpanjangKontrak(int durasiBulan) {
		System.out.printf("Kontrak diperpanjang %d bulan\n", durasiBulan);
	}

	@Override
	public String getStatusCuti() {
		return "Tersedia 5 hari";
	}

    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI AksesSistem
    // ==========================================================
    
    // @Override: IMPLEMENTASIKAN login(String pin)
    // LOGIKA: Cek apakah pin yang diterima sama dengan pinRahasia. 
    //         Jika sama, ubah sedangLogin = true dan tampilkan pesan berhasil.
    //         Jika tidak, tampilkan pesan gagal.
    
    // @Override: IMPLEMENTASIKAN logout()
    // LOGIKA: Ubah sedangLogin = false dan tampilkan pesan logout.
    
    // @Override: IMPLEMENTASIKAN getRoleAkses() (Override Default Method)
    // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Magang IT".
   	
	@Override
	public void login(String pin) {
		if(pinRahasia.equals(pin)) {
			sedangLogin = true;
			System.out.println("Login Berhasil. Selamat Datang, " + nama);
		} else {
			System.out.println("Login Gagal: PIN Salah");
		}
	}

	@Override
	public void logout() {
		sedangLogin = false;
		System.out.println("Anda Berhasil Login");
	}
}
