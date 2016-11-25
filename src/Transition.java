/**
 * Class that defines a Transition object
 */
public class Transition {
    private int source;
    private int target;
    private int count;

    Transition(int source, int target) {
        this.source = source;
        this.target = target;
        count = 0;
    }

    void update(){
        count++;
    }

    @Override
    public int hashCode(){
        // implements Cantor's pairing function
        int sum = source + target;
        return ((sum)*(sum + 1)/2) + target;
    }

    int getSource() {
        return source;
    }

    int getTarget(){
        return target;
    }

    int getCount() {
        return count;
    }
}
