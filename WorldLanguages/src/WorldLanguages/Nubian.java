package WorldLanguages;

class Nubian extends Language{

    public Nubian(String languageName, int speakers) {
        super(languageName, speakers, "Eastern Africa", "Subject, object, verb");
    }
    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
        System.out.println("Fun fact: " + this.name + "-speakers were employed by Egypt as code talkers");
    }
}
