// Dalam paradigma FP, fungsi bersifat reusable

// Array map() -> fungsinya akan mengembalikan array baru.
const newArray = ['Harry', 'Ron', 'Jeff', 'Thomas'].map((name) => { return `${name}!`}); // masukkan ! kedalam tiap array

console.log(newArray);
// [ 'Harry!', 'Ron!', 'Jeff!', 'Thomas!' ]

// Array filter() -> untuk melakukan proses penyaringan (filtering) terhadap nilai array yang ada.
const students = [
    {
      name: 'Harry',
      score: 60,
    },
    {
      name: 'James',
      score: 88,
    },
    {
      name: 'Ron',
      score: 90,
    },
    {
      name: 'Bethy',
      score: 75,
    }
  ];
  
const eligibleForScholarshipStudents = students.filter((student) => student.score > 85); // filter murid yang nilainya diatas 85
  
console.log(eligibleForScholarshipStudents);
// [ { name: 'James', score: 88 }, { name: 'Ron', score: 90 } ]



// Array reduce()
  const totalScore = students.reduce((acc, student) => acc + student.score, 0);
  
  console.log(totalScore);
  
  /**
   * output:
   * 313
   * 
   */



// Array some() = Fungsi ini akan menghasilkan nilai boolean.
const array = [1, 2, 3, 4, 5];
const even = array.some(element => element % 2 === 0);

console.log(even);

/** 
output true
**/



// array.find() = mirip array some() cuma akan menghasilkan satu nilai dari elemen yang pertama kali ditemukan berdasarkan kriteria tertentu dan akan menghasilkan nilai undefine bila tidak ada kriteria yang terpenuhi pada item array.
const findJames = students.find(student => student.name === 'James');
console.log(findJames);

/**
output
{ name: 'James', score: 88 }
**/


// array.sort() =  fungsi sort akan mengubah semua nilai dalam deretan menjadi bentuk string dan mengurutkannya secara ascending.
const months = ['March', 'Jan', 'Feb', 'Dec'];
months.sort();
console.log(months);
// output: [ 'Dec', 'Feb', 'Jan', 'March' ]

const array1 = [1, 30, 4, 1000];
const compareNumber = (a, b) => {
  return a - b;
};
const sorting = array1.sort(compareNumber);
console.log(sorting);

/**
output
[ 1, 4, 30, 1000 ]
**/



// array.every() = digunakan untuk mengecheck apakah semua nilai dari sebuah array sesuai dengan kriteria yang didefinisikan. Return boolean
const scores = [70,85,90];
const minimumScore = 65;

const examPassed = scores.every(score => score >= minimumScore);
console.log(examPassed);

/**
output
true
**/




// Array forEach = berfungsi untuk memanggil fungsi callback pada setiap iterasi index array. 
const names = ['Harry', 'Ron', 'Jeff', 'Thomas'];
//  tanpa foreach
for(let i = 0; i < names.length; i++) {
  console.log(`Hello, ${names[i]}!`);
}
// dengan foreach
names.forEach((name) => {
   // if(name === 'Jeff') continue; // Tidak Bisa!
    console.log(`Hello, ${name}`);
  });
/**
 * output:
 * Hello, Harry!
 * Hello, Ron!
 * Hello, Jeff!
 * Hello, Thomas!
 * 
 */