package org.darion.yaphet.patterns.chainofResponsibility;

/**
 * Created by Darion.J.Yaphet on 15/8/30.
 */
public class Main {
    public static void main(String[] args) {
        LowerHandler lowerHandler = new LowerHandler();
        CapitalFirstLettersHandler capitalFirstLettersHandler = new CapitalFirstLettersHandler();

        lowerHandler.nextHandler(capitalFirstLettersHandler);
        String info = lowerHandler.handler("dArIon");
        System.out.println(info);
    }
}
