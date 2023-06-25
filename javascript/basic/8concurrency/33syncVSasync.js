// Synchronus program = kode dijalankan berurutan (menunggu)
// Asynchronus program = kode tidak dijalankan berurutan (tidak menunggu), jadi kode akan terus berjalan meskipun yang lain belum selesai

// setTimeout() = adalah salah satu contoh function yang Asynchronus

console.log("Start")

setTimeout(() => {
    console.log("Waiting")
}, 3000)

console.log("Finish")

/*
Output :
Start
Finish
Waiting
*/