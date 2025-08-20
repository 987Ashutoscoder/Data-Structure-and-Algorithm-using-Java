/*we will learn calculate HCF using methods : 1 Linear Quest to find HCF  2.Euclidean Algorithm : Repeated Subraction  3. Recursive Euclidean Algo 4.Modulo recursive euclidean algorithm  5.Handling negative numbers in HCF */

public class HCF {
    public static void main(String[] args) {
        int num1=3,num2=60,hcf=0;
        for(int i=1;i<=num1 || i<=num2;i++){
            if(num1 % i==0 &&  num2 %i==0) hcf=i;
        }
        System.out.println("The HCF:"+ hcf);
    }
}
// Initialize HCF = 1
// Run a loop in the iteration of (i) between [1, min(num1, num2)]
// Note down the highest number that divides both num1 & num2
// If i satisfies (num1 % i == 0 && num2 % i == 0) then new value of HCF is i
// Print value of HCF



