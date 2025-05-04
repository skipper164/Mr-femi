public class FemiSnack {
 
public static int findMultiple(int numb) {
  
System.out.print(numb * 5);
}



public static int displayAge(int age) {
 int years = age;
 int months = age * 12;
 long days = age * 365;
 long minutes = age * 525600;
 long seconds = age * 31536000;
 
System.out.print("years: " + years);
System.out.print("months: " + months);
System.out.print("days: " + days);
System.out.print("minutes: " + minutes);
System.out.print("seconds: " + seconds);
}


public static int displayDogAge(String name, int humanYear) {
  int human = humanYear * 7;
  System.out.println(name);
  System.out.print(humanYear +  " human year= " + human + " dog years");
}


public static int computeSumOfNumber(int number) {
 int thous = number / 1000;
 int hund = (number / 100) % 10;
 int tens = (number / 10)  % 10;
 int unit = number / 10; 

int sum = thous + hund + tens + unit;

System.out.print(sum); 

}



public static bool isLeapYear(int year) {
 if (year % 4 == 0 || year %  400 == 0) {
 System.out.print("true"); }
 else {
 System.out.print("false"); }

}


}
 
















