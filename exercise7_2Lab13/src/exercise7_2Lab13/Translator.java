package exercise7_2Lab13;

public class Translator {

	public static String translate(String word,String targetLanguage) {
		
		if(targetLanguage.equals("Bahasa Melayu")) {
			
			return "Selamat Pagi";
		}
		else{
			
			return "The language is not available";
		}
		
	}
}