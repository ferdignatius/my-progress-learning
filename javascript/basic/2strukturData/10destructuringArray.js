// Mirip kek destructuring Object, bedanya dia pake index
const laci = ["Joe", 1,5, true]
// const [first, second, third, fourth] = laci;
const [first, , , fourth] = laci;


// Destructuring Assignment
let first1 = "Jim";
let second2 = "Nan";
[first1, second2] = laci;

// Paling berguna saat : swap nilai
var a = 1;
var b = 2;
// var temp; // gunakan temp untuk variabel penengah (menyimpan data sementara pada variabel yang akan ditukar)
 
console.log("Sebelum swap");
console.log("Nilai a: " + a);
console.log("Nilai b: " + b);

// temp = a;
// a = b;

// bisa disingkat dengan destructuring assignment
[a, b] = [b, a]

console.log("Setelah swap");
console.log("Nilai a: " + a);
console.log("Nilai b: " + b);


// default value
const favorites = ["Seafood"];
 
const [myFood, herFood = "Salad"] = favorites
 
console.log(myFood);
console.log(herFood); 

