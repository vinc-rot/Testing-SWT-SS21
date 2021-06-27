package BezahlRechner;

public class Bezahlung {
	
	public static double calcIncome(String text) {
		
			
		String[] wordcount = text.split("\\s+");
		int words = wordcount.length;
		double bezahlung;	
		bezahlung=words*0.05;
		
		System.out.println("Text counts "+words+" words");
		System.out.println("Your Income: "+bezahlung+" €.");
		
		return bezahlung;
	}

	public static int countPictures(String text) {
		int count=0;
		int countImg = 0;
		String[] words = text.split("\\s+");
		
		for(int i = 0;i<words.length;i++) {
			if(words[i].equals("picture")) {
				count++;}}
		
		System.out.print("The count of pictures is "+count);
		
	    return count;
	}
}
