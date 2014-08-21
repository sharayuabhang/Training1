package training.ideas.java.stringOperation;

/**
 * Created by idnsha on 20-08-2014.
 */
public class StringOperation {
    public static void main(String args[]){

        String inputString="Sharayu";
        String result="";
        String subStr="";
        String space="";
        for(int i=0;i<inputString.length();i++){
            space="";
            subStr=inputString.substring(i,i+1);
            result=subStr+result+subStr;
            for(int j=inputString.length()-1;j>i;j--){
                space=space+" ";
            }
            System.out.println(space+result+space);
        }
        result="";
        subStr="";
        space="";
        for(int i=inputString.length();i>0;i--){
            space="";
            subStr=inputString.substring(i-1,i);
            result=subStr+result+subStr;
            for(int j=0;j<i;j++){
                space=space+" ";
            }
            System.out.println(space+result+space);
        }


    }
}
