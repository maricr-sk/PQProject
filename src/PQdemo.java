import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQdemo {


    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(5);
        pq.add(99);
        pq.add(-3);
        pq.add(0);
        // to make a min queue a max queue, multiply everything by -1 loading them, and on the way out
        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        System.out.println(pq);

        PriorityQueue<Integer> priorityQueuq = new PriorityQueue<>(
            new Comparator<Integer>(){
                public int Compare(Integer a, Integer b)){
                    return b - a;
                }
            }
        );

/*
public Node(char character, int frequency, Node lftChild, Node rightChild

set to state variables
binary sequence is intialized to ""
ISLEAF = (leftChild == null && rightChild == null) ? true: false;
this.CHARACTER = character
this.frequency = frequency

 */
    }
}
