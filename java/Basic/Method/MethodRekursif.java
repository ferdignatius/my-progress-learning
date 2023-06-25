package Basic.Method;

public class MethodRekursif {
    public static void main(String[] args) {
        /*
        Basic.Method Rekusif adalah method yang mereturn dirinya sendiri
        Mirip dengan while cuma ini memakai method
        */
        // memanggil method
        int Result = Faktorial(5);
        System.out.println(Result);

        // check bener / salah
        System.out.println(5*4*3*2*1);
    }

    /**
     * Basic.Method Rekursif
     * @param nilai = angka yang ingin kita faktorialkan
     * @return = hasil faktorial nilai
     */
    static int Faktorial(int nilai) {
        if (nilai == 1) {
            return 1;
        } else {
            return nilai * Faktorial(nilai - 1);
        }
    }
}

