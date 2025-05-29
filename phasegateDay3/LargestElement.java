public class LargestElement {
  public static void main(String...arg){
  int numbers[] = {4, 3, 80, 4, 5};

int largest = numbers[0];
int smallestIndex = 0;

for(int loop : numbers){
  if(loop > largest){
     largest = loop;
     smallestIndex ++;
  
     }

}
System.out.println("the largest element  is " + largest + " and the index is " + smallestIndex );

System.out.print(Occurrence.numberOfOccurrence("tinubu", 't'));
}


}