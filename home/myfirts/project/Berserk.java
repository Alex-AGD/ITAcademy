package home.myfirts.project;



import home.myfirts.project.forImport.Party;

public class Berserk extends Party {

    private String typeImmuneAllAtack;


    public String getTypeImmuneAllAtack() {
        return typeImmuneAllAtack;
    }

    public void setTypeImmuneAllAtack(String typeImmuneAllAtack) {
        this.typeImmuneAllAtack = typeImmuneAllAtack;
    }

    @Override
    public void crashFace() {
        System.out.println("Crash faces active");   // (полиморфизм) перегрузка метода т.к
        // берсерк наследутся от класса party но уже с другими параметрами и + exteds (импортирован)


    }

    public Berserk(int skolkoVodki, String domName, boolean berserk) {
        super(skolkoVodki, domName, berserk);






    }

}
