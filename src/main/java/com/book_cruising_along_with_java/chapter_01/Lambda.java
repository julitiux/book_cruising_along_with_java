package com.book_cruising_along_with_java.chapter_01;

import java.util.List;

public class Lambda {

  List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

  public void print() {

//    numbers.forEach((Integer number) -> System.out.println(number * 2));
//    numbers.forEach((number) -> System.out.println(number * 2));
    numbers.forEach(number -> System.out.println(number * 2));
  }
}
