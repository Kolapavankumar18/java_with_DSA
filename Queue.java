Deque:
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // Add at rear and front
        deque.addLast(20);
        deque.addLast(30);
        deque.addFirst(10);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        // Remove from front and rear
        System.out.println("Front removed: "
                + deque.removeFirst());
        System.out.println("Rear removed: "
                + deque.removeLast());

        System.out.println("Deque after removal: " + deque);
    }
}
output:

Deque: [10, 20, 30, 40]
Front removed: 10
Rear removed: 40
Deque after removal: [20, 30]

Enqueue:
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);
    }
}

Output:
[10, 20, 30]
