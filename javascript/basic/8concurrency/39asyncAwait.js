/**
 * Summary
 * Penggunaan async dan await supaya penulisan asynchronus bisa sama dengan gaya penulisan synchronus
 * async = memberitahu JS untuk menjalankan function secara asnychronus
 * await = menghentikan proses sampai promise di resolve
 */

// Synchronus
function makeCoffee() {
    const coffee = getCoffee(); // async process menggunakan promise
    console.log(coffee);
}
 
makeCoffee();

// Asynchronus
function makeCoffee() {
    getCoffee().then(coffee => {
        console.log(coffee);
    });
}
 
makeCoffee();

// Menggunakan asnyc dan await
async function makeCoffee() {
    const coffee = await getCoffee();
    console.log(coffee);
}
 
makeCoffee();


// Menetapkan prinsip onRejected
    // Menggunakan try..catch
async function makeCoffee() {
    try {
        const coffee = await getCoffee();
        console.log(coffee);
    } catch (rejectedReason) {
        console.log(rejectedReason);
    }
}
 
makeCoffee();


// Chaining Promise
async function makeEspresso() {
    try {
        await checkAvailability();
        await checkStock();
        const coffee = await brewCoffee();
        console.log(coffee);
    } catch (rejectedReason) {
        console.log(rejectedReason);
    }
}
 
makeEspresso();
