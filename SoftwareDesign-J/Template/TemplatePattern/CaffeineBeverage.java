package Template.TemplatePattern;

public abstract class CaffeineBeverage {

    //Templatemethode: diese Methode kann nicht überschrieben werden!
    //muss FINAL sein!!!!!
    public final void prepareRecipe() {
        //Skelette unseres Algorithmus
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    //die methoden die von der Template Methode aufgerufen werden sind ja nach Anwendungsfall abstract
    protected void boilWater() {
        System.out.println("Boiling Water");
    }
    protected abstract void brew();
    protected void pourInCup(){
        System.out.println("Pour in Cup");
    }
    protected abstract void addCondiments();

}

