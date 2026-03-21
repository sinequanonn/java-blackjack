package blackjack.domain.state;

import blackjack.domain.card.Card;
import blackjack.domain.hand.Score;

import java.util.List;

public interface State {
    State draw(Card card);

    State stay();

    boolean isFinished();

    List<Card> cards();

    Score score();

    boolean isBlackjack();

    boolean isBust();
}
