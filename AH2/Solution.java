import java.util.Scanner;
 public class Solution {
    static boolean isPrime(int x){
        //boolean answer=true;
        for (int i = 2;i<x;i++){
             //System.out.println("Iteration");
            if (x%i==0){
               
              return false;
                //System.out.println("Check");
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        //Solution solution =new Solution();
       //stem.out.println();
        //System.out.println();
        //System.out.println();

       Scanner console = new Scanner(System.in);
       System.out.println("Enter a number");
       int prime = console.nextInt();
       System.out.println(isPrime(prime));

    }
}