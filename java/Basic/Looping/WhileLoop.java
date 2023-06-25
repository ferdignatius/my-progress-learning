package Basic.Looping;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop biasa
        var index = 0;
        while (index < 5){
            System.out.println("BLOK");
            index++;
        }

        System.out.println("===================================");

        // do.. while loop
        var awal = 0;
        do {
            System.out.println("BANG");
            awal++;
        }while (awal < 5);

    }
}
