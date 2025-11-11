/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Pair {
    Node node; 
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        // TreeMap (already stored based on key)
        // class Info which will be storing complete node, and horizontal distance
        // Queue used for level order traversal

        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int curr_hd = p.hd;

            if (!map.containsKey(curr_hd)) {
                map.put(curr_hd, curr.data);
            }

            if (curr.left != null) {
                q.add(new Pair(curr.left, curr_hd - 1));
            }

            if (curr.right != null) {
                q.add(new Pair(curr.right, curr_hd + 1));
            }
        }

        for (int val : map.values()) {
            list.add(val);
        }

        return list;        
    }
}
