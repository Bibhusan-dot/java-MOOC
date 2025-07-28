import java.util.HashMap;

public class Abbreviations {
    private String abbreviation;
    private String explanation;
    HashMap<String,String> abbreviations = new HashMap<>();
    public void addAbbreviation (String abbreviation, String explanation){
        this.abbreviation = abbreviation;
        this.explanation = explanation;
        abbreviations.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(abbreviations.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        if(abbreviations.containsKey(abbreviation)){
            return abbreviations.get(abbreviation);
        }
        return "Not Found!";
    }
}
