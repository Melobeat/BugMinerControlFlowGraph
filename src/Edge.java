// the edges are handed over in a java.util.concurrent.BlockingQueue<Edge>
// someone creates a queue and gives it to the graph builder and executor
// in their constructors. When the executor observes that the program
// terminates, a special invalid edge with isFinished() returning true is
// returned.

public class Edge {
	// the method this edge is in
	public String method;
	// the last line we executed in this method
	public int lineFrom;
	// the line we reached from the last line
	public int lineTo;

	boolean isFinished() { return method == ""; }
	boolean isFirstLine() { return lineFrom == -1; }
}
