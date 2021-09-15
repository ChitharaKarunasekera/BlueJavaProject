
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    
    public String findSimpleGene(String dna, int startCodon, int stopCodon){
        String result = "";
        
        char char1 = dna.charAt(0);
        
        dna = dna.toUpperCase();
        
        startCodon = dna.indexOf("ATG");
        if(startCodon == -1)
        {
            return "";
        }
        
        stopCodon = dna.indexOf("TAA", startCodon+3);
        if(stopCodon == -1)
        {
            return "";
        }
        result = dna.substring(startCodon,stopCodon+3);
        
        if((stopCodon-startCodon)%3 == 0)
        {
            if(Character.isLowerCase(char1))
            {
                result = result.toLowerCase();
            } 
            return result;
        }
        return result;
    } 
    
    public void testSimpleGene(){
        System.out.println("-------------------------------------------------");
        //String dna = "ATGAAATTTGGGTAATTT";
        String dna = "atgaaatttgggtaattt";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna,0,0);
        System.out.println("Gene is " + gene);
        
        dna = "CGATGGTTTG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,0,0);
        System.out.println("Gene is " + gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,0,0);
        System.out.println("Gene is " + gene);
        
        dna = "TTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,0,0);
        System.out.println("Gene is " + gene);
        
        dna = "ATGGGTTTTTGTTCGTGGTAATG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,0,0);
        System.out.println("Gene is " + gene);
        System.out.println("-------------------------------------------------");
    }

}
