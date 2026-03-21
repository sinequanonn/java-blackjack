package blackjack.domain.state;

import blackjack.domain.hand.Hand;

public abstract class Running extends Started {
    public Running(Hand hand) {
        super(hand);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean isBlackjack() {
        return false;
    }

    @Override
    public boolean isBust() {
        return false;
    }
}
