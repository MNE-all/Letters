fun main(args: Array<String>) {
    println("Программа подсчёта одинаковых букв")
    print("Введите строку: ")
    val str = readln()
    var lastChar: Char = str[0]
    var count: Int = 0
    var newStr: String = lastChar.toString()

    for(i: Int in str.indices) {
        if (lastChar == str[i]) {
            count++
        } else {
            if (count > 1) newStr += count
            newStr += str[i]
            lastChar = str[i]
            count = 1
        }
    }
    if (count > 1) newStr += count

    println(newStr)
}