package animals;

import animals.exceptions.AgeWrongException;

public interface IMove {
    public void move() throws AgeWrongException;
}
