package Task3

fun main (){
    println(numberReversed(678))
}


fun numberReversed (a : Int ) : Int{
    var b = a.toString().toCharArray().reversedArray()
    var numberReverse = String(b).toInt()
    return numberReverse
}