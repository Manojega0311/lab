//wrp to demo Queue collection with peek(),poll(),remove()
//Manovadhana M CG BATCH 2576
import java.util.LinkedList;
import java.util.Queue;
public class Test3
{
	public static void main(String[]args)
	{
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.add(100);
		queue.add(200);
		System.out.println("Peek = "+queue.peek());
		System.out.println("Poll = "+queue.poll());
		System.out.println("remove = "+queue.remove());
		
		
	}
} 