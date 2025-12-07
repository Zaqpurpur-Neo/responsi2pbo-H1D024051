class Customer {
    // TODO: Buatkan atribut
	protected String namaLengkap;
	protected String nomerIdentitas;
	protected int totalBelanja;

    // TODO: Sediakan constructor
	public Customer(String namaLengkap, String nomerIdentitas, int totalBelanja) {
		this.namaLengkap = namaLengkap;
		this.nomerIdentitas = nomerIdentitas;
		this.totalBelanja = totalBelanja;
	}

    void tampilkanInfo() {
        // TODO: tampilkan data customer
		System.out.printf("Nama: %s | ID: %s | Total Belanja: Rp %d\n", namaLengkap, nomerIdentitas, totalBelanja);
    }
}
