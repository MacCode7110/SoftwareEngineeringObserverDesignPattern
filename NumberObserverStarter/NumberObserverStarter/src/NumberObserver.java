/**
 *  https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 */
public class NumberObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("\nSecond state change: 10");
        subject.setState(10);
        System.out.println("\nThird state change: 128");
        subject.setState(128);
    }

}
