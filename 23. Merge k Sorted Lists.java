class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode head : lists) {
            if (head != null) // Ensures no "null" in minHeap
                minHeap.offer(head);
        }
        
        ListNode dummyHead = new ListNode(), cur = dummyHead;
        while (!minHeap.isEmpty()) {
            ListNode min = minHeap.poll();
            cur.next = min;
            cur = cur.next;
            
            if (min.next != null) // Ensures no "null" in minHeap
                minHeap.offer(min.next);
        }
        
        return dummyHead.next;
    }
}
