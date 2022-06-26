class RomanToInteger {

    fun romanToInt(s: String): Int {
        val map = hashMapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )

        var sum = 0
        for (i in s.indices) {
            if (i < s.length - 1 && map[s[i]]!! < map[s[i + 1]]!!) {
                sum -= map[s[i]] ?: 0
            } else {
                sum += map[s[i]] ?: 0
            }
        }
        return sum
    }
}