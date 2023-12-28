import java.math.BigDecimal;

public class Big_Decimal {
    public static void main(String[] args) {
        Bd();
    }

    static void Bd(){
        double x = 0.05; // floating point numbers
        double y = 0.06;

        System.out.println(y - x); //will not give the exact answer rather with some errors

        BigDecimal X = new BigDecimal("0.05");
        BigDecimal Y = new BigDecimal("0.06");
        BigDecimal ans = Y.subtract(X);

        System.out.println(ans); //this will give the exact ans

    }
}
