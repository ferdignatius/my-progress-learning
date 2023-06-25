// Kalau Asynchronus kan akan bekerja meskipun proses 1 belum selesai
// Memang jadi lebih efisien, tapi malah membuat function jadi gak urut dan ngacak
// kek dibawah ini 

// Sebelum menggunakan callback
const orderCoffee = () => {
    let coffee = null;

    console.log("Sedang membuat kopi, silakan tunggu...");

    setTimeout(() => {
        coffee = "Kopi sudah jadi!";
    }, 3000);

    return coffee;
}
 
const coffee = orderCoffee(); // anggap ini adalah pelanggan
console.log(coffee);
 
/* output
Sedang membuat kopi, silakan tunggu...
null
*/

// Output 'null' karena return sudah dieksekusi padahal setTimeout blm selesai
// Karena itulah digunakan callback untuk mengantarkan coffe tersebut kepada pelanggan

// Setelah menggunakan callback
const orderCoffee2 = callback => {
    let coffee2 = null;

    console.log("Sedang membuat kopi, silakan tunggu...");

    setTimeout(() => {
        coffee2 = "Kopi sudah jadi!";
        callback(coffee2); // callback
    }, 3000);

}

orderCoffee(coffee2 => {
    console.log(coffee2);
});



// Callback hell = kondisi dimana terlalu banyak callback
// Solusinya promise
// contoh callback hell
function makeACake(...rawIngredients) {
    collectIngredients(rawIngredients, function(ingredients) {
        makeTheDough(ingredients, function(dough) {
            pourDough(dough, function(pouredDough) {
                bakeACake(pouredDough, function(cake) {
                    console.log(cake);
                })
            })
        })
    });
}

// solusi
function makeACake(...rawIngredients) {
    collectIngredients(rawIngredients)
        .then(makeTheDough)
        .then(pourDough)
        .then(bakeACake)
        .then(console.log);
}