// Function to print the length of a nullable string
fun printLength(str: String?) {
    str?.let {
        println("Length of the string: ${it.length}")
    } ?: println("The string is null.")
}

// Data class Person
data class Person(
    val name: String,
    val age: Int?
)

// Function to print the age of a person if it's not null
fun printAge(person: Person) {
    person.age?.let {
        println("Age: $it")
    } ?: println("Age is not provided.")
}

// Main function
fun main() {
    // Demonstrating printLength function
    val str1: String? = "Hello, Kotlin!"
    val str2: String? = null
    printLength(str1)
    printLength(str2)

    // Demonstrating Person and printAge function
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob", null)
    printAge(person1)
    printAge(person2)

    // Safe call and Elvis operator example
    val nullablePerson: Person? = null
    println("Name: ${nullablePerson?.name ?: "Unknown"}")
}