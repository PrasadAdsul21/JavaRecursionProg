// for handling same characters & 
// neglecting copy, making all char 
// in unique format

import java.util.HashSet;

public class Recursubsequence2 {
    public static void subSeq(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
        }
        char currChar=str.charAt(idx);
        //to be
        subSeq(str, idx+1, newString+currChar,set);

        //not to be
        subSeq(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subSeq(str, 0, "",set);
    }
    
}
