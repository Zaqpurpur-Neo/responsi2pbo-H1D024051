public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
		EWalletPayment wallet = new EWalletPayment("OVO", 150000, 50000);
		System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
		System.out.println("Saldo Awal: " + wallet.getBalance());
		wallet.processPayment();
		System.out.println("Sisa Saldo: " + wallet.getBalance());
		System.out.println(wallet.getPaymentDetails());

        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi

    }
}
