import java.util.Scanner;
public class AtmAppStimulation {
 public static void main(String...arg){
  Scanner input = new Scanner(System.in);

System.out.println("welcome to semicolon bank ATM");

System.out.print("enter your account ballance: ");
int balance = input.nextInt();

int [] totalBalance = new int[20];
int count = 0;

int loop = 0;
while (true){
	System.out.print("enter withdrawal ammount multiples of N500 or N1,000: ");
	int withdrawal = input.nextInt();
	totalBalance[count] = withdrawal;



	if (withdrawal >= 500 && withdrawal % 10 == 0 && withdrawal >= withdrawal * 0.9  && balance - withdrawal > 100 && withdrawal < 20000){
		int charges = 100;
		count += 1;
		System.out.println("Transaction successful!");
		int newBalance =  balance - withdrawal - charges;
		
		System.out.println("withdrawal amount: N"+ withdrawal);
		System.out.println("withrawal fee: N"+ charges);
		System.out.println("Remaining balance: N"+ newBalance);
		System.out.println();

		balance = newBalance;
		}


	else System.out.println("invalid withdrawal amount");
	System.out.printf("Do you want to make another withdrawal?  YES(0)/NO(1) or press (3) to view transactions: ");
	loop = input.nextInt();
		
	if(loop == 3)System.out.printf("your transaction history is " + totalBalance);
	if(loop == 1)break;
	

}











}





}