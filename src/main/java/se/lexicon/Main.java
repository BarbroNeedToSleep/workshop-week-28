package se.lexicon;

import se.lexicon.model.Candy;
import se.lexicon.model.ChoclateType;
import se.lexicon.model.Chocolate;
import se.lexicon.model.Soda;

public class Main {
    public static void main(String[] args) {


        Candy lemon = new Candy(15.00, "Lemon drops", true);

        System.out.println(lemon);

        Soda cola = new Soda(20.00, "Cola",false);

        System.out.println(cola);

        Chocolate center = new Chocolate(22.00, "Center", ChoclateType.Milk);

        System.out.println(center);
    }
}