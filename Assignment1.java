// import java.util.*;
// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int x= sc.nextInt();
        
//         System.out.println(factorial(x));
//     }
//     public static int factorial(int x){
//         int fact=0;
//         if(x!=0){
//             fact = x*factorial(x-1);
//             return fact;
//         }
//         else{
//             return 1;
//         }
        
//     }
// }

import java.util.*;
public class Assignment1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x= sc.nextInt();
        int fact = 1;
        while(x>0){
            fact=x*fact;
            x=x-1;
        }
        System.out.println(fact);
    }
}
