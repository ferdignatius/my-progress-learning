package Basic.Method;

public class VariableArguments {
    public static void main(String[] args) {
        // lihat perbedaannya di pemanggilan method
        // memanggil method
        int[] KumpulanAngka = {1, 4, 2, 6, 3 , 5};
        ListArray(KumpulanAngka);

        System.out.println("======================");

        ListArrayDenganVariableArguments(1,2,4,5,6);

    }

    /**
     * Melakukan Foreach pada Array
     * @param Value = Array yang akan di foreach
     */
    static void ListArray(int[] Value){
        for ( int angka : Value){
            System.out.println(angka);
        }
    }

    /**
     * Mirip seperti yang foreach diatas, bedanya cuma di parameter, kalau ini parameternya bisa nyatu dan tak terbatas
     * @param Value = array yang akan di foreach
     */
    static void ListArrayDenganVariableArguments(int ...Value){
        for ( int nilai : Value){
            System.out.println( nilai);
        }
    }
}
