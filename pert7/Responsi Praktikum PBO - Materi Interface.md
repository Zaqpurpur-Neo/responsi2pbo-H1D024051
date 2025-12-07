**Responsi Praktikum PBO - Materi Interface
Topik Studi Kasus: Sistem Pembayaran (E-Wallet Payment)
A. Ketentuan Program**

Program terdiri dari tiga file terpisah:
**File Jenis Deskripsi**
PaymentMethod.java Interface Berisi deklarasi method yang harus
diimplementasikan
EWalletPayment.java Class Mengimplementasikan interface dan menambahkan
atribut/constructor
PaymentTest.java Main Class Digunakan untuk menguji program

**B. Spesifikasi Interface (PaymentMethod)**

Interface harus memiliki minimal tiga method:
● processPayment() => memproses transaksi pembayaran
● getPaymentDetails() => mengembalikan informasi transaksi
● getTransactionFee() => mengembalikan biaya transaksi (misal fee Rp 2.000)
● getBalance() => mengembalikan saldo

**C. Spesifikasi Class (EWalletPayment)**

Class ini harus:
● Mengimplementasikan PaymentMethod
● Memiliki atribut minimal:
○ nama layanan e-wallet(String),
○ nominal pembayaran(double),
○ saldo pengguna(double)
● Memiliki constructor untuk mengisi nilai atribut
● Mengimplementasikan semua method dari interface
● Pada processPayment(), program harus mengecek apakah saldo cukup atau tidak.
Jika cukup kembalikan "Pembayaran berhasil!", sedangkan jika tidak cukup
"Pembayaran gagal! Saldo tidak cukup."

**D. Spesifikasi Class (PaymentTest)**

● Membuat minimal satu objek EWalletPayment
● Memanggil semua method dari objek untuk menguji
**E. Output Akhir yang Diharapkan**
Format output kurang lebih seperti berikut (nilai dapat berbeda sesuai input program):
=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===
Saldo awal: 150000
Memproses pembayaran sebesar 50000...

Pembayaran berhasil!
Sisa saldo: 98000
Detail Transaksi: Pembayaran dilakukan melalui OVO



