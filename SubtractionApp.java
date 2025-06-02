import java.util.Random;
import java.util.Scanner;
public class SubtractionApp {
  public static void main(String...arg){
  Scanner input = new Scanner(System.in);
  Random rand = new Random();

  int count = 0, point = 0;

 while (true){  
 int count2 = 0;

 int number1 = rand.nextInt(50);
 int number2 = rand.nextInt(50);

     
   if (number1 > number2){
	for(int loop=0; loop < 2; loop++){
		System.out.println(number1 + "-" + number2);
		int score = number1 - number2;
		System.out.printf("input your answer: ");
		int option = input.nextInt();

		if(option == score){
			point++;
			loop = 2;
		}		

	}
        

  count++;
	
 } 



 if (count == 10)break;
 }
 System.out.println("your score is: "+ point);




}
}