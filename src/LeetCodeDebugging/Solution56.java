package LeetCodeDebugging;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

class Pair {
    int frq;
    char ch;

    public Pair(int frq, char ch) {
        this.frq = frq;
        this.ch = ch;
    }
}

public class Solution56 {
    public int leastInterval(char[] tasks, int n) {
        String res = "";
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        Stack<Pair> stack = new Stack<>();
        int k = 0, m = 0;
        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> {
            if (a.frq != b.frq) return b.frq - a.frq;
            return (int) (a.ch - b.ch);
        });
        for (int i = 0; i < tasks.length; i++)
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        for (char c : map.keySet()) {
            int frq = map.get(c);
            char ch = c;
            Pair curr = new Pair(frq, ch);
            heap.add(curr);
        }
        char r = heap.peek().ch;
        while (res.length() != tasks.length) {
            Pair curr = new Pair(0, 'a');
            while (!stack.isEmpty() && k == n) heap.add(stack.pop());
            if (!heap.isEmpty()) {
                curr = heap.peek();
                heap.poll();
            }
            if (res.isEmpty() || k == n) {
                res += curr.ch;
                curr.frq--;
                heap.add(curr);
                k = 0;
                m = 0;
                count++;
            } else if (!heap.isEmpty() && (res.charAt(res.length() - 1) != curr.ch && r != curr.ch) && m != map.size() - 1) {
                res += curr.ch;
                curr.frq--;
                heap.add(curr);
                k++;
                m++;
                count++;
            } else {
                k++;
                stack.push(curr);
                count++;
            }
        }
        return count;
    }
}