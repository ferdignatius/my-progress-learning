// Overriding  = teknik untuk kita melakukan perombakan (baik secara keseluruhan maupun tidak) pada sebuah method ataupun constructor yang dimiliki oleh parent class.
// dengan menggunakan super() ->  digunakan untuk memanggil constructor parent dan hanya dapat digunakan di constructor.
// kita bisa overriding terhadap constructor dan method 

class Mail{
    constructor(author) {
      this._contacts = [];
      this.from = author;
    }
   
    sendMessage = function(msg, to) {
      console.log('you send:', msg, 'to', to, 'from', this.from);
      this._contacts.push(to);
    }
   
    showAllContacts() {
      return this._contacts;
    }
  }

class WhatsApp extends Mail {
    // overriding constructor
    constructor(username, isBussinessAccount, phoneNumber) {
        super(phoneNumber); // penggunaan super()
        this.username = username;
        this.isBussinessAccount = isBusinessAccount;
      }

    //   overriding method
      sendMessage(msg, to) {
        super.sendMessage(msg, to);
        console.log('Send by WA');
    }
}