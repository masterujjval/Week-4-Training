package queue_interface.generate_binary_number;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public static Queue<String> generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        Queue<String> ans = new LinkedList<>();


        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            System.out.print(binary + " ");
            ans.offer(binary);// Print or store result

            // Generate next two binary numbers
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 5;
        Queue<String>ans=new LinkedList<>();
        ans=generateBinaryNumbers(N);
    }
}
