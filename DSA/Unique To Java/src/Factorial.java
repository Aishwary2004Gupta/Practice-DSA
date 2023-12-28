import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(12345)); //works
        //but wont work without the use of BigInteger
    }

    static  BigInteger factorial(int num){
        BigInteger ans = new BigInteger("1"); //initially its

        for (int i = 2; i <= num; i++){
            ans = ans.multiply(BigInteger.valueOf(i)); //cannot directly multiply with i as its a primitive thats why using BingInteger
        }

        return ans;
    }
}
