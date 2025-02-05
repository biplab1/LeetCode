class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()

        val minHeap = PriorityQueue<Array<Int>>{ a, b -> if (a[1] == b[1]) b[0] - a[0] else a[1] - b[1]}

        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        for (key in map.keys) {
            minHeap.offer(arrayOf(key, map[key]!!))
            if (minHeap.size > k) {
                minHeap.poll()
            }
        }

        val result = IntArray(k)
        var index = 0

        while (minHeap.isNotEmpty()) {
            result[index++] = minHeap.poll()[0]
        }

        return result
    }
}
