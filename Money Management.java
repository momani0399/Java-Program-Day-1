import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
    Scanner in =new Scanner(System.in);
    System.out.print("Enter your month income:");
    int x=in.nextInt();
    System.out.println(x);
    double a=0.55;
    a=a*x;
    double b= 0.2;
    b=b*x;
    double c= 0.2;
    c=c*x;
    double d= 0.2;  
    d=d*x;
    double e= 0.2;
    e=e*x;
    double f= 0.06;
    f=f*x;
    System.out.println("NEC: "+(int)a);
    System.out.println("FFA: "+(int)b);
    System.out.println("EDU: "+(int)c);
    System.out.println("LTSS: "+(int)d);
    System.out.println("PLAY: "+(int)e);
    System.out.println("GIVE: "+(int)f);
}
}