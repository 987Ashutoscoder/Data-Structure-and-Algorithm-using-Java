import java.util.*;
class checkposorneg1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("number is postive");
        }else if(num <0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
// using nested loop
class checkposorneg2{
    public static void main(String[] args) {
        int num = 5;
        if(num>=0){
            if(num==0){
                System.out.println("num is zero");
            }
            else{
                System.out.println("number is positive");
            }}
            else{
            System.out.println("number is negative");
        }
    }
}
// using ternary operator
class checkposorneg3{
    public static void main(String[] args) {
        int num =0;
        // cond is + or -
        if(num==0){
            System.out.println("zero");
        }
        else{
            String res = num> 0 ? "num is +":"num is -";
            System.out.println(res);
        }
    }
}