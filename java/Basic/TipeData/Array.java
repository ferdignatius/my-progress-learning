package Basic.TipeData;

public class Array {
    public static void main(String[] args) {
        // array => kumpulan data yang diakses menggunakan index
        /**
         *syaratnya:
         * 1. harus sesuai dengan tipe data
         * 2. jadi penulisannya tipedata[] namaArraynya = {valuenya}
          */

        int[] Angka = {1, 3 ,4 ,2, 6, 2 ,1};
        System.out.println(Angka); // ini akan menampilkan code arraynya
        System.out.println(Angka[1]);
        System.out.println(Angka[0]);

        // merubah value array
        Angka[0] = 10;
        System.out.println(Angka[0]);


    }
}
