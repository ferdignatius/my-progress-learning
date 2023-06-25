// 4 konsep besar yang ada di FP. Yakni Pure Function, Immutability, Recursive, dan High-Order Function.

/**
 *  Pure Function = konsep dari pembuatan fungsi yang mengharuskan fungsi untuk tidak bergantung terhadap nilai yang berada di luar fungsi atau parameternya. Sehingga mau seperti apa keadaanya, fungsi yang dibuat selalu menghasilkan sesuatu yang sama, terkecuali bila fungsi tersebut diberikan nilai parameter yang berbeda.
 *  dilarang keras untuk mengubah nilai yang berada di luar baik secara sengaja atau tidak sengaja. 
 *  pastikan 3 konsep ini ada pada fungsi yang Anda buat.
        Mengembalikan nilai yang sama bila inputannya (nilai parameter) sama.
        Hanya bergantung pada argumen yang diberikan.
        Tidak menimbulkan efek samping.
 */ 

// let PI = 3.14;
const hitungLuasLingkaran = (jariJari) => {
    // return PI * (jariJari * jariJari); 
    return 3.14 * (jariJari * jariJari); // PI lgsng ditulis di dalam biar gak bisa berubah 
  }
  
  console.log(hitungLuasLingkaran(4)); // 50.24
  console.log(hitungLuasLingkaran(4)); // 50.24
  console.log(hitungLuasLingkaran(8)); // 200.96
  console.log(hitungLuasLingkaran(8)); // 200.96



// Immutability =  objek tidak boleh diubah setelah objek tersebut dibuat. 
const names = ['Harry', 'Ron', 'Jeff', 'Thomas'];

const newNamesWithExcMark = names.map((name) => `${name}!`);

console.log({
    names,
    newNamesWithExcMark,
});



// Rekursif =  teknik pada sebuah function yang memanggil dirinya sendiri.
const countDown = start => {
    console.log(start);
    if(start > 0) countDown(start-1);
  };
  
countDown(10);



// Higher-Order Function = fungsi yang dapat menerima fungsi lainnya pada argumen; mengembalikan sebuah fungsi; atau bahkan keduanya.
// Array map() adalah salah satu contohnya
/**
 * Teknik Higher-Order Function biasanya digunakan untuk:
        Mengabstraksi atau mengisolasi sebuah aksi, event, atau menangani alur asynchronous menggunakan callback, promise, dan lainnya.
        Membuat utilities yang dapat digunakan di berbagai tipe data.
        Membuat teknik currying atau function composition.
 */
        const names2 = ['Harry', 'Ron', 'Jeff', 'Thomas'];

        const arrayMap = (arr, action) => {
          const loopTrough = (arr, action, newArray = [], index = 0) => {
            const item = arr[index];
            if(!item) return newArray;
            
            return loopTrough(arr, action, [...newArray, action(arr[index])], index + 1);
          }
        
          return loopTrough(arr, action);
        }
        
        
        const newNames = arrayMap(names, (name) => `${name}!` );
        
        console.log({
            names,
            newNames,
        });
        