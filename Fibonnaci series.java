import java.util.Scanner;
public class Fib {
public static void main(String[] args) {
//
//0 1 1 2 3 5 8 13...
// num1 = 0 1 1
//num2 = 1 1 2
//nextNum = 1 2 3
//nextNum = num1+num2
int num1 = 0;
int num2 = 1;
int nextNum;
int lengthOfSeries = 5;
System.out.println("enter of series");
for(int i =0;i<lengthOfSeries;i++) {
System.out.print(num1 + " ");
nextNum=num1+num2;
num1 = num2;
num2 = nextNum;
}
}
}