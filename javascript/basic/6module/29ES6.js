// Di ES6
// cara mengexport = export defaut
// contoh (file state.js)
const coffeeStock = {
    arabica: 100,
    robusta: 150,
    liberica: 200
};

export default coffeeStock;

// Cara mengimport = import ... from ...
// contoh (file index.js)
import coffeeStock from "./state.js";

// Kalau ada error, maka aktifkan ES6 dengan mengubah extensionnya dari .js ke .mjs di package.json

// Bagaimana kalau lebih dari 1 data?
// Sama solusinya
const coffeeStock2 = {
    arabica: 100,
    robusta: 150,
    liberica: 200
};

const isCoffeeMachineReady2 = true;

export {coffeeStock2, isCoffeeMachineReady2}; // tidak pakai default

// Cara mengimport = import ... from ...
// contoh (file index.js)
import {coffeeStock2 as stock, isCoffeeMachineReady2} from "./state.js";

console.log(stock)
console.log(isCoffeeMachineReady2)