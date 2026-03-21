package blackjack.domain.state.command;

import blackjack.domain.card.Card;
import blackjack.domain.hand.Hand;
import blackjack.domain.state.Running;
import blackjack.domain.state.State;

public class Hit extends Running {

    public Hit(Hand hand) {
        super(hand);
    }

    @Override
    public State draw(Card card) {
        hand.add(card);
        if (hand.isBust()) {
            return new Bust(hand);
        }
        if (hand.isBlackjack()) {
            return new Blackjack(hand);
        }
        return new Hit(hand);
    }

    @Override
    public State stay() {
        return new Stand(hand);
    }
}
