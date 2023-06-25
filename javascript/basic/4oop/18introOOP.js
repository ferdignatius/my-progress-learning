// Object Oriented Programming (OOP) adalah salah satu paradigma dalam dunia pemrograman komputer.
//  pendekatan berbasis objek, di mana suatu objek terdiri dari kumpulan atribut dan method di dalamnya.

// atribut adalah variabel yang digunakan untuk menyimpan nilai.
// method adalah fungsi yang digunakan untuk menjalankan suatu proses.

// OOP terdapat 4 pilar utama, yaitu encapsulation, abstraction, inheritance, dan polymorphism.




// KUIS
/**
 * TODO:
 * 1. Buatlah class bernama Animal dengan ketentuan:
 *    - Memiliki properti:
 *      - name: string
 *      - age: int
 *      - isMammal: boolean
 *    - Memiliki constructor untuk menginisialisasi properti:
 *      - name
 *      - age
 *      - isMammal
 * 2. Buatlah class bernama Rabbit dengan ketentuan:
 *    - Merupakan turunan dari class Animal
 *    - Memiliki method:
 *      - eat yang mengembalikan nilai string `${this.name} sedang makan!`
 *    - Ketika diinstansiasi, properti isMammal harus bernilai true
 * 3. Buatlah class bernama Eagle dengan ketentuan:
 *    - Merupakan turunan dari class Animal
 *    - Memiliki method:
 *      - fly yang mengembalikan nilai string `${this.name} sedang terbang!`
 *    - Ketika diinstansiasi, properti isMammal harus bernilai false
 * 4. Buatlah instance dari class Rabbit bernama "myRabbit" dengan ketentuan:
 *    - properti name bernilai: "Labi"
 *    - properti age bernilai: 2
 * 5. Buatlah instance dari class Eagle bernama "myEagle" dengan ketentuan:
 *    - properti name bernilai: "Elo"
 *    - properti age bernilai: 4
 */


class Animal {
    constructor(name, age, isMammal){
    this.name = name;
      this.age = age;
      this.isMammal = isMammal;
    }
    }
    
    class Rabbit extends Animal {
     eat(name) {
      return `${this.name} sedang makan!`;
     }
      
    }
    
    class Eagle extends Animal {
        constructor(isMammal){
            super(isMammal)
            this.isMammal = false;
        }
     fly() {
      return `${this.name} sedang terbang!`;
     }
    }  

    let myRabbit = new Rabbit("Labi", 2, true)
    let myEagle = new Eagle("Ole", 4, false)

    console.log(myRabbit)
    console.log(myEagle)