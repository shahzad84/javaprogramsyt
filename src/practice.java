
//Ways to read input from console in Java

import java.util.Scanner;

class practice{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        System.out.println("Entered string is :"+ a);
        int b=obj.nextInt();
        System.out.println("Entered int is :"+ b);
        float c=obj.nextFloat();
        System.out.println("Entered float is :"+ c);
    }

}


