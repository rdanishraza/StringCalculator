package stringCalculator;

public class Calculator{
	public int add(String arg) throws NumberFormatException{
		if(arg == null || arg.isEmpty()){
			return 0;
		}
		String[] numbers = arg.split("[//,;@#^&%\n]+");//cover all the regular expression by which we can make different string
		int sum = 0;
		for(String number : numbers){
			if(Integer.parseInt(number) > Integer.MAX_VALUE){
				return 0;
			}
			try{
				if(Integer.parseInt(number) >= 0){ //only positive numbers are allowed

					sum += Integer.parseInt(number);
				}
			}catch(NumberFormatException e){  // if negative number appear it will throw an exception
				System.out.println("Negatives are not allowed");
			}
		}
		return sum;
	} 
}