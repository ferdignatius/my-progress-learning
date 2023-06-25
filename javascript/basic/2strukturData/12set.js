// Set sederhananya merupakan kumpulan nilai (set of values)
// bedanya data pada Set tidak berurutan dan juga tidak diindeks. 

const numberSet = new Set([1, 4, 6, 4, 1]);

console.log(numberSet); // karena ada 1, 4nya  2x maka set akan membuang angka yang sama

// add() = Untuk menambahkan data ke dalam Set
numberSet.add(5);
numberSet.add(10);

// delete = kita juga bisa pakai delete, tapi yg di delete adalah nilainya, bukan indeksnya
numberSet.delete(1)

// Weakset
/**
 * Perbedaan antara WeakSet dan Set antara lain:
 * WeakSet tidak bisa menyimpan nilai primitif.
 * WeakSet bukan iterable dan hanya memiliki method add(), has(), dan delete().
 * WeakSet tidak memiliki properti size.
 */