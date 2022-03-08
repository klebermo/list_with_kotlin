package list

class List<T>(var root: Node<T>? = null) {
    fun insert(value: T) {
        var aux = root
        var auxPrevious: Node<T>? = null

        if(root == null) {
            root = Node(value)
        } else {
            while(aux != null) {
                auxPrevious = aux
                aux = aux?.next
            }
            aux = Node(value)
            aux?.previous = auxPrevious
            auxPrevious?.next = aux
        }
    }

    fun update(index: Int, value: T) {
        var aux = root
        var count = 1

        while(aux != null) {
            if(count == index) {
                aux?.data = value
                break
            }
            aux = aux?.next
            count += 1
        }
    }

     fun delete(index: Int) {
         var aux = root
         var auxPrevious: Node<T>? = null
         var count = 1

         while(aux != null) {
             if(count == index) {
                 auxPrevious?.next = aux?.next
                 break
             }
             auxPrevious = aux
             aux = aux?.next
             count += 1
         }
     }

     fun get(index: Int): T? {
         var aux = root
         var count = 1

         while(aux != null) {
             if(count == index) {
                 return aux?.data
             }
             aux = aux?.next
             count += 1
         }

         return null
     }

     fun find(value: T): Int? {
         var aux = root
         var count = 1

         while(aux != null) {
             if(aux?.data == value) {
                 return count
             }
             aux = aux?.next
             count += 1
         }
         
         return null
     }

     fun print() {
         var aux = root
         print("{")

         while(aux != null) {
             print(aux?.data)
             if(aux?.next != null) {
                 print(", ")
             } else {
                 print("")
             }
             aux = aux?.next
         }

         println("}")
     }

     fun sort(): List<T> {
         val result = List<T>()
         return result
     }
}
