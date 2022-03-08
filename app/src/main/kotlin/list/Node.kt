package list

class Node<T>(var data: T? = null, var next: Node<T>? = null, var previous: Node<T>? = null) {
    constructor(value: T) : this() {
        this.data = value
        this.next = null
        this.previous = null
    }
}
