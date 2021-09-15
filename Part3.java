
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb){
        int occurrences = 0;
        int index = 0;
        
        while(true)
        {
            index = stringb.indexOf(stringa,index);
            if(index != -1)
            {
                occurrences++;
                index += stringa.length();
            }
            else
            {
                break;
            }
        }
        
        if(occurrences >= 2)
        {
            return true;
        }
        return false;
    }
    
    public String lastPart(String stringa, String stringb){
        int occurrence;
        String result;
        
        occurrence = stringb.indexOf(stringa);
        
        if(occurrence != -1)
        {
            result  = stringb.substring(occurrence,stringb.length());
        }
        else
        {
            result = stringb;
        }
        return result;
    }
    
    public void testing(){
        System.out.println("-------------------------------------------------");
        //String dna = "ATGAAATTTGGGTAATTT";
        String stringa = "abc";
        String stringb = "abcabcabc";
        if(twoOccurrences(stringa, stringb))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        String ans = lastPart(stringa,stringb);
        System.out.println(ans);
        
        stringa = "abc";
        stringb = "mnbmnbmnb";
        if(twoOccurrences(stringa, stringb))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        ans = lastPart(stringa,stringb);
        System.out.println(ans);
        
        stringa = "abc";
        stringb = "mnbabcmnb";
        if(twoOccurrences(stringa, stringb))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        ans = lastPart(stringa,stringb);
        System.out.println(ans);
        
        stringa = "abc";
        stringb = "mnbabcmnbabc";
        if(twoOccurrences(stringa, stringb))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        ans = lastPart(stringa,stringb);
        System.out.println(ans);
        System.out.println("-------------------------------------------------");
    }
}
