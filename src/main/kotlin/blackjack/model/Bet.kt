package blackjack.model

@JvmInline
value class Bet(val value: Double) {
    fun lose(): Bet = -this
    fun blackjack(): Bet = this * BLACKJACK_MULTIPLIER

    operator fun unaryMinus(): Bet = Bet(-value)
    operator fun times(multiplier: Double): Bet = Bet(value * multiplier)
    operator fun plus(other: Bet): Bet = Bet(value + other.value)

    companion object {
        private const val BLACKJACK_MULTIPLIER = 1.5
        private const val ZERO = 0.0
        fun zero(): Bet = Bet(ZERO)
    }
}