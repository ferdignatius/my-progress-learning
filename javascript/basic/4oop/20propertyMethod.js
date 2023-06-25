// Property adalah atribut dari sebuah objek

class Mail {
    constructor(author) {
        this.from = 'pengirim@dicoding.com'; // property
        this.contacts = []; // property
        this.yourOtherProperty = 'the values'; // property
    }
    sendMessage(msg, to) { // method
        console.log(`you send: ${msg} to ${to} from ${this.from}`);
        this.contacts.push(to); // menyimpan kontak baru
    };

    // static method
    static isValidPhone(phone) {
        return typeof phone === 'number';
      }
}

// this -> digunakan sebagai tanda variable global dalam class itu, jadi bisa diakses oleh inner class / method dalam class itu

/**
Dalam OOP sendiri, properti dibagi menjadi 2:
1. Internal interface : method dan property yang dapat diakses oleh method lain namun tidak bisa diambil/dijalankan di luar kelas tersebut.
2. External interface : method dan property yang dapat diakses di luar kelas itu sendiri.

Sedangkan di dalam JavaScript sendiri terdapat 2 jenis akses identifier untuk sebuah field:
1. Public (default) : dapat diakses dari mana pun.
2. Private : hanya dapat diakses dari dalam kelas itu sendiri.
 */

// cara mengubah property menjadi private
/** 
cara 1, menggunakan var (hanya dapat digunakan pada penulisan kelas menggunakan statement `function`)
**/
var contacts = [];
// contoh
function Mail() {
    this.from = 'pengirim@dicoding.com';
    var contacts = [];
}
 
/**
cara 2, cara ini dapat digunakan pada penulisan kelas menggunakan statement `function` dan `class`
**/
this._contacts = []
// contoh
class Mail {
    constructor() {
        this._contacts = [];
        this.from = 'pengirim@dicoding.com';
    }
}
 




// class method = fungsi dalam objek

// static method = function atau method yang sama seperti class method, akan tetapi untuk mengaksesnya tidak perlu meng-instantiate class.
Mail.isValidPhone(089000000000) //true



// Constructor =  sebuah method/function yang dijalankan pertama kali ketika object dibuat
const mail1 = new Mail("emailku@dicoding.com");