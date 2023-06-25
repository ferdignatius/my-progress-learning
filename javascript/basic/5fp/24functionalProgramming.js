// Functional Programming (FP) = paradigma lain / cara lain dalam menulis koding. Paradigma selain OOP
// Paradigma Functional Programming adalah paradigma pemrograman di mana proses komputasi didasarkan pada fungsi matematika murni
//FP menganut gaya deklaratif berfokus pada “what to solve” dibanding “how to solve” yang dianut oleh gaya imperatif.

// Gaya imperatif = how to solve -> pakai for, push() utk solve
const names = ['Harry', 'Ron', 'Jeff', 'Thomas'];

const newNamesWithExcMark = [];

for(let i = 0; i < names.length; i++) {
  newNamesWithExcMark.push(`${names[i]}!`);
}

console.log(newNamesWithExcMark);


// Gaya deklaratif = what to solve -> pakai map() utk solvenya
const names2 = ['Harry', 'Ron', 'Jeff', 'Thomas'];

const newNamesWithExcMark2 = names.map((name) => `${name}!`);

console.log(newNamesWithExcMark);










/**
 * TODO:
 * Buatlah variabel greatAuthors yang merupakan array
 * berdasarkan hasil filter() dan map() dari books:
 *   - Gunakan fungsi filter untuk mengembalikan nilai item books
 *     yang hanya memiliki nilai sales lebih dari 1000000.
 *   - Gunakan fungsi map pada books yang sudah ter-filter,
 *     untuk mengembalikan nilai string dengan format:
 *     - `${author} adalah penulis buku ${title} yang sangat hebat!`
 *
 * Catatan: Jangan ubah nilai atau struktur dari books
 */
 const books = [
  { title: 'The Da Vinci Code', author: 'Dan Brown', sales: 5094805 },
  { title: 'The Ghost', author: 'Robert Harris', sales: 807311 },
  { title: 'White Teeth', author: 'Zadie Smith', sales: 815586 },
  { title: 'Fifty Shades of Grey', author: 'E. L. James', sales: 3758936 },
  { title: 'Jamie\'s Italy', author: 'Jamie Oliver', sales: 906968 },
  { title: 'I Can Make You Thin', author: 'Paul McKenna', sales: 905086 },
  { title: 'Harry Potter and the Deathly Hallows', author: 'J.K Rowling', sales: 4475152 },
];

const greatAuthors = [];
const booksFilter = books.filter(book => book.sales > 1000000);
const booksMap = books.map((author, title) => {return `${author} adalah penulis buku ${title} yang sangat hebat!`});

console.log(greatAuthors)