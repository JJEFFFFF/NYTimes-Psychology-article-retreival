package PreProcess;

import Classes.*;

/**
 * This is for INFSCI 2140 in 2018
 * 
 */
public class WordNormalizer {
	// Essential private methods or variables can be added.

	// YOU MUST IMPLEMENT THIS METHOD.
	public char[] lowercase(char[] chars) {
		// Transform the word uppercase characters into lowercase.
        for(int i = 0; i<chars.length; i++) {
        	chars[i] = Character.toLowerCase(chars[i]);
        }
        return chars;
	}

	// YOU MUST IMPLEMENT THIS METHOD.
	public String stem(char[] chars) {
		// Return the stemmed word with Stemmer in Classes package.
		Stemmer stemming = new Stemmer();
        String str = "";
		stemming.add(chars, chars.length);;
		stemming.stem();
        str = stemming.toString(); 
		return str;
	}

}
