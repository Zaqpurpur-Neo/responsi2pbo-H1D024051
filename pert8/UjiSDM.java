public class UjiSDM {
    public static void main(String[] args) {
        
        // ==========================================================
        // DATA UJI COBA
        // ==========================================================
        
        // 1. BUAT OBJEK ProgrammerMagang
        // Gunakan constructor dengan data: "Andi", 50000.0, "1234".
		ProgrammerMagang magangNihBoss = new ProgrammerMagang("Andi", 50000, "1234");        
       	System.out.println("\n=== Pengujian Programmer Magang ===\n"); 
        // 2. PENGUJIAN METODE BERURUTAN
        
        // Panggil method hitungGaji(160).
		int totalJamGawe = 160;
		double gaji = magangNihBoss.hitungGaji(totalJamGawe);
		System.out.printf("Gaji %s (%d) adalah: Rp %f\n", magangNihBoss.getNama(), totalJamGawe, gaji);
        
        // Cetak hasil dari method getStatusCuti().
		System.out.println("Status Cuti: " + magangNihBoss.getStatusCuti());
        
        // Panggil login("9999") (Tes PIN salah).
        magangNihBoss.login("9999");

        // Panggil login("1234") (Tes PIN benar).
        magangNihBoss.login("1234");
        
        // Cetak hasil dari method getRoleAkses().
       System.out.println("Role Akses: " + magangNihBoss.getRoleAkses());

        // Panggil perpanjangKontrak(6).
       magangNihBoss.perpanjangKontrak(6); 

        // Panggil logout().
		magangNihBoss.logout();
    }
}
