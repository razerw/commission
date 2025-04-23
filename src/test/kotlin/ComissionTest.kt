import org.junit.Test
import ru.netology.moneyOrder


class ComissionTest {
    @Test
    fun chekComission(){
        val cardType = "Visa" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 500_000 // сумма осуществленных переводов в месяц
        val transfer = 150_000 //  осуществляемый перевод
        val maxLimit = 600_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }
    @Test
    fun chekComission7(){
        val cardType = "Visa" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 500_000 // сумма осуществленных переводов в месяц
        val transfer = 15000 //  осуществляемый перевод
        val maxLimit = 600_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }
    @Test
    fun chekComission10(){
        val cardType = "Visa" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 0 // сумма осуществленных переводов в месяц
        val transfer = 1 //  осуществляемый перевод
        val maxLimit = 600_000 // максимальный лимит в месяц
        val transactionLimit = 0 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }

    @Test
    fun chekComission2(){
        val cardType = "Мир" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 500000 // сумма осуществленных переводов в месяц
        val transfer = 160_000 //  осуществляемый перевод
        val maxLimit = 1_000_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }
    @Test
    fun chekComission6(){
        val cardType = "Мир" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 50000 // сумма осуществленных переводов в месяц
        val transfer = 160000000 //  осуществляемый перевод
        val maxLimit = 1_000_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }
    @Test
    fun chekComission9(){
        val cardType = "Мир" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 50000 // сумма осуществленных переводов в месяц
        val transfer = 16000 //  осуществляемый перевод
        val maxLimit = 1_000_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }
    @Test
    fun chekComission3(){
        val cardType = "Mastercard" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 5000 // сумма осуществленных переводов в месяц
        val transfer = 10_000 //  осуществляемый перевод
        val maxLimit = 60_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }

    @Test
    fun chekComission5(){
        val cardType = "Mastercard" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 500000 // сумма осуществленных переводов в месяц
        val transfer = 10_000 //  осуществляемый перевод
        val maxLimit = 60_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }
    @Test
    fun chekComission8(){
        val cardType = "Mastercard" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 500000 // сумма осуществленных переводов в месяц
        val transfer = 76_000 //  осуществляемый перевод
        val maxLimit = 60_0000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }

    @Test
    fun chekComission4(){
        val cardType = "" // тип карты (Mastercard, Visa, Мир)
        val transferAmountInMonth = 5000 // сумма осуществленных переводов в месяц
        val transfer = 10_000 //  осуществляемый перевод
        val maxLimit = 60_000 // максимальный лимит в месяц
        val transactionLimit = 150_000 // лимит одной операции
        val result = moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

    }
}