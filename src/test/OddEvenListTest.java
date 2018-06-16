package test;

import main.ListNode;
import main.OddEvenList;
import org.junit.Assert;
import org.junit.Test;

public class OddEvenListTest {
    @Test
    public void OddEvenList(){
        OddEvenList list = new OddEvenList();
        int[] input = new int[] {1,2,3,4,5,6,7,8};

        ListNode dummyHead = new ListNode(0);
        ListNode node = new ListNode(input[0]);
        dummyHead.next = node;
        for (int i = 1; i < input.length; i++) {
            node.next = new ListNode(input[i]);
            node = node.next;
        }

        ListNode results = list.oddEvenList(dummyHead.next);
        while (results != null) {
            System.out.println(results.val);
            results = results.next;
        }
    }
}
