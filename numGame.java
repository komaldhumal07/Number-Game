import java.util.Random;
import java.util.Scanner;


class Game{
    public int number;
    public int inputNumber;
    public int noOfguesses;

    public int getnoOfguesses(){
        return noOfguesses;
    }
    public void setnoOfguesses(int noOfguesses){
      this.noOfguesses = noOfguesses;
    }

     Game(){
        Random R = new Random();
        this.number = R.nextInt(100);
    }
    void TakeUserInput(){
        System.out.println("guess the number");
     Scanner sc = new Scanner(System.in);
     inputNumber = sc.nextInt();
    
    }
    boolean isCorrectNumber(){
     if ( inputNumber ==number){
        return true;
     }
     else if( inputNumber<number){
        System.out.println("Too low...");
     }
     else if( inputNumber>number){
        System.out.println("Too high...");
     }
     
        return false;
    }
}
public class Exercise{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){

        g.TakeUserInput();
        b = g.isCorrectNumber();
       System.out.println(b);
        }
    }
}
