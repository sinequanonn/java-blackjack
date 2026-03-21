package blackjack.domain.participant;

import blackjack.domain.card.Card;
import blackjack.domain.hand.Hand;
import blackjack.domain.hand.Score;
import blackjack.domain.state.State;
import blackjack.domain.state.command.Hit;

import java.util.Collections;
import java.util.List;

public abstract class Participant {
    private State state;

    public Participant() {
        this.state = new Hit(new Hand());
    }

    public void receiveCard(Card card) {
        this.state = state.draw(card);
    }

    public void stand() {
        this.state = state.stay();
    }

    public boolean isBust() {
        return state.isBust();
    }

    public Score getScore() {
        return state.score();
    }

    public String getFirstCard() {
        return state.cards().getFirst().getCardName();
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(state.cards());
    }

    public boolean isBlackjack() {
        return state.isBlackjack();
    }

    public boolean isFinished() {
        return state.isFinished();
    }

    public abstract boolean canReceive();
}
