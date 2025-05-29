public class Occurrence {

 public static int numberOfOccurrence(String name, char alphabet) {
   
   int counter = 0;
   for(int index = 0; index > name.length(); index++){
     if (alphabet == name.charAt(index)){ counter++;}

}
return counter;

}





}