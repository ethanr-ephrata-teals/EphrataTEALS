package sampleCode.CardLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffler {
    public <T> T[] shuffle(T[] array) {
        List<T> list = Arrays.asList(array);
        Collections.shuffle(list);
		return list.toArray(array);
    }
}
