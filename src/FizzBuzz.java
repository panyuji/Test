import java.util.*;

public class FizzBuzz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		for (int i=0;i<num;i++){
			System.out.println("\""+fizzBuzz(num).get(i)+"\"");
		}
	}
	public static List<String> fizzBuzz(int n){
		List<String> ans = new ArrayList<String>();
		for (int i=1;i<n+1;i++){
			if (i%3!=0&&i%5!=0){
				ans.add(String.valueOf(i));
			}
			else if (i%3==0){
				ans.add("Fizz");
			}
			else if (i%5==0){
				ans.add("Buzz");
			}
			else {
				ans.add("FizzBuzz");
			}
		}
		return ans;
	}
}
