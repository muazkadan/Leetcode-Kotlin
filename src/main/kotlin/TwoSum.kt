import java.lang.IllegalArgumentException

class TwoSum {

    fun withHashMap(num: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        num.forEachIndexed { index, i ->
            map[target - i]?.let {
                return intArrayOf(it, index)
            }
            map[i] = index
        }
        throw IllegalArgumentException("No solution")
    }

    fun withForLoop(num: IntArray, target: Int): IntArray {
        for (i in num.indices) {
            for (j in i + 1 until num.size) {
                if (num[i] + num[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No solution")
    }

}