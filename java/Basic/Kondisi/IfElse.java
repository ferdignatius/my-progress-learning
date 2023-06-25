package Basic.Kondisi;

public class IfElse {
    public static void main(String[] args) {

        System.out.println(Checking("Bambang"));
        System.out.println(Checking(""));

    }

    static String Checking(String value){
        if (!value.isBlank()){ // ini untuk cek apakah valuenya kosong / tidak
            return "Hi" + value;
        }else {
         return "Masukkan Namamu Lah!";
        }
    }
}
