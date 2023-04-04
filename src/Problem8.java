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
    }
}
