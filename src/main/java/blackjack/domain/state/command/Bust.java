package blackjack.domain.state.command;

import blackjack.domain.hand.Hand;
import blackjack.domain.state.Finished;

public class Bust extends Finished {
    public Bust(Hand hand) {
        super(hand);
    }

    @Override
    public boolean isBlackjack() {
        return false;
    }

    @Override
    public boolean isBust() {
        return true;
    }
}
