package Task1
class BankCard (codeCard : String) {
    var numberCard: String = ""
    private var codeCard = codeCard
    var passCard : String = ""

    fun  getCode () = codeCard
    fun initializationCard() {
        println("Для успешного пользования программой введите номер карты :")
        numberCard = readln()
        println("Введите пароль от личного кабинета банка")
        passCard = readln()
    }

    fun cardInfo() {
        println("Для получения полной информации о карте введите следующие данные\n" +
                "Номер карты")
        var numberCard1 = readln()
        println("Пароль от личного кабинета")
        var passCard1 = readln()
        var input = when {
            numberCard1 == numberCard && passCard1 == passCard -> println("Номер карты -" +
                    " ${numberCard}, пароль от личного кабинета - ${passCard}, " +
                    " код от карты - " + getCode())
            else -> println("Данные карты введены неверно")

        }
    }
}
