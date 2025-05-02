package ru.netology

import kotlin.math.max

const val ERROR_TYPE_CARD = -1
const val ERROR_MONTH_LIMIT = -2
const val ERROR_DAY_LIMIT = -3

fun main() {
    val cardType = "Visa" // тип карты (Mastercard, Visa, Мир)
    val transferAmountInMonth = 50000 // сумма осуществленных переводов в месяц
    val transfer = 150_000 //  осуществляемый перевод
    val maxLimit = 600_000 // максимальный лимит в месяц
    val transactionLimit = 150_000 // лимит одной операции
    moneyOrder(cardType, transfer, maxLimit, transactionLimit, transferAmountInMonth)

}

fun moneyOrder(cardType: String, transfer: Int, maxLimit: Int, transactionLimit: Int, transferAmountInMonth: Int): Int {
    return when (cardType) {
        "Ми" -> mirLimit(transfer, maxLimit, transactionLimit, transferAmountInMonth)
        "Mastercard" -> mastercardLimitAndCommission(transfer, maxLimit, transactionLimit, transferAmountInMonth)
        "Visa" -> visaLimitCommission(transfer, maxLimit, transactionLimit, transferAmountInMonth)
        else ->
            ERROR_TYPE_CARD
    }

}

fun mirLimit(transfer: Int, maxLimit: Int, transactionLimit: Int, transferAmountInMonth: Int): Int {
    val commission = 0
    return when {
        transferAmountInMonth + transfer > maxLimit -> {
            println("Опеация отменена, превышен месячный лимит в размере $maxLimit на: " + (transferAmountInMonth + transfer - maxLimit))
            ERROR_MONTH_LIMIT
        }

        transfer > transactionLimit -> {
            println("Операция отменена, превышен суточный лимит на операцию в размере $transactionLimit на: " + (transfer - transactionLimit))
            ERROR_DAY_LIMIT
        }

        else -> {
            println("Перевод в размере $transfer осуществлен.")
            commission
        }
    }
}

fun mastercardLimitAndCommission(transfer: Int, maxLimit: Int, transactionLimit: Int, transferAmountInMonth: Int): Int {
    var noCommissionLimitInMonth = 75_000 // сумма не облагаемая комиссией в месяц
    var commission: Int = 0
    return when {
        transferAmountInMonth + transfer > maxLimit -> {
            println("Опеация отменена, превышен месячный лимит в размере $maxLimit на: " + (transferAmountInMonth + transfer - maxLimit))
            ERROR_MONTH_LIMIT
        }

        transfer > transactionLimit -> {
            println("Операция отменена, превышен суточный лимит на операцию в размере $transactionLimit на: " + (transfer - transactionLimit))
            ERROR_DAY_LIMIT
        }

        transferAmountInMonth + transfer < maxLimit && transfer <= transactionLimit &&
                noCommissionLimitInMonth - transfer >= 0 -> {
            noCommissionLimitInMonth -= transfer
            println("Перевод в размере $transfer осуществлен.")
            commission
        }

        else -> {
            commission = ((transfer - noCommissionLimitInMonth) * 0.006 + 20).toInt()
            println(
                "Перевод в размере $transfer осуществлен.\n " +
                        "Комиссия за перевод составила: $commission."
            )
            commission
        }
    }
}

fun visaLimitCommission(transfer: Int, maxLimit: Int, transactionLimit: Int, transferAmountInMonth: Int): Int {
    val minCommission = 35 // минимальная комиссия за перевод
    val commission: Int = max(minCommission, (transfer * 0.0075).toInt())
    return when {
        transferAmountInMonth + transfer > maxLimit -> {
            println("Опеация отменена, превышен месячный лимит в размере $maxLimit на: " + (transferAmountInMonth + transfer - maxLimit))
            ERROR_MONTH_LIMIT
        }

        transfer > transactionLimit -> {
            println("Операция отменена, превышен суточный лимит на операцию в размере $transactionLimit на: " + (transfer - transactionLimit))
            ERROR_DAY_LIMIT
        }

        else -> {
            println("Перевод в размере $transfer осуществлен.\n " +
                    "Комиссия за перевод составила: $commission.")
            commission
        }
    }
}