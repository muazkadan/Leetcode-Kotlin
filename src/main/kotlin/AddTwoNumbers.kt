class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var current1 = l1
        var current2 = l2
        var extra = 0
        while (current1 != null && current2 != null) {
            val total = current1.`val` + current2.`val` + extra
            extra = total / 10
            current2.`val` = total % 10

            current1 = current1.next
            current2 = current2.next
        }

        if (current1 != null) current2 = current1

        return l2
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

