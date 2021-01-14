package stringCalculator;

public class Calculator {
	public int add(String arg){
		if(arg == null || arg.isEmpty()){
			return 0;
		}
		String[] numbers = arg.split("[//,;@#^&%\n]+");//cover all the regular expression by which we can make different string
		int sum = 0;
		for(String number : numbers){
			if(Integer.parseInt(number) > Integer.MAX_VALUE){
				return 0;
			}
			sum += Integer.parseInt(number);

		}
		return sum;
	} 
}
