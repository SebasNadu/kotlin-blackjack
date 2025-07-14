package blackjack.model.participant

import blackjack.model.Bet
import blackjack.model.card.Card
import blackjack.model.result.PlayerResultTracker

class Player(name: String) : Participant(name, PlayerResultTracker()) {
    private var bet: Bet = Bet.zero()
    val result: String
        get() = resultTracker.toString()
    val hand: List<Card>
        get() = _hand.cards

    fun placeBet(amount: Double) {
        bet = Bet(amount)
    }
}
