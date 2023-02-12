fun main(args: Array<String>) {
    println("Calculator CLI")
    println("")

    var input = readLine()

    while (input != null) {
        println(input)
        splitString(input)

        input  = readLine()
    }
}

fun splitString(input: String?) {

    if (input != null) {
        val splitStrings = input.split(" ").toMutableList()
        if(splitStrings[1] == "+"){
            splitStrings.removeAt(1)
//            val newJoinString = splitStrings.joinToString(separator = "+")
//            arrData.add(newJoinString)
            val val1 =  splitStrings[0].toInt()
            val val2 = splitStrings[1].toInt()
            val newVal = val1 + val2
            println(newVal)
        }

        if(splitStrings[1] == "-"){
            splitStrings.removeAt(1)
//            val newJoinString = splitStrings.joinToString(separator = "+")
//            arrData.add(newJoinString)
            val val1 =  splitStrings[0].toInt()
            val val2 = splitStrings[1].toInt()
            val newVal = val1 - val2
            println(newVal)
        }

        if(splitStrings[1] == "*"){
            splitStrings.removeAt(1)
//            val newJoinString = splitStrings.joinToString(separator = "+")
//            arrData.add(newJoinString)
            val val1 =  splitStrings[0].toInt()
            val val2 = splitStrings[1].toInt()
            val newVal = val1 * val2
            println(newVal)
        }

        if(splitStrings[1] == "/"){
            splitStrings.removeAt(1)
//            val newJoinString = splitStrings.joinToString(separator = "+")
//            arrData.add(newJoinString)
            val val1 =  splitStrings[0].toInt()
            val val2 = splitStrings[1].toInt()
            val newVal = val1 / val2
            println(newVal)
        }

        if(splitStrings[1] == "^"){
            splitStrings.removeAt(1)
//            val newJoinString = splitStrings.joinToString(separator = "+")
//            arrData.add(newJoinString)
            val val1 =  splitStrings[0].toInt()
            val val2 = splitStrings[1].toInt()
            val newVal = Math.pow(val1.toDouble(), val2.toDouble())
            println(newVal)
        }

        if(splitStrings[1] == "%"){
            splitStrings.removeAt(1)
//            val newJoinString = splitStrings.joinToString(separator = "+")
//            arrData.add(newJoinString)
            val val1 =  splitStrings[0].toInt()
            val val2 = splitStrings[1].toInt()
            val newVal = val1 % val2
            println(newVal)
        }


    }
}
