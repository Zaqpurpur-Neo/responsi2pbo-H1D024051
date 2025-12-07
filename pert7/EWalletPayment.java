public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
	// - nominal transaksi
	private String namaPenyediaLayanan;
	private double saldo;
	private double nominalTransaksi;

    // TODO: Buat constructor untuk mengisi nilai atribut
	public EWalletPayment(String namaPenyediaLayanan, double saldo, double nominalTransaksi) {
		this.namaPenyediaLayanan = namaPenyediaLayanan;
		this.saldo = saldo;
		this.nominalTransaksi = nominalTransaksi;
	}

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod
	@Override
	public void processPayment() {
		System.out.printf("Memproses pembayaran sebesar %f...\n", nominalTransaksi);
		double sisaSaldo = saldo - (nominalTransaksi + getTransactionFee());
		if(sisaSaldo < 0) {
			System.out.println("Pembayaran gagal, biaya kurang");
		} else { 
			System.out.println("Pembayaran berhasil");
			this.saldo = sisaSaldo;
		}
	}
	
	@Override
	public String getPaymentDetails() {
		return "Detail Transaksi: Pembayaran dilakukan melalu " + namaPenyediaLayanan; 
	}
	
	@Override
	public double getTransactionFee() {
		return 2000;
	}
	
	@Override
	public double getBalance() {
		return saldo;
	}

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal

}
