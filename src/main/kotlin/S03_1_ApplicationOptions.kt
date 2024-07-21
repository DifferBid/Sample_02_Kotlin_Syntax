
fun main(){

    // Формирование сообщений для пользователя
    val userName = "Alice"
    println("Welcome, $userName! Have a great day!")

    // Форматирование вывода для логов
    val statusCode = 404
    val url = "/not-found"
    println("Error: Status code $statusCode at $url")

    // Генерация HTML или другого текста
    val title = "My Page"
    val content = "This is the content of the page."
    val html = """
    <html>
    <head>
        <title>$title</title>
    </head>
    <body>
        <p>$content</p>
    </body>
    </html>
    """.trimIndent()
    println(html)

    // SQL запросы
    val tableName = "Users"
    val query = "SELECT * FROM $tableName WHERE age > 18"
    println(query)
}