package org.itk.testtaskmap;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMapUtil {
    public static <T> Map<T, Long> countElements(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(
                        element -> element,
                        Collectors.counting()
                ));
    }

    //перегруженный метод для интов, для остальных примитивов необходимо сделать аналогичные
    public static Map<Integer, Long> countElements(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(
                        element -> element,
                        Collectors.counting()
                ));
    }
}
