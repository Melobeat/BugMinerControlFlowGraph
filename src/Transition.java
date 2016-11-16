/**
 * Class that defines a Transition object
 */
public class Transition {
    private int source;
    private int target;
    private int count;

    public Transition(int source, int target) {
        this.source = source;
        this.target = target;
        count = 1;
    }

    public void update(){
        count++;
    }
}
