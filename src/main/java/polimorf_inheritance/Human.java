package main.java.polimorf_inheritance;

public abstract class Human implements EyesColor, HairColor {
    private String Race;
    private String EyesColor;
    private String HairColor;

    public String getEyesColor() {
        return EyesColor;
    }

    public void setEyesColor(String eyesColor) {
        EyesColor = eyesColor;
    }

    public String getHairColor() {
        return HairColor;
    }

    public void setHairColor(String hairColor) {
        HairColor = hairColor;
    }

    public Human(String race) {
        Race = race;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public Human(String race, String eyesColor, String hairColor) {
        Race = race;
        EyesColor = eyesColor;
        HairColor = hairColor;
    }
};


