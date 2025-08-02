package org.itk.testtaskmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestTaskMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskMapApplication.class, args);

        String[] words = {"день", "ночь", "день", "утро", "вечер", "ночь"};
        Map<String, Long> wordCount = countElements(words);
        System.out.println("Подсчет строк: " + wordCount);

        int[] primitiveNumbers = {1, 2, 3, 2, 1, 3, 1, 4};
        Map<Integer, Long> primitiveCount = countElements(primitiveNumbers);
        System.out.println("Подсчет интов: " + primitiveCount);
    }

}
