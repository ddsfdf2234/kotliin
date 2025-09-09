fun main(){
    print("Введите строку ")
    val test = readln()
    val testCount = test.groupingBy { it }.eachCount()
    println("")
    testCount.forEach { (test, count) -> print("$test$count") }
}

//Создать приложение, которое подсчитывает
// количество подряд идущих одинаковых символов
// во введенной строке. На вход подается, например,
// строка AAADSSSRRTTHAAAA. На выходе получаем
// A3DS3R2T2HA4. То есть, если количество подряд идущих
// символов меньше двух, то мы не пишем единицу


