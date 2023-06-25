/**
 * 4 jenis pengujian
 * 1. static test = cek typo
 * 2. unit test = cek kerja kode
 * 3. integration test = cek function
 * 4. end-to-end test = uji app dari awal-akhir
 */

/**
 * Jest = framework testing untuk js
 * Langkah2 gunakan jest
 * 0. buka cmd/prompt/terminal
 * 1. masuk ke folder projek dan npm init
 * 2. npm install --save-dev jest
 * 3. pada package.json, tambahkan "test": "jest" di scripts
 * 
 * npm run test -- --coverage = jest akan mengenerate laporan ke dalam folder coverage 
 * 
 * https://devhints.io/jest
 */

// test('deskripsi dari testcase kamu', () => {
//     expect(perintah).matcher(nilai yang diekspektasikan);
// });
 
// contoh
test('dua tambah dua adalah empat', () => {
    expect(2+2).toBe(4);
});


// grouping test dengan describe
describe('pengujian olah aritmatika', () => {
    test('#1 dua tambah dua adalah empat', () => {
         expect(2+2).toBe(4);
    });
  
    test('#2 dua kali tiga adalah enam', () => {
         expect(2*3).toBe(6);
    });
 });


//  atau bisa juga buat file khusus testing = gradeCalculations.test.js. yang berisi :
const { averageExams } = require('../gradeCalculations');
 
test('it should return exact average', () => {
    const listValueOfExams = [80, 100, 100, 80];
    expect(averageExams(listValueOfExams)).toEqual(90);
})