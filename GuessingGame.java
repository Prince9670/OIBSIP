import java.util.Scanner;

class GuessingGame{

    public static void main(String args[]){

        int R = (int)(Math.random()*100+1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number below 100");
        int N = sc.nextInt();
        int C=1;
        while(N!=R){
            C++;
            if(N<R)
            System.out.println(N + "is smaller");
            else 
            System.out.println(N + "is G reater");
            System.out.print("Enter another number: ");
            N = sc.nextInt();
        }

        if(C==1)
        System.out.println("\nCongratulation!");
        else if(C==2)
        System.out.println("\nCongratulation!");
        else if(C==3)
        System.out.println("\nCongratulation!");
        else
        System.out.println("You win!");
    }
}