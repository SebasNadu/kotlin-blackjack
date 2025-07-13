package blackjack.model.participant

import blackjack.model.card.Card
import blackjack.model.result.PlayerResultTracker

class Player(name: String) : Participant(name, PlayerResultTracker()) {
    private var bet: Int = 0
    private var profit: Int = 0

    val result: String
        get() = resultTracker.toString()
    val hand: List<Card>
        get() = _hand.cards

    fun placeBet(amount: Int) {
        bet = amount
    }
}
