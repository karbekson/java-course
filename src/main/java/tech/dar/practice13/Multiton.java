package tech.dar.practice13;

import java.util.HashMap;
import java.util.Map;

public class Multiton {

    private static Map<MultitonType, Multiton> multitonMap = new HashMap<>();

    private Multiton() {
    }

    public static Multiton getInstance(MultitonType type) {
        if (!multitonMap.containsKey(type)) {
            multitonMap.put(type, new Multiton());
        }
        return multitonMap.get(type);
    }

}

enum MultitonType {
    ZERO, ONE, TWO,
}
