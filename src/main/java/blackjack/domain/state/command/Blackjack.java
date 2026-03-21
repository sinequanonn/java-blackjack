package blackjack.domain.state.command;

import blackjack.domain.hand.Hand;
import blackjack.domain.state.Finished;

public class Blackjack extends Finished {
    public Blackjack(Hand hand) {
        super(hand);
    }

    @Override
    public boolean isBlackjack() {
        return true;
    }

    @Override
    public boolean isBust() {
        return false;
    }

    @Override
    public double earningRate() {
        return 1.5;
    }
}
