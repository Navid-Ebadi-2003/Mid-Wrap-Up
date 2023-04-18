import java.util.ArrayList;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum=0;
        for (int i =0 ;i<arr.length; i+=2 ){
            sum+=arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] Arr = new int[arr.length];
        for (int i =0;i<arr.length;i++){
            Arr[i]=arr[arr.length-1-i];
        }
        return Arr;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double[][] M=new double[m1.length][m2[0].length];
        for (int i=0;i<m1.length;i++){
            for(int j=0;j<m2[0].length;j++){
                for (int h =0 ; h<m1[0].length;h++) {
                    M[i][j]+=m1[i][h]*m2[h][i];
                }
            }
        }
        return M;

    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> list = new ArrayList<List<String>>();
        for(int i=0;i<names.length;i++){
            list.add(new ArrayList<String>());
            for (int j=0;j<names[i].length;j++){
                list.get(i).add(names[i][j]);
            }
        }
        return list;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> N =new ArrayList<Integer>();

        for(int i=2 ; i<=n ; i++){
            if(n%i==0){
                boolean isPrime = true;
                for(int j =2 ; j<i ; j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime){
                    N.add(i);
                    System.out.println(i);
                }
            }
        }
        return N;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        String[] W = line.split("[!@#$%^&*()_+<>?:{}| .,]");
        List<String> word = new ArrayList<String>();
        for(String i: W){
            if(i.equals("")){

            }
            else {
                word.add(i);
            }
        }
        return word;
    }
}
