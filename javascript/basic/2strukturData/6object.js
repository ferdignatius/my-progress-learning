// Object
// Object berisi pasangan key dan value yang juga dikenal dengan property
const user = {
    nama: "Ferdinand",
    kelas: 12,
    umur: 17,
    id: 1,
    "quote" : "BLA BLA BLA"
};
// Menampilkan / memanggil object
console.log(`Hi ${user.nama}`);
console.log(`Kelas = ${user.kelas}`);
console.log(`Quote's today = ${user["quote"]}`);
// Mengubah isi object
user.nama = "Jomel";
user[id] = 3;
console.log(`Hi ${user.nama}`);
/**
 * KNP CONST OBJECT TAPI BISA UBAH NILAINYA??
 * Yang perlu diperhatikan adalah mengubah nilai berbeda dengan menginisialisasi ulang nilai. Ketika membuat sebuah object, kita tidak terikat dengan properti di dalamnya sehingga kita masih bisa memodifikasi nilainya. Berbeda jika kita menginisialisasi ulang variabel dari object.
 */

// Mendelete nilai object
delete user.umur;
console.log(user);