import java.util.*;
class Main {
  public static void main(String[] args) 
  {
    //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Number of Length : ");
        int num = sc.nextInt();
        int myNumber =(int)(Math.random()*num);  
        int Usernumber = 0;

        do{
            System.out.print("Guess My Number (1- "+num+ ") ");
             Usernumber = sc.nextInt();

            //Condition Checking for If else
            if(Usernumber == myNumber)
            {
                System.out.println("WOOHOO ...  CORRECT NUMBER!!");
                break;
            }
            else if  (Usernumber > myNumber)
            {
                System.out.println("Your Number Is Too Large Please Try Again");
            }
            else 
            {
                System.out.println("Your Number Is Too Small Please Try Again");
            }
        }
        while(Usernumber >=0);
        System.out.print("My Number Was : ");
        System.out.println(myNumber);

    } // Main Funcation end
  }