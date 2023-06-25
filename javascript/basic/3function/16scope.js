// 2 jenis scope
// 1. globaly scope = variable bisa diakses dari manampun
// 2. local scope = variable hanya bisa diakses dari function itu sendiri 

function localScope() {
    let x = 5;
}

let x = 1;

console.log(x)
localScope()
console.log(x)

// Sebisa mungkin kita harus menghindari pembuatan variabel global, karena variabel global dapat diakses pada seluruh script yang kita tuliskan. Semakin banyak variabel global yang kita tuliskan, semakin tinggi kemungkinan tabrakan (collision) terjadi.