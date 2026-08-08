package com.book_cruising_along_with_java.chapter_01;

import java.util.Comparator;
import java.util.List;

public class LambdaTypeInferenceFail {

  List<String> languages = List.of("Java", "Kotlin", "Scala", "Groovy", "Clojure", "JRuby");

  public void printLanguages() {

    languages.stream()
      .sorted(Comparator.comparing(name -> name.length()))
      .forEach(System.out::println);
  }
}
