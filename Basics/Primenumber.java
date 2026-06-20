import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int c=2;
        boolean isPrime=true;
        while(c<n){
            if(n%c==0){
                System.out.println("Not a Prime Number");
            } c=c+1;
        }
        System.out.println("Prime NUmber");

    }
}
