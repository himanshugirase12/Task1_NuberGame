import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int noofguesses=0;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    game() {
        Random rc=new Random();
        this.number=rc.nextInt(100);
    }

    void usernumber(){
        System.out.print("Guess the number");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
    }    

    boolean iscorrectnumber(){
        noofguesses++;
        if(inputnumber==number){
            System.out.printf("You guess the correct number.It is %d.",number);
            return true;
        }

        else if(inputnumber>number){
            System.out.println("HIGH");
        }
        else if(inputnumber<number){
            System.out.println("LOW");
        }
        return false;
        }
    }
    
    public class Randomno {
        public static void main(String[] args) {
       
        game g=new game();
        boolean b= false;
        while(!b){
        g.usernumber();
        b=g.iscorrectnumber();
        } 
    }
}

