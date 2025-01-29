import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random choice =new Random();
        String options[]={"Rock","Paper","Scissors"};
        System.out.println("welcome to the rock paper scissor game");
        System.out.println("1:rock\n 2:paper\n 3:scissors");
        System.out.println("enter your choice: ");
        int userChoice =sc.nextInt();
        if(userChoice<1 || userChoice>3){
            System.out.println("out of the choice \n enter the choice with in the options");
        }
        int computerChoice=choice.nextInt(3);
        System.out.println("the computer chooses:"+(computerChoice));
        System.out.println("you chose: "+options[computerChoice]);
        if(userChoice - 1==computerChoice){
            System.out.println("it is a draw match");
        }
        else if((userChoice - 1==0 && computerChoice==2)||(userChoice - 1 ==1 && computerChoice==0)||(userChoice - 1 ==2 && computerChoice==1)){
            System.out.println("you won the match...!!!");
        }
        else{
            System.out.println("oops...!! computer own the match");
 }
}
}
