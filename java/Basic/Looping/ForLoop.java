package Basic.Looping;

public class ForLoop {
    public static void main(String[] args) {
        // for biasa
        for (byte i = 0; i < 5; i++){
            System.out.println("HALLO");
        }

        System.out.println("====================");

        // foreach => for untuk array
        int[] array = {1, 2, 3, 4, 10};
        System.out.println(array);

        for (var a:array) {
            System.out.println(a);

        }

    }
}
