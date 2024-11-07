package car;

public class AgeFinder {
    public String findNextAge(String input){
        if(input == null || input.length()==0){
            throw new IllegalArgumentException();
        }

        //Find the 2 digits
        String ageId = input.substring(2,4);
        int numAgeId =Integer.parseInt(ageId);

        if(numAgeId > 50){
            String result;
            result = "" + (numAgeId -49);
            if(result.length()==1){
                return "0"+result;
            }
        }
            return ("" + (numAgeId+50));
    }
}
