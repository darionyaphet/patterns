package org.darion.yaphet.patterns.chainofResponsibility;

/**
 * Created by Darion.J.Yaphet on 15/8/30.
 */
public class CapitalFirstLettersHandler implements Handler {
    private Handler handler;

    @Override
    public String handler(String info) {
        int size = info.length();
        String result = (info.charAt(0) + "").toUpperCase() + info.substring(1);
        if (handler != null) {
            result = handler(result);
        }
        return result;
    }

    @Override
    public void nextHandler(Handler handler) {
        this.handler = handler;
    }
}
