// Bagaimana jika kita butuh mengexport beberapa nilai
// contoh (file state.js)
const coffeeStock = {
    arabica: 100,
    robusta: 150,
    liberica: 200
};
 
const isCoffeeMachineReady = true;

// Solusinya = memanfaatkan object literal {}
module.exports = {coffeeStock, isCoffeeMachineReady}; 


// Cara importnya?
// Gunakan destructuring object
const {coffeeStock, isCoffeeMachineReady} = require('./state');
 
console.log(coffeeStock);
console.log(isCoffeeMachineReady);
 
/* output
{ arabica: 100, robusta: 150, liberica: 200 }
true
*/