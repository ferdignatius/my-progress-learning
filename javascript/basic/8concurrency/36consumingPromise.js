// mengkonsumsi/menggunakan promise
// Status awal Promise = pending
// .then() -> (kemudian) digunakan untuk menangani hasil Promise; higher-order function yang butuh 2 parameter (callback/handler)

// function stock
const stock = {
    coffeeBeans: 250,
    water: 1000,
}

// function yang mereturn Promise  
const checkStock = () => {
    return new Promise((resolve, reject) => {
        if (stock.coffeeBeans >= 16 && stock.water >= 250) {
            resolve("Stok cukup. Bisa membuat kopi");
        } else {
            reject("Stok tidak cukup");
        }
    });
};

// function untuk menangani status resolve dan reject
const handleSuccess = resolvedValue => {
    console.log(resolvedValue);
}
 
const handleFailure = rejectionReason => {
    console.log(rejectionReason);
}

// method(parameter) = .then(succes, fail)

checkStock()
    .then(handleSuccess, handleFailure);

// Menetapkan prinsip onRejected handler
// Opsi 1 -> sekedar dipisah 
checkStock()
    .then(handleSuccess)
    .then(null, handleFailure);

// Opsi 2 -> menggunakan catch() 
checkStock()
    .then(handleSuccess)
    .catch(handleFailure); // method catch() akan terpanggil jika rejected
