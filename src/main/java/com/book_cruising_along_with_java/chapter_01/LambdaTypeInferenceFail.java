package com.book_cruising_along_with_java.chapter_01;

import java.util.List;

import static java.util.Comparator.comparing;

public class LambdaTypeInferenceFail {

  List<String> languages = List.of("Java", "Kotlin", "Scala", "Groovy", "Clojure", "JRuby");

  public void printLanguages() {

    languages.stream()
      //ERROR: cannot find the symbol length() on variable name of type Object
      .sorted(comparing(name -> name.length()).reversed())
      .forEach(System.out::println);
  }
}
