package backend;



public class CeaserLogic {
    private char[] toArr;
    private String word;
    private int key;
    private char[] letterOfAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String encoded;




    public CeaserLogic(String word,int key) {
      this.word=  word.toUpperCase();

      this.key=key;
    }

    public String getWord() {
        return word;
    }

    public String getEncoded() {
        int encryptionIndex;
         String str="";
         String message=getWord();
        for (int j = 0; j < message.length(); j++) {
            int finalIndex;
            char strChar = message.charAt(j);

            int index = new String(letterOfAlphabet).indexOf(strChar);
            if (index != -1) {
                encryptionIndex = index + this.key;

                if (encryptionIndex <= 25) {
                    finalIndex = encryptionIndex;
                } else {
                    finalIndex = encryptionIndex % 26;
                }
                str += this.letterOfAlphabet[finalIndex];
            }
        }

       return encoded= str;



    }
}
