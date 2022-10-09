package DNASequence;

public class DNA {

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;
        System.out.println(dna.length());

        //find index of start codon
        System.out.println(dna.indexOf("ATG"));
        //find index of stop codon
        System.out.println(dna.indexOf("TGA"));

//find a protein - a sequence containing start and stop and is divisible by 3
        if (dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1) {
            if ((dna.indexOf("TGA") - dna.indexOf("ATG")) % 3 == 0){
                System.out.println("Condition 1 and 2 and 3 are satisfied.");

                String protein = dna.substring(dna.indexOf("ATG"), dna.indexOf("TGA") + 3);
                System.out.println("Protein: "+ protein);
            }
        }
        else {
            System.out.println("No protein.");
        }
    }

}
