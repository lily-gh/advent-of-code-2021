package day01

fun main() {
    println("Day 01 Solution")

    val input = Day01Input.input

    var increases = 0
    for (i in 1..input.lastIndex) {
        if (input[i] > input[i - 1]) increases++
    }

    println("Increases: $increases")
}
