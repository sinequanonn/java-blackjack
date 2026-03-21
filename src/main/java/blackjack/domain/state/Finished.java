package blackjack.domain.state;

import blackjack.domain.card.Card;
import blackjack.domain.hand.Hand;

public abstract class Finished extends Started {

    public Finished(Hand hand) {
        super(hand);
    }

    @Override
    public State draw(Card card) {
        throw new IllegalArgumentException("종료된 상태에서 카드를 받을 수 없습니다.");
    }

    @Override
    public State stay() {
        throw new IllegalArgumentException("종료된 상태에서 스탠드를 할 수 없습니다.");
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
