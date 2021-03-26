import java.util.Scanner;

public class UzairTask {
public static void main(String[] args) {
	String input="";
	Scanner sc= new Scanner(System.in);
	input=sc.nextLine();
	String word=input;
	String[] split=input.split(" ");
	if(split.length>1)word=split[0];
	
	String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
    
	for (int i = 0; i < word.length(); i++) {
		if(!specialCharacters.contains(word.charAt(i)+"")) {
			word=word.substring(i);
			break;
		}
	}
	System.out.println(word);
}
}
