import java.util.HashSet;
import java.util.concurrent.BlockingQueue;

/**
 * Class that defines a Controller who react to new inputs
 */
public final class Controller {
    public static BlockingQueue<Edge> inputStream;
    private static HashSet<MethodGraph> methodGraphs;

    public static void main() {
        Edge currentEdge = null;
        try {
            currentEdge = inputStream.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(methodGraphs.contains(currentEdge.method)){

        }
    }
}
