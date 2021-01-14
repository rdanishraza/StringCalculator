package stringCalculator;

public class Calculator {
	public int add(String arg){
		if(arg == null || arg.isEmpty()){
			return 0;
		}
		String[] numbers = arg.split(",");
		int sum = 0;
		for(String number : numbers){
			sum += Integer.parseInt(number);
		}
		return sum;
	} 
}
