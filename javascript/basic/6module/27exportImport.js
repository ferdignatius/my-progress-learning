//  Modul bekerja dengan cara exporting dan importing nilai
//  Dalam environment Node.js
//  cara export = module.exports  
// contoh (file state.js)
const coffeeStock = {
    arabica: 100,
    robusta: 150,
    liberica: 200
  }
   
  module.exports = coffeeStock;


// Cara Import = require().
// COntoh (file index.js)
const coffeeStock = require('./state');
 
console.log(coffeeStock);

const makeCoffee = (type, miligrams) => {
    if (coffeeStock[type] >= miligrams) {
        console.log("Kopi berhasil dibuat!");
    } else {
        console.log("Biji kopi habis!");
    }
}
 
/* output
{ arabica: 100, robusta: 150, liberica: 200 }
*/


