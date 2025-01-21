class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map : MutableMap<String, MutableList<String>> = mutableMapOf()

        for (s in strs) {
            val tmp = s.toCharArray().sorted().joinToString("")

            map.getOrPut(tmp){ mutableListOf() }.add(s)
        }

        return map.values.toList()
    }
}
