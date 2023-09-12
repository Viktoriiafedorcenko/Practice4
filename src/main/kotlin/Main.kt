fun main(args: Array<String>) {
    //1 zadacha
     fun printFullName(firstName: String, lastName: String)// функция , которая принимает 2 строки
     {
         println ("$firstName $lastName") //определенное как firstName и lastName
         printFullName("Victoria",  "Fedorchenko") // выводит полное имя  и фамилию
     }
    //2 zadacha
    printFullName( firstName = "Victoria" ,lastName = "Fedorchenko") //функция  used аргументы именнованые
    // 3 zadacha
    fun calculateFullName(firstName: String, lastName: String) : String// функция которая будет возвращать в виде строки
    {
        return firstName+lastName // сумма значений
        val fullName=calculateFullName("Victoria","Fedorchenko") //возращает полное имя в виде строки
    } // сохраняет имя в константе
        //4 zadacha
        fun calculateFullNameLength(firstName: String , lastName: String): Pair<String,Int> //
        {
            val fullName= "$lastName $firstName" // создание константы  полного имени включ лэстнейм и тд
            return Pair(fullName,fullName.length) // возвращает полное имя  и  длину имени
    }
    val fullNameLength=calculateFullNameLength("Victoria","Fedorchenko").second //узнаю длину имени
    //5 zadacha
    fun simpleNumber(number : Int ): Boolean // функция для проверки явл число простым
    {
        if (number <= 1)//условие,что если меьше или равно 1 не простое
        {
            return false // не просто если возвращаем ложь
        }
        for (i in 2 until number) // циклом от 2 до числа
        {
            if (number % i == 0)//делится ли число на какое-то без остатка
            {
                return false// если есть то возвращаем ложь если нет то правду
            }
        }
        return true
    }
    fun  main (){
        val number=20
        if (simpleNumber(number))// используя функцию узнаем явл ли число 20 простым
        {
            println("$number это простое число ")

        }
        else {
            println("$number это не не простое число ")
        }
    }
    // 6 zadacha
    fun  fibonacci(n:Int):Int {
        if (n<=0) // прми значении  меньше 0 должен возвращаться 0
        {return 0}
                if (n==1 || n==2)// код вернет значение 1 если равно 1 или 2
                { return 1}
            return fibonacci(n - 1) + fibonacci(n - 2) //возфвращение суммы через вызов Фибонначчи
            }
    println(fibonacci(1))//1
    println(fibonacci(2))//1
    println(fibonacci(3))//2
println(fibonacci(4))//3
        println(fibonacci(5)) //5
    println(fibonacci(6)) //8
    println(fibonacci(7))//13

    }





