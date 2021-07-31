package backend;



public class CeaserLogic {

    private String word;// word to be encrypted
    private int key; //shift key
    private final int numberOfAlphabets=26;//number of letter of alphabet
    private final char[] letterOfAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};






    public CeaserLogic(String word,int key) {
      this.word=  word.toUpperCase();// change to uppercase

      this.key=key;
    }

    public String getWord() {
        return word; //return word to be encrypted
    }

    public String getEncoded() {//encryption method
        int encryptionIndex;
         StringBuilder encorded= new StringBuilder();
         String message=getWord();
        for (int j = 0; j < message.length(); j++) {
            int finalIndex;
            if(message.charAt(j)!=' ') {
                char strChar = message.charAt(j);

                int index = new String(letterOfAlphabet).indexOf(strChar);//index of each character in the alphabet array

                encryptionIndex = index + this.key;

                if (encryptionIndex <= 25) {
                    finalIndex = encryptionIndex;
                } else {
                    finalIndex = encryptionIndex % numberOfAlphabets;
                }
                encorded.append(this.letterOfAlphabet[finalIndex]);
            }else encorded.append(' ');
        }

       return encorded.toString();// transform from string builder to a string



    }
    public String getDecord(){ //decryption method
       StringBuilder decorded= new StringBuilder();//
       int finalIndex;
       String encrypted= getEncoded();
       for(int i=0;i<encrypted.length();i++){
           if(encrypted.charAt(i)!=' ') {
               char decryChar = encrypted.charAt(i);
               int index = new String(letterOfAlphabet).indexOf(decryChar);
               int decryptionIndex = index - this.key;
               if (decryptionIndex >= 0) {
                   finalIndex = decryptionIndex;
               } else finalIndex = numberOfAlphabets - decryptionIndex;
               decorded.append(letterOfAlphabet[finalIndex]);//append each character to decoder
           }else decorded.append(' ');
       }
       return decorded.toString();// transform from string builder to a string
    }
}
