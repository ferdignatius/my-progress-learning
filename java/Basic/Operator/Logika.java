package Basic.Operator;

public class Logika {
    public static void main(String[] args) {
        // logika itu operator pembanding => <,>,<=,>=,!=
        var KurangDari = Operasi(5, "<", 3);
        var LebihDari = Operasi(5, ">", 3);
        var KurangDariSamadengan = Operasi(5, "<=", 3);
        var LebihDariSamadengan = Operasi(5, ">=", 3);
        var Bukan = Operasi(5, "!=", 3);

        System.out.println(" 5 < 3: " + KurangDari);
        System.out.println(" 5 > 3: " + LebihDari);
        System.out.println(" 5 <= 3: " + KurangDariSamadengan);
        System.out.println(" 5 >= 3: " + LebihDariSamadengan);
        System.out.println(" 5 != 3: " + Bukan);


    }

    static boolean Operasi(int value1, String Operator, int value2) {
        switch (Operator) {
            case "<":
                return value1 < value2;
            case ">":
                return value1 > value2;
            case "<=":
                return value1 <= value2;
            case ">=":
                return value1 >= value2;
            case "!=":
                return value1 != value2;
            default:
                return false;
        }
    }
}
