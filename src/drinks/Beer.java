package drinks;

import interfaces.Package;

public class Beer extends Drink implements Package {

    private boolean isAlcoholic;

    public Beer(boolean isAlcoholic){
        this.isAlcoholic = isAlcoholic;
    }

    public boolean getIsAlcoholic(){
        return isAlcoholic;
    }

    public void setIsAlcoholic(boolean isAlcoholic){
        this.isAlcoholic = isAlcoholic;
    }

    @Override
    void printRecipe() {
        System.out.println("Yeast, water, wheat...");
    }

    @Override
    public void pack() {
        System.out.println("Put it in a protected box");
    }
}
