// Selain nilai boolean false, tipe data atau nilai yang dianggap falsy, antara lain:
// Number 0
// BigInt 0n
// String kosong seperti “” atau ‘’
// null
// undefined
// NaN, atau Not a Number



// IF - ELSE IF - ELSE

var x = 0
if (x < 0) {
    console.log("Positive");
}else if (x = 0) {
    console.log(0);
}else {
    console.log("Negative");
}

const ISRAINING = true;
if (ISRAINING) {
    console.log("Hujan");
} 
console.log("Cerah");


// Ternary operator atau conditional expressions.
let isMember = true;
let discount = isMember? 0.1 : 0;
console.log(`Your member = ${isMember} and you get = ${discount}`);


// SWITCH

var buah = "tomat";

switch (buah) {
    case "semangka":
        console.log("Buah semangka");
        break;

    case "jeruk":
        console.log("Buah jeruk");
        break;
        
    default:
        console.log("Buah tidak terdefinisi");    
        break;
}




if (score >= 90) {
    result = 'Selamat! Anda mendapatkan nilai A.';
} else if (score >= 80) {
    result = 'Anda mendapatkan nilai B.'
} else if (score >= 70) {
    result = 'Anda mendapatkan nilai C.'
} else if ( score >= 60) {
    result = 'Anda mendapatkan nilai D.'
} else {
    result = 'Anda mendapatkan nilai E.'
}