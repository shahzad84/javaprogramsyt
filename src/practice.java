//How to Read and Print an Integer value in Java

import java.util.Scanner;

class practice{
    public static void main(String[]args){
        System.out.println("Enter the no.");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Entered no.is : "+ a);
    }

}

