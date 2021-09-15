 
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    
    public String findSimpleGene(String dna){
        String result = "";
        
        int startCodon = dna.indexOf("ATG");
        if(startCodon == -1)
        {
            return "";
        }
        
        int stopCodon = dna.indexOf("TAA", startCodon+3);
        if(stopCodon == -1)
        {
            return "";
        }
        result = dna.substring(startCodon,stopCodon+3);
        
        if((stopCodon-startCodon)%3 == 0)
        {
            return result;
        }
        return result;
    }
    
    
    public void testSimpleGene(){
        System.out.println("-------------------------------------------------");
        String dna = "ATGAAATTTGGGTAATTT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "CGATGGTTTG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "TTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "ATGGGTTTTTGTTCGTGGTAATG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        System.out.println("-------------------------------------------------");
    }
}
