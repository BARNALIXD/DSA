// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> a) {
        // code here
        Queue<Integer> p=new LinkedList<>();
        Queue<Integer> n=new LinkedList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)<0) n.add(a.get(i));
            else p.add(a.get(i));
        }
        int i =0;
        while (!p.isEmpty() && !n.isEmpty()) {    //check if anyone becomes empty
                a.set(i++, p.poll());
                a.set(i++, n.poll());
        }
       while (!p.isEmpty()) {
            a.set(i++, p.poll());
        }
        while (!n.isEmpty()) {
            a.set(i++, n.poll());
        }
      
    }
}