package org.darion.yaphet.patterns.chainofResponsibility;

/**
 * Created by Darion.J.Yaphet on 15/8/30.
 */
public interface Handler {
    public String handler(String info);

    public void nextHandler(Handler handler);
}
