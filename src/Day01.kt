fun main() {
    fun part1(input: List<String>): Int {
        val list = mutableListOf<Int>()
        var tempValue = 0
        input.forEach {
            if (it.isEmpty()) {
                list.add(tempValue)
                tempValue = 0
            } else {
                tempValue += it.toInt()
            }
        }
        list.add(tempValue)
        return list.max()
    }

    fun part2(input: List<String>): Int {
        val list = mutableListOf<Int>()
        var tempValue = 0
        input.forEach {
            if (it.isEmpty()) {
                list.add(tempValue)
                tempValue = 0
            } else {
                tempValue += it.toInt()
            }
        }
        list.add(tempValue)
        list.sortDescending()
        return list[0] + list[1] + list[2]
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
