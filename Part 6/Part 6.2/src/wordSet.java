import java.util.ArrayList;

public class wordSet {
    private ArrayList<String> words;

    public wordSet(){
        this.words = new ArrayList<>();
    }

    public void add(String word){
        this.words.add(word);
    }

    public boolean contains(String word){
        return this.words.contains(word);
    }

    public int palindromes(){
        int count = 0;
        for(String word:words){
            if(isPalindrome(word)){
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String word){
        int end = word.length() -1 ;

        int i = 0;
        while(i < word.length() /2){
            if(word.charAt(i) != word.charAt(end - i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
