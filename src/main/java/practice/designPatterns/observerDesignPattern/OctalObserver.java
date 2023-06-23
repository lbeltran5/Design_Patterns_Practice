package practice.designPatterns.observerDesignPattern;

import javax.security.auth.*;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Octal value: " + Integer.toOctalString(subject.getState()));
    }
}
