package Basic.Method;

public class Method {
    public static void main(String[] args) {
        // Basic.Method itu sama saja dengan function
        // memanggil method
        sayHello();

        var Result = Jumlahkan(3,6);
        System.out.println(Result);

    }

    // method tanpa return (void)
    static void sayHello(){
        System.out.println("Hello Disana! Apa kabar?");
    }

    /**
     * Basic.Method untuk menjumlahkan 2 nilai
     * @param Parameter1 = nilai pertama (parameter)
     * @param Parameter2 = nilai kedua (parameter)
     * @return = hasil penjumlahan Parameter1 dan Parameter 2
     */
    static int Jumlahkan(int Parameter1, int Parameter2){
        return Parameter1 + Parameter2;
    }

}
