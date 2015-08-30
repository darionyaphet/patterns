package org.darion.yaphet.patterns.chainofResponsibility;

/**
 * Created by Darion.J.Yaphet on 15/8/30.
 */
public class LowerHandler implements Handler {
    private Handler handler;

    @Override
    public String handler(String info) {
        String result = info.toLowerCase();
        if (handler != null) {
            result = handler.handler(result);
        }
        return result;
    }

    @Override
    public void nextHandler(Handler handler) {
        this.handler = handler;
    }
}
