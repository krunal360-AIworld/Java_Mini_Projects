import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        int Number = 1+(int)(100*Math.random());

        System.out.println("The Number between 1 to 100 is generated : ");

        int k = 5;
         System.out.println("You have " + k + " attempts to guess the Corrct Number ");

         for(int i=0;i<k;i++){
            int guess = sc.nextInt();

            if(guess == Number){
                 System.out.println("Congratulations you gussed Number Correctly : " + guess);

            }
                else if(guess<Number){
                 System.out.println("Too Low! Try a larger number. " + guess);
                }
                else{
                 System.out.println("Too High! Try a smaller number " + guess);
                }

         }
          System.out.println("Sorry Your attempts are Finished the Number is : "+Number);
    }
}