package m1_tasks;

class Repository{
	static String getCountryName(String countryCode)throws InvalidCodeException{
		int x=Integer.parseInt(countryCode);
		if(x>=70 && x<=90) 
			return "India";
			else if(x == 908)
			return "US";
			else if (x==001)
				return "Dial somewhere outside USA";
			else 
				throw new InvalidCodeException("No country with the given code found");
		}
}
class RepositoryImplementation{
public static String getCountry(String countryCode) throws InvalidCodeException{
	if((countryCode.length())>3 || countryCode.length()<2)
		throw new InvalidCodeException("Invalid code detail found ");
	else
		return Repository.getCountryName(countryCode);
	
}

}class InvalidCodeException extends Exception{
	public InvalidCodeException(String msg) {
		super(msg);
		
	}
}

public class Exception_m1 {
	public static void main(String[] args) throws InvalidCodeException {
		RepositoryImplementation obj= new RepositoryImplementation();
		System.out.println(obj.getCountry("91"));
		
	}
	

}


