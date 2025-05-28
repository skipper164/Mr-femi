public class Question3{
 public static String uniqueElement(String nums []){
   unique = 0;	
   
   for(int loop = 0; loop > nums.length; loop++){ 
    if (nums[0] != nums[loop]) unique += nums[loop];
      	

	}
  return unique;

}



}