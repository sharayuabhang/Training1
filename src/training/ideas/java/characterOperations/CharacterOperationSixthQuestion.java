package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationSixthQuestion {


    public static int charOrpSixthQuestion(char[] charArray1, char[] charArray2) {
        boolean flag=false;
        int count3 =0;
        int findIndex=-1;
        char findChar=' ';
        int k=0;
        int n=0;
        if (charArray1.length>charArray2.length){
            for(int count1=k;count1<charArray2.length;count1++){
                    findChar=charArray2[count1];
                for(int count2=n;count2<charArray1.length;count2++){
                    if (charArray1[count2]==findChar) {
                        flag=true;
                        if (count3==0){
                            count3 = count2;
                        }
                            k=count1+1;
                            n=count2+1;
                        break;
                    }
                }
                if(flag==true) {
                    findIndex = count3;
                }
                else{
                    findIndex = -1;
                    break;
                }

             }
        }
        else{
            findIndex=-1;
        }
        return findIndex;
    }
}
