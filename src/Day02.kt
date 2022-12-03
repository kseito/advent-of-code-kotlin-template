fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
        input.forEach {
            when(it) {
                "A X" -> sum += 3 + 1
                "A Y" -> sum += 6 + 2
                "A Z" -> sum += 0 + 3
                "B X" -> sum += 0 + 1
                "B Y" -> sum += 3 + 2
                "B Z" -> sum += 6 + 3
                "C X" -> sum += 6 + 1
                "C Y" -> sum += 0 + 2
                "C Z" -> sum += 3 + 3
            }
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        input.forEach {
            when(it) {
                "A X" -> sum += 0 + 3
                "A Y" -> sum += 3 + 1
                "A Z" -> sum += 6 + 2
                "B X" -> sum += 0 + 1
                "B Y" -> sum += 3 + 2
                "B Z" -> sum += 6 + 3
                "C X" -> sum += 0 + 2
                "C Y" -> sum += 3 + 3
                "C Z" -> sum += 6 + 1
            }
        }
        return sum
    }

    val input = readInput("Day02")
//    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
