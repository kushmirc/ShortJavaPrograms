package WorldLanguages;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    public Language(String langName, int speakers, String region, String wOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = region;
        this.wordOrder = wOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }
    public static void main(String[] args) {
        Language japanese = new Language("Japanese", 120000000, "Japan", "Subject, object, verb");
        japanese.getInfo();

        Language noblin = new Nubian("Noblin", 545000);
        noblin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 2000000);
        burmese.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1000000000);
        mandarin.getInfo();
    }
}
