package backend;

public class CeaserLogic {
    private char[] toArr;
    private String word;



    public CeaserLogic(String word) {
      this.word= word;
      this.toArr=this.word.toCharArray();
    }

    public char[] getToArr() {
        return toArr;
    }
}
