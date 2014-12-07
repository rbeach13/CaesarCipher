public class Caesar {
	public static void main(String args[]){
		String phrase = args[0]; ///user's input phrase to be coded
		String nShift = args[1]; ///user's shift amount 
		char code[] = phrase.toCharArray(); ///storing phrase 
		int shiftNumber = Integer.parseInt(nShift); ///storing shift amount

		for(int i = 0; i<code.length; i++){
			char temp = code[i];
			temp = (char)((int)temp + shiftNumber);
			char sto = code[i];
			code[i] = temp;

			if(code[i] > 122){
				code[i] -= 26;///keeps lowercase numbers lowercase
			}


			if(sto > 64 && sto < 91 && code[i] > 90){/// if upercase keep upercase
				code[i] -= 26;
			}

		}

		System.out.println(new String(code));
	
	}
}