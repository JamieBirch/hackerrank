package main;

import java.util.Scanner;
import java.util.Stack;

public class TwoStacks {

    static class MyQueue<T> {
        Stack<T> stack1;
        Stack<T> stack2;

        public MyQueue(){
            this.stack1 = new Stack<T>();
            this.stack2 = new Stack<T>();
        }

        public void push(T x){
            stack1.push(x);
        }

        public void pop(){
            if(stack2.empty()){
                while(!stack1.empty()){
                    stack2.push(stack1.pop());
                }
            }

            stack2.pop();
        }

        public T peek() {
            T peek;

            if(stack2.empty()) {
                while(!stack1.empty()){
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();

        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.push(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.pop();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }



}
