fun main(args: Array<String>) {

    // Эта программа считает объём параллелепипеда
    println("""Calculate the volume of the parallelepiped
        |First side length
    """.trimMargin())
    val side1 = readln().toInt()

    println("Second side length")
    val side2 = readln().toInt()

    println("Third side length")
    val side3 = readln().toInt()

    println("Result:")
    val volume = side1 * side2 * side3
    println(volume)

}