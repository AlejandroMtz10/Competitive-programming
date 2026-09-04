class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases: if either list is null, return the other list
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        // Determine which node has the smaller value and recurse
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
