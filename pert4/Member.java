class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
	private int poin;
	private String level;
    // TODO: Buat constructor dengan super
	public Member(String namaLengkap, String nomerIdentitas, int totalBelanja, int poin, String level) {
		super(namaLengkap, nomerIdentitas, totalBelanja);
		this.poin = poin;
		this.level = level;
	}	

    @Override
    void tampilkanInfo() {
		super.tampilkanInfo();
		System.out.printf("Poin Reward: %d | Level: %s", poin, level);
    }
}
