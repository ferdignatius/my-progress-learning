// class = blueprint / base template

// Di dalam sebuah class, dapat terdiri dari properti dan method. 
// Properti merupakan karakteristik dari class, 
// method adalah kapabilitas atau kemampuan yang dimiliki oleh class.

// Prototype adalah properti internal yang akan selalu ada ketika sebuah objek dibuat.
//  penggunaan prototype dapat menghemat alokasi memori yang digunakan.


// Cara 1
// menggunakan prototype
function Mail() {
    this.from = 'pengirim@dicoding.com';
  };
   
  Mail.prototype.sendMessage = function(msg, to) {
    console.log(`you send: ${msg} to ${to} from ${this.from}`);
  };

const mail = new Mail();
mail.hasOwnProperty('sendMessage');
// hasilnya = false
 
// tanpa prototype
function Mail2(){
    this.from = "pengirim@dicoding.com",
    this.sendMessage = function(msg, to) {
      console.log(`you send: ${msg} to ${to} from ${this.from}`);
    } 
  };
const mail2 = new Mail2();
mail2.hasOwnProperty('sendMessage');
// hasilnya = true



// Cara 2
class Mail {
    constructor() {
        this.from = 'pengirim@dicoding.com';
    }
 
    sendMessage(msg, to) {
        console.log(`you send: ${msg} to ${to} from ${this.from}`);
    };
}
 
const mail1 = new Mail();
mail1.sendMessage('hallo', 'penerima@dicoding.com');
// Cara kedua pada dasarnya menggunakan prototype, penggunaan sintaksis class pada javascript hanyalah syntactic sugar dari prototype itu sendiri. 