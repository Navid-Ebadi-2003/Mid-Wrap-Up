import java.util.Locale;

public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        if(n==0){
            return 1;
        }
        else {
            int m =1;
            for(int i =n ; i>1 ; i--){
                m*=i;
            }
            return m;
        }
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long x=1;
        long y=0;
        long z=0;

        if(n==1){
            return 1;
        }
        else {
            n--;
            for (int i = 0; i < n; i++) {
                z = x + y;
                y = x;
                x = z;
            }
            return z;
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String R ="";
        for(int i=word.length()-1 ; i>=0 ;i--){
            R += word.charAt(i);
        }
        return R;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String L = line.toLowerCase();
        L = L.replaceAll("\\s+" , "");
        if (L.equals(reverse(L))){
            return true;
        }else {
            return false;
        }
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {

        char[][] arr = new char[str1.length()][str2.length()];

        for (int i=0 ; i<str1.length();i++){
            for (int g =0 ; g<str2.length() ; g++){
                if(str1.charAt(i)==str2.charAt(g)){
                    arr[i][g]='*';
                }
                else {
                    arr[i][g]=' ';
                }
            }
        }
        return arr;
    }
}
