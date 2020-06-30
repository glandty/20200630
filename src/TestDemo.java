public class TestDemo {
    public static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while (pl != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        while (ps != pl && pl!= null && ps!= null) {
            ps = ps.next;
            pl = pl.next;
        }
        if(pl == ps && pl != null) {
            return pl;
        }
        return null;
    }



    public Node mergeTwoLists(Node headA,Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
            if(headA != null) {
                tmp.next = headA;
            }
            if(headB != null) {
                tmp.next = headB;
            }
        }
        return newHead.next;
    }


    public static void main (String[]args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(60);
        myLinkedList.addLast(57);
        myLinkedList.addLast(56);
        myLinkedList.addLast(55);
        myLinkedList.addLast(58);
        myLinkedList.display();
        //System.out.println(myLinkedList.contains(57));
        //System.out.println(myLinkedList.size());
        // myLinkedList.addIndex(4,59);
        // myLinkedList.display();
        //myLinkedList.remove(55);
        //myLinkedList.display();
        //myLinkedList.remove(59);
        //myLinkedList.display();
        //myLinkedList.remove(57);
//        //myLinkedList.display();
//        myLinkedList.addLast(56);
//        myLinkedList.addLast(56);
//        myLinkedList.display();
//        myLinkedList.removeAll(56);
//        myLinkedList.display();
        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(40);
        myLinkedList2.addLast(41);
        myLinkedList2.addLast(42);
        myLinkedList2.addLast(43);
        myLinkedList2.addLast(44);
        myLinkedList2.display();
        getIntersectionNode(myLinkedList.head, myLinkedList2.head);

    }

}