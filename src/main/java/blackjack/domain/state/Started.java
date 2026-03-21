package blackjack.domain.state;

import blackjack.domain.card.Card;
import blackjack.domain.hand.Hand;
import blackjack.domain.hand.Score;

import java.util.List;

public abstract class Started implements State {
    protected final Hand hand;

    protected Started(Hand hand) {
        this.hand = hand;
    }

    @Override
    public List<Card> cards() {
        return hand.getCards();
    }

    @Override
    public Score score() {
        return hand.calculateScore();
    }
}
