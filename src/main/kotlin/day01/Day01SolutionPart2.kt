package day01

fun main() {
    println("Day 01 Solution - Part 2")

    val input = Day01Input.input

    var sumIncreases = 0
    var previousSum = 0
    previousSum += input[0]
    previousSum += input[1]
    previousSum += input[2]

    var leftPointer = 0
    var rightPointer = 3
    var currentSum = previousSum
    while (rightPointer <= input.lastIndex) {
        currentSum -= input[leftPointer]
        currentSum += input[rightPointer]

        if (currentSum > previousSum) sumIncreases++

        leftPointer++
        rightPointer++
        previousSum = currentSum
    }

    println("Sum increases: $sumIncreases")
}
