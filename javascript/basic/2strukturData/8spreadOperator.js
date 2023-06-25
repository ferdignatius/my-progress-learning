// fitur ini digunakan untuk menyebarkan nilai array atau lebih tepatnya iterable object menjadi beberapa elemen

const favorites = ["Seafood", "Salad", "Nugget", "Soup"];
console.log(...favorites); // ini spread operator
// sama aja kayak
console.log(favorites[0], favorites[1], favorites[2], favorites[3]);


// Spread operator dapat digunakan untuk menggabungkan dua buah array ke dalam array baru
const other = ["Milk", "Tea"];
const allFood = [favorites,other]
const allFood2 = [...favorites,...other]
console.log(allFood);
// lihat bedanya di console
console.log(allFood2);

// Selain array, spread operator juga bisa digunakan untuk object literals. Hal ini memungkinkan kita dapat menggabungkan beberapa object dengan kode yang lebih ringkas
const obj1 = { firstName: 'Obi-Wan', age: 30 };
const obj2 = { lastName: 'Kenobi', gender: 'M' };
const newObj = { ...obj1, ...obj2 };

console.log(newObj);