
fun main (){

    // Вставка переменных в строку
    val name = "Victor"
    val age = 24
    // В этом примере переменные name и age встраиваются прямо в строку.
    val greeting = "Hello, $name! You are $age years old."
    println(greeting)

    // Вставка выражений в строку
    val length = 5
    val width = 3
    // Здесь результат вычисления выражения length * width вставляется в строку.
    val area = "The area of the rectangle is ${length * width} square units."
    println(area)

    // Многострочные строки
    val firstName = "John"
    val lastName = "Doe"
    val multiLineString = """
    |First Name: $firstName
    |Last Name: $lastName
    """.trimMargin()
    // Строковая интерполяция работает и в многострочных строках, обозначенных тройными кавычками (""").
    println(multiLineString)
}