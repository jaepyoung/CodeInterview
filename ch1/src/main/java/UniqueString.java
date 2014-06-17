/**
 * Created by jaepyoung on 6/14/2014.
 */
public class UniqueString {
    public boolean isUnique(String input) {
        for (int i=0;i<input.length();i++){
            if (input.substring(0,i).contains(input.substring(i,i+1))){
                return false;
            }
        }
        return true;
    }
}
