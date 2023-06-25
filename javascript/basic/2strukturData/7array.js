// Array =  tipe data yang dapat mengelompokkan lebih dari satu nilai dan menempatkannya dalam satu variabel
let arr = ["Ferdinand", 1, 3, 4, true, false, 1.45]


// Bedanya dengan object?
// = Akses array pake index
console.log(arr[0]);
console.log(arr[10]); // kalau diluar indexnya, maka akan undifined

// memanipulasi data array
// push() -> memasukkan data ke array
arr.push("Jomel");
console.log(arr)

// pop() -> mengeluarkan data terakhir dari array
arr.pop();
console.log(arr)

// shift() digunakan untuk mengeluarkan elemen pertama dari array,
// unshift() digunakan untuk menambahkan elemen di awal array.
arr.shift();
arr.unshift("Kuhauk");

// delete -> menghapus data dari array
delete arr[2]

// splice() -> Untuk menghapus elemen
arr.splice(3,1) // menghapus index 3, sebanyak 1 elemen