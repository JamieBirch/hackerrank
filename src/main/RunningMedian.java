package main;


import java.util.*;

public class RunningMedian {

    static class Heap {
        private Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
        private Queue<Integer> high = new PriorityQueue<>();

        public void add(int number) {
            Queue<Integer> target = low.size() <= high.size() ? low : high;
            target.add(number);
            balance();
        }

        private void balance() {
            while(!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()) {
                Integer lowHead= low.poll();
                Integer highHead = high.poll();
                low.add(highHead);
                high.add(lowHead);
            }
        }

        public double median() {
            if(low.isEmpty() && high.isEmpty()) {
                throw new IllegalStateException("Heap is empty");
            } else {
                return low.size() == high.size() ? (low.peek() + high.peek()) / 2.0 : low.peek();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Heap heap = new Heap();
        for(int a_i=0; a_i < n; a_i++){
            heap.add(in.nextInt());
            System.out.println(heap.median());
        }
    }
}
