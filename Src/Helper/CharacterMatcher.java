package Helper;

public class CharacterMatcher {
    int index;
    char symb;

    public CharacterMatcher(int index, char symb) {
        this.index = index;
        this.symb = symb;
    }

    @Override
    public String toString() {
        return "CharacterMatcher{" +
                "index=" + index +
                ", symb=" + symb +
                '}';
    }
}
