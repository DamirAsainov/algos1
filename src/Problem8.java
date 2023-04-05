public class Problem8 {
    public boolean isNumeric(String s){
        if(s.length() == 0)
           return true;
        else{
            char chr = s.charAt(0);
            if(Character.isDigit(chr))
                return isNumeric(s.substring(1));
            return false;
        }
        /*
        @ isNumeric - finding minimum num in array
        @ arr - an array with int elements
        @ n - length of array
        @ return - returning min int in array
     */

    }
}
