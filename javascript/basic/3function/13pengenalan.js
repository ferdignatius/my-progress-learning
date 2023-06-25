/**
 * Fungsi untuk
 * 1. menghasilkan output berdasarkan input tertentu.
 * 2. blok kode atau prosedur yang dapat digunakan secara berulang
 */

// Parameter = variabel yang didefinisikan sebagai inputan dari sebuah fungsi
function greeting(name, language) {
    if (language == "Indo"){
        console.log(`Hallo ${name}`);
    } else {
        console.log("ERROR")
    }
}

// Argumen = nilai atau expression yang dimasukkan ke dalam fungsi.
name("acaca");



// Return = kemampuan function menghasilkan output atau mengembalikan sebuah nilai.
function sayHI(name, language) {
    if (language == "Indo"){
        return `Hi ${name}`;
    } else {
        return "ERROR";
    }
}

let ferdi = sayHI("Ferdi", "Indo");
console.log(ferdi);



// Expression function = function dalam variable, dan pake annonymous function (fungsi tanpa nama)
const halo = function(nama) {
    return `Hallo ${nama}`;
}