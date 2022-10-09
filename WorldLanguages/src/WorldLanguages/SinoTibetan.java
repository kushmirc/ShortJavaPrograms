package WorldLanguages;

class SinoTibetan extends Language{
    public SinoTibetan(String nameLanguage, int speakers) {
        super(nameLanguage, speakers, "Asia", "Subject, object, verb");
        if (nameLanguage.contains("Chinese")) {
            this.wordOrder = "Subject, verb, object";
        }
    }
}
