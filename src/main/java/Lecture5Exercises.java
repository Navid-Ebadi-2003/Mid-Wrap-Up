import java.util.Random;
import java.util.ArrayList;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String pass = "";
        Random random = new Random();

        for (int i = 0; i<length ; i++){
            char c = (char) (random.nextInt(26) + 'a');
            pass+=c;
        }
        return pass;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {

        String chars = "abcdefghijklmnopqrstuvwxyz!@#$%^&*()_+<>?:{}|1234567890";
        Random random = new Random();
        String pass = "";

        if(length>1) {
            for (int i = 0; i < length - 2; i++) {
                int n = random.nextInt(26);
                pass += chars.charAt(n);
            }

            int n = random.nextInt(19) + 26;
            pass += chars.charAt(n);

            n = random.nextInt(10) + 45;
            pass += chars.charAt(n);

            return pass;
        }
        else {
            return null;
        }
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        int a =1;
        int b=0;
        int c=0;

        while (n>=a){
            fibo.add(a);
            c=a+b;
            b=a;
            a=c;
        }

        for(int i = 0; i<fibo.size();i++) {
            String binary = Integer.toBinaryString(fibo.get(i));
            int ones = 0;
            for(int g =0 ; g<binary.length(); g++){
                if(binary.charAt(g)=='1'){
                    ones++;
                }
            }
            if(n==(fibo.get(i)+ones)){
                return true;
            }
        }

        return false;
    }
}
