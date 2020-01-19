package home.myfirts.project.forImport;

public class Party {

    private int skolkoVodki;                                     // свойства атрибуты
    private String domName;
    private boolean Berserk;

    public Party(int skolkoVodki, String domName, boolean berserk) {
        this.skolkoVodki = skolkoVodki;
        this.domName = domName;

        Berserk = berserk;
    }

    public int getSkolkoVodki() {
        return skolkoVodki;
    }

    public void setSkolkoVodki(int skolkoVodki) {
        this.skolkoVodki = skolkoVodki;
    }

    public String getDomName() {
        return domName;
    }

    public void setDomName(String domName) {
        this.domName = domName;
    }

    public boolean isBerserk() {
        return Berserk;
    }

    public void setBerserk(boolean berserk) {
        Berserk = berserk;
    }


    public void crashFace(){
        System.out.println("Набить лицо");
    }

    public void rush() {                                               //Метод обьекта
        if (skolkoVodki >= 0){
            System.out.println("Режим Rush house activated! ! ! !");
        } else {
            System.out.println("Всё чотка!!!");
        }
    }


    @Override
    public String toString() {
        return "Party Дом: " + domName + ", Сколько водки:" + skolkoVodki + " Берсерк:" + Berserk;

    }

}