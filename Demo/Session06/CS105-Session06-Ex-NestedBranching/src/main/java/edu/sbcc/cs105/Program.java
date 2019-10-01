package edu.sbcc.cs105;

/**
 * 
 * @author remote
 *
 */
public class Program {

	/**
	 * 
	 * @param args - input args from commandline
	 */
	public static void main(String[] args) {
				
		
		AwardManager m = new AwardManager();
		
		String awardType = m.GetAward("Dependent", 2999, "Marital");
		
		System.out.println(awardType);
		
		
	}

}
