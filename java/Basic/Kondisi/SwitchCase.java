package Basic.Kondisi;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println(CekBuah("Jeruk"));
        System.out.println(CekBuah("Apel"));
        System.out.println(CekBuah("Tomat"));


    }

    static String CekBuah(String buah){
        switch (buah){
            case "Jeruk":
               return "ini buah Jeruk!";
            case "Apel":
                return "Ini buah Apel";
            default:
                return "Ini buah apaan dah?";
        }
    }
}
