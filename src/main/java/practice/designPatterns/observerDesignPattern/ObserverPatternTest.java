package practice.designPatterns.observerDesignPattern;

public class ObserverPatternTest {
    public static void main(String[] args){
        Subject subject = new Subject();

        new StringObserver(subject);
        new OctalObserver(subject);

        System.out.println("State change: 45");
        subject.setState(40);
        System.out.println("State change: 150");
        subject.setState(150);
    }
}
