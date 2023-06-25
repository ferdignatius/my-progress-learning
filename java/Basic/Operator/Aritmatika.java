package Basic.Operator;

public class Aritmatika {
    public static void main(String[] args) {
        // aritmatika itu operator matematika => +,-,*,/,%
        double Tambah = Operasi(5,"+",3);
        double Kurang = Operasi(5,"-",3);
        double Kali = Operasi(5,"*",3);
        double Bagi = Operasi(5,"/",3);
        double SisaBagi = Operasi(5,"%",3);

        System.out.println("perjumlahan 5 + 3: " + Tambah);
        System.out.println("pengurangan 5 - 3: " + Kurang);
        System.out.println("pengurangan 5 * 3: "+Kali);
        System.out.println("pengurangan 5 / 3: "+Bagi);
        System.out.println("pengurangan 5 % 3: "+SisaBagi);


    }

    static double Operasi(double value1, String Operator, double value2){
        switch(Operator){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            case "%":
                return value1 % value2;
            default:
                return 0;
        }
    }
}
