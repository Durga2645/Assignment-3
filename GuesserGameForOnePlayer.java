import java.lang.Math;
import java.util.Scanner;
class NumberGenerator
{
    public int generateNumber()
    {
        int range=10;
        int num=(int) (Math.random()*range)+1;
        return num;
    }
} 
class Player
{
    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number : ");
        int num=sc.nextInt();
        return num;
    }    
}
class Judge
{
    String name;
    int generatedNumber;
    int guessedNumber;
    int count;
    int score;
    Scanner sc=new Scanner(System.in);
    void title()
    {
        System.out.println("---------------------------------------------------WELCOME TO THE GAME---------------------------------------------");
        System.out.println("---------------------------------------------------GUESSING NUMBER GAME--------------------------------------------");
        System.out.println();
        System.out.println("Enter yes if you want play the game");
        System.out.println("Enter no if you want to exit the game");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("yes"))
        {
            generateRules();
        }
        else{
            System.exit(0);
        }
    }
    void generateRules()
    {
       System.out.println();
        System.out.println("Enter yes if you want know the rules : ");
        System.out.println("Enter No if you want quit the game");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("yes"))
        {
            System.out.println();
            System.out.println("This game consists of Ten rounds,where in each round a number will be generated and you have to guess the number");
            System.out.println("After ten rounds your scored will be given");
        }
        else{
            System.exit(0);
        }
        System.out.println();
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println();
        System.out.println("Enter yes if you enter into the game : ");
        System.out.println("Enter No if you want quit the game");
        String s1=sc.nextLine();
        if(s1.equalsIgnoreCase("yes"))
        {
            System.out.println();
            System.out.println("Game has Started :");

        }
        else{
            System.exit(0);
        }
    }
    void collectGenerateNumber()
    {
        NumberGenerator n1=new NumberGenerator();
        generatedNumber=n1.generateNumber();
        System.out.println("A number has been generated");
        collectPlayerGuessedNumber();
    }
    void collectPlayerGuessedNumber()
    {
        Player p1=new Player();
        guessedNumber=p1.guessNumber();
        if(guessedNumber >=1 && guessedNumber <=10)
        {
            compare();
        }
        else
        {
            System.out.println();
            System.out.println("Enter the number in between 1 and 10");
            collectPlayerGuessedNumber();
        }
        
    }
    void compare()
    {
        if(generatedNumber == guessedNumber)
        {
            count++;
            System.out.println("Good Keep going");
            System.out.println();
        }
        else
        {
            System.out.println("Good Keep going");
        }
    }
    int evalautingScores()
    {
        score = count*10;
        return score;
    }
}
class Test
{
    public static void main(String[] args)
    {
        Judge j=new Judge();
        j.title();
        for(int i=1;i<=10;i++)
        {
            System.out.println("*****************************************" +i + "Round********************************************");
            
            j.collectGenerateNumber();
            System.out.println();
        }
        int finalScore=j.evalautingScores();
        if(finalScore==10)
        {
            System.out.println("*******************************Your Score is "+finalScore+ " Better Luck Next Time "+ j.name+"************************************");
        }
        else if(finalScore==20)
        {
            System.out.println("************************************Your Score is "+finalScore+"  Better Luck Next TIme " +j.name+"************************************");
        }
        else if(finalScore==30)
        {
            System.out.println("************************************Your Score is "+finalScore+ " Better luck Next Time "+j.name+"************************************");
        }
        else if(finalScore==40)
        {
            System.out.println("************************************Your Score is "+finalScore+ " Better luck Next Time "+j.name+"************************************");
        }
        else if(finalScore==50)
        {
            System.out.println("************************************Your Score is "+finalScore+ " Not Bad"+j.name+"************************************");
        }
        else if(finalScore==60)
        {
            System.out.println("************************************Your Score is "+finalScore+ " Good Job "+j.name+"************************************");
        }
        else if(finalScore==70)
        {
            System.out.println("************************************Your Score is "+finalScore+ " Great Job "+j.name+"************************************");
        }
        else if(finalScore==80)
        {
            System.out.println("************************************Your Score is "+finalScore+ " Amazing and you reached to the thired position "+j.name+"************************************");
        }
        else if(finalScore==90)
        {
            System.out.println("************************************Your Score is "+finalScore+ " wow you have very good guessing and you reached to the secomg highest "+j.name+"************************************");
        }
        else if(finalScore==100)
        {
            System.out.println("************************************Your Score is "+finalScore+ " Congratulations You have won the game "+j.name+"************************************");
        }
        else{
            System.out.println("************************************Your Score is "+finalScore+" Try again "+j.name+"************************************");
        }
    }
}