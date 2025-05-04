package linkedList_problem;

public class ReverseLinkedList_L206 {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList_L206 solution = new ReverseLinkedList_L206();
        ListNode reversedHead = solution.reverseList(head);

        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}
