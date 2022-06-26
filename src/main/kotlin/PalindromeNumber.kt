class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var i = 0
        var j = str.length - 1
        while (j - i > 0) {
            if (str[i] != str[j]) {
                return false
            }
            i++
            j--
        }

        return true
    }
}