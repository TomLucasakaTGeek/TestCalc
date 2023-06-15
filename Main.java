import java.util.*;
class Main {
  public static void main(String[] args) {
    
    System.out.println("7 8 9 X");             //Calculator Layout
    System.out.println("4 5 6 -");
    System.out.println("1 2 3 +");
    System.out.println("0 ^ / =");                       
    
    int ans=0,a,b;System.out.println();
                                                     //your choice  
    System.out.println("Press '+' to add the two numbers");
    System.out.println("Press '-' to subtract the two numbers");
    System.out.println("Press 'X' to multiply the two numbers");
    System.out.println("Press '/' to divide the two numbers");
    System.out.println("Press '^' to take index value");
    Scanner o = new Scanner(System.in);
    char s = o.next().charAt(0);
  
    switch(s)
    {
                                                           
    case '+': System.out.println("Enter first number");   //addition
              a=o.nextInt();
              System.out.println("Enter second number");
              b=o.nextInt();
                ans = a+b;
                break;                              
        
      case '-':System.out.println("Enter first number"); //subtract
               a=o.nextInt();
              System.out.println("Enter second number"); 
              b=o.nextInt();
                ans = a-b;
                break;
        
      case 'X':System.out.println("Enter first number"); //multiply
               a=o.nextInt();
               System.out.println("Enter second number");
               b=o.nextInt();
                ans = a*b;
                break;
        
      case '/':System.out.println("Enter first number"); //division
               a=o.nextInt();
               System.out.println("Enter second number");
               b=o.nextInt();
                ans = (int)a/b;
                break;
        
      case '^':System.out.println("Enter first number"); //exponent
               a=o.nextInt();
               System.out.println("Enter second number");
               b=o.nextInt();
                ans = (int)Math.pow(a,b);
                break;
        
      default : System.exit(0);     //everyone can run out of options
      }
    
    System.out.println("\n\n"+ans);    //Amswer
 }
}