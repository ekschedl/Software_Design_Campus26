package Observer.MediaVerlag;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MedienVerlag mv = new MedienVerlag();

        Article  article1 = new Article("It snows finally","Snow is coming");
        Article  article2 = new Article("Homeoffice will be the new office","OfficeControverisies");

    AbonnentIn bruno = new PrintAbbonnentIn("Bruno", mv);
    AbonnentIn mina = new WebAbbonnentIn("Mina", mv);
    AbonnentIn charlie = new SMSAbbonnentIn("Charlie", mv);
    AbonnentIn david = new SMSAbbonnentIn("David", mv);

    mv.notifyObservers(article1);

    mv.notifyObservers(article2);


    }
}