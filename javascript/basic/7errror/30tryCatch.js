// Gunakan try dan catch untuk kasus error
// Konsepnya mirip If Else, cuma ini untuk cek error
try {
    console.log("Awal blok try");   
    errorCode; // simulasi error                     
    console.log("Akhir blok try"); 
} catch (error) {
    console.log("Terjadi error!");  
    console.log(error.name);
    console.log(error.message); // pesan
    console.log(error.stack); // urutan yang jadi error
}
 
/* output
Awal blok try
Terjadi error!
*/


// try-catch-finally
// finally akan ttp dijalankan meski error
try {
    console.log("Awal blok try");   
    errorCode; // simulasi error                     
    console.log("Akhir blok try"); 
} catch (error) {
    console.log("Terjadi error!");  
    console.log(error.name);
    console.log(error.message); // pesan
    console.log(error.stack); // urutan yang jadi error
} finally {
    console.log("finish")
}
/* output
Awal blok try
Terjadi error!
finish
*/