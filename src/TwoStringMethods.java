
public class TwoStringMethods {

    public static void main(String[] args) {

        System.out.println(abcTest("123abc."));
        System.out.println(alternateStrings("Thereee", "xxxx"));
    }

    public static String alternateStrings(String a, String b) {
        String newWord = "";
        if(a.length()> b.length()) {
            for(int i = 0; i < b.length() ; i++) {
                newWord += a.substring(i, i+1);
                newWord += b.substring(i, i+1);
            }
            newWord += a.substring(b.length());
        }else {
            for(int i = 0; i < a.length() ; i++) {
                newWord += a.substring(i, i+1);
                newWord += b.substring(i, i+1);
            }
            newWord += b.substring(a.length());
        }


        return newWord;
    }

    public static boolean abcTest(String word) {

        if (word.indexOf("abc")!= 1) {
            int index = word.indexOf("abc") -1 ;
            if(index > 0){
                if(word.substring(index, index+1).equals(".")){
                    return false;
                }
            }else {
                return true;
            }
        }

        return true;

    }




}
