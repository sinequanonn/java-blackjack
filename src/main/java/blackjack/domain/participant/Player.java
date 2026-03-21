package blackjack.domain.participant;

import blackjack.domain.betting.BettingAmount;

import java.math.BigDecimal;

public class Player extends Participant {
    private final Name name;
    private final BettingAmount bettingAmount;

    public Player(Name name, BettingAmount bettingAmount) {
        this.name = name;
        this.bettingAmount = bettingAmount;
    }

    public String getName() {
        return name.getName();
    }

    public BigDecimal calculateProfit(String ratio) {
        return bettingAmount.calculateProfit(ratio);
    }

    @Override
    public boolean canReceive() {
        return !isFinished();
    }
}
