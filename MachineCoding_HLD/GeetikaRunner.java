package MachineCoding_HLD;


import java.util.Stack;
/*
stack:






[[25,null,null],3]
[[50,null,null],2]
*/


/*
                    50
                25
         12          37
      n     n     30     n
               n      n






*/


public class GeetikaRunner {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String args[]) throws Exception {
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = new Node (arr[0],null,null); // root-> [50,null,null]
        Pair rp = new Pair(root,1);// [root,1]
        Stack<Pair> st = new Stack<>();
        st.push(rp);
        int indx=1;
        System.out.println(root.data+" ");
        while(st.size()>0 || indx<arr.length) {  // 1
            Pair top = st.peek(); // 25,2
            if(top.state == 1){
                if(arr[indx] != null) {
                    System.out.println(arr[indx]+" ");
                    Node new_node = new Node(arr[indx],null,null);
                    top.node.left = new_node;
                    Pair lp = new Pair(top.node.left,1);// [[25,null,null],1]
                    st.push(lp);
                }
                else{
                    top.node.left=null;
                }
                top.state++;
                indx++;
            }
            else if(top.state== 2){ // 25,2
                if(arr[indx] != null){// 37
                    System.out.println(arr[indx]+" ");
                    Node new_node = new Node(arr[indx],null,null);
                    top.node.right = new_node;// 37
                    Pair rpp = new Pair(top.node.right,1); // 37,1
                    st.push(rpp);
                }
                else {
                    top.node.right = null;
                }
                top.state++;
                indx++;
            }
            else{
                st.pop();// 12 poped.
            }
        }
    }
}