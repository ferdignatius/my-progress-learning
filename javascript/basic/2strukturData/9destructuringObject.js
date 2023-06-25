// JSON -> terdiri dari array dan objek
// destructuring = sintaks untuk mengeluarkan nilai dari array dari sebuah object ke dalam satuan yang lebih kecil.
// Contohnya gini
const profile = {
    firstName: "John",
    lastName: "Doe",
    age: 18
}
 
const firstName = profile.firstName
const lastName = profile.lastName
const age = profile.age
 
console.log(firstName, lastName, age)


// destructuring object
const identity = {
    nama: "Jomel",
    ras: "Anjing",
    umur: 4
};
// dstructuring assignment = identity.nama akan tetap dijalankan meski ada variable nama. Sayaratnya pake ()
// fungsi () -> Ia akan memberi tahu JavaScript bahwa tanda kurawal di dalamnya bukan sebuah block statement melainkan sebuah expression, sehingga assignment dapat dilakukan.
let nama = "Asu";
let umur = 11;
({nama, ras, umur} = identity);
console.log(nama, ras, umur);

// default value = menambahkan value di saat destructuring
({nama, ras, umur, isFriend = true} = identity);

// Assigning to Different Local Variable Names
const {nama: localNama, ras: localRas, umur: localUmur} = identity;
console.log(localNama, localRas, localUmur)