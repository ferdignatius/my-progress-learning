// Parameter dari fungsi dapat berupa tipe data apa pun, mulai dari string, number, object, bahkan fungsi lain.

// Jika parameter dari fungsi adalah sebuah object, kita juga bisa memanfaatkan destructuring object untuk mendapatkan nilainya. Contohnya seperti berikut:
const user = {
    id: 24,
    displayName: 'kren',
    fullName: 'Kylo Ren',
};

function introduce({displayName, fullName}) {
    console.log(`${displayName} is ${fullName}`);
}

introduce(user);


// Default parameters
function pangkat(x, pangkat = 1){
    return x ** pangkat;
}
console.log(pangkat(2))
console.log(pangkat(2,3))


// Rest parameter = menggabungkan beberapa elemen menjadi satu array. kebalikannya spread operator
function queue(...nama) {
    console.log(nama)
}