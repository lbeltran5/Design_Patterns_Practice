package practice.designPatterns.observerDesignPattern;



public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
