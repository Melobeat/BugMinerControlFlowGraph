import java.util.HashSet;

/**
 * Class that defines a MethodGraph object
 */
public class MethodGraph {
    public String methodId;
    // private HashSet<Instruction> instructions;
    private HashSet<Transition> transitions;

    public MethodGraph(String methodId){
        this.methodId = methodId;
    }

    public void update(Edge edge){

    }

    public int hashCode(){
        return methodId.hashCode();
    }
}
