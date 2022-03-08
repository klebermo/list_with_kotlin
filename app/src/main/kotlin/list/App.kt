package list

fun main() {
    val list = List<Int>()

    list.insert(25)
    list.insert(32)
    list.insert(12)
    list.insert(17)
    list.insert(44)

    list.print()

    list.update(3, 55)

    list.print()

    list.delete(4)

    list.print()

    list.insert(107)
    list.insert(440)

    list.print()

    print("position 1 = ")
    print(list.get(1))
    println(".")

    print("position 6 = ")
    print(list.get(6))
    println(".")

    print("value 25 = ")
    print(list.find(25))
    println(".")

    print("value 440 = ")
    print(list.find(440))
    println(".")

    print("position 10 = ")
    print(list.get(10))
    println(".")

    print("value 106 = ")
    print(list.find(106))
    println(".")
}
