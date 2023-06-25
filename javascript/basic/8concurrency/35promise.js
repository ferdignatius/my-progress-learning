// Promise adalah fitur ES6 yg bisa menggantikan callbakc
// konsepnya mirip kek janji, jadi harus terpenuhi/tidak terpenuhi dulu baru bisa lanjut
// Promise adalah sebuah objek
// Dalam constructor Promise kita perlu menerapkan resolver/executor function
// Dalam realita, Promise dibuat untuk menjalankan proses asynchronus dari API

const executorFunction = (resolve, reject) => {
    const isCoffeeMakerReady = true; // kalau dibuat jadi false, maka output akan berubah menjadi else
    if (isCoffeeMakerReady) {
        resolve("Kopi berhasil dibuat");
    } else {
        reject("Mesin kopi tidak bisa digunakan");
    }
}
 
 
const makeCoffee = () => {
    return new Promise(executorFunction);
}
const coffeePromise = makeCoffee();
console.log(coffeePromise);
 
 
/* output
Promise { 'Kopi berhasil dibuat' }
*/