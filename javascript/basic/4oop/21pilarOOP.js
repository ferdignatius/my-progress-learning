// Encapsulattion = kondisi di mana attribute atau method di dalam class dibungkus dan bersifat privat. Artinya objek lain tidak bisa mengakses atau mengubah nilai dari property secara langsung.
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


// Abstraction =  penerapan alami dari enkapsulasi. Abstraksi berarti sebuah objek hanya menunjukkan operasinya secara high-level. Misalnya kita cukup tahu bagaimana pesan dikirim atau diterima, namun kita tidak perlu tahu seperti apa proses enkripsi dan dekripsi isi pesan, atau bagaimana sebuah daftar contact dapat bertambah.

// Inheritance = pewarisan
// berguna jika ada beberapa objek bisa memiliki beberapa karakteristik atau perilaku yang sama, tetapi mereka bukanlah objek yang sama
// cara 1: menggunakan keyword `extends` jika menggunakan statement `class`
class ChildClassName extends ParentClassName{}
 
 
// cara 2: menggunakan `prototype` jika menggunakan statement `function` / `class`
ChildClassName.prototype = new ParentClassName()


// Polymorphism = objek dapat memiliki bentuk atau implementasi yang berbeda-beda pada satu metode yang sama
// misalkan: whatsapp dapat mengirim pesan suara sedangkan yang lainnya tidak, email dapat menyaring konten spam saat mengirim pesan sedangkan yang lain tidak. Perbedaan bentuk atau cara mengirim pesan tersebut merupakan contoh dari polymorphism.