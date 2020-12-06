package com.ssabae.nextstep.racingcar.step03.domain;

/**
 * @author : leesangbae
 * @project : java-racingcar
 * @since : 2020-12-06
 */
public class Car {

    private int moveCount;

    public void move(MoveState state) {
        if (state == MoveState.GO) {
            moveCount++;
        }
    }

    public int getMoveCount() {
        return moveCount;
    }
}