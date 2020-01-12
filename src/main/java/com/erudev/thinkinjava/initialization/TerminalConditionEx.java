package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
class WebBank{

    boolean loggedIn = false;

    WebBank(boolean status){
        loggedIn = status;
    }

    public void logIn(){
        loggedIn = true;
    }

    public void logout(){
        loggedIn = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (loggedIn){
            System.out.println("Error, still logged in");
        }
        super.finalize();
    }
}

public class TerminalConditionEx {

    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);

        bank1.logout();
        new WebBank(true);
        System.gc();
    }
}
