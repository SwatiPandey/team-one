package teamOne.userManagement.service;

/**
 * class to validate user input
 */
public class ValidateInput {
	
	
	/**
	 * Comapre two string to check if they are equal or not
	 * 	 * @param first
	 * @param second
	 * @return
	 */
	public static boolean CompareTwoFields(String first,String second){
		
		if(first.equalsIgnoreCase(second)){
			return true;
		}
		return false;
	}
}
