package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberPickService {

    private int randomNumber;

    public void pick() {
        randomNumber = Randoms.pickNumberInRange(0, 9);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
