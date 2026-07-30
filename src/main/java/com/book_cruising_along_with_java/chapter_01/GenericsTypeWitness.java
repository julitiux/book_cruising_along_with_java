package com.book_cruising_along_with_java.chapter_01;

import java.util.function.Consumer;

public class GenericsTypeWitness {

  public <T> void process(Consumer<T> consumer) {
  }

  public static void display(int value) {
  }

  public static void main(String[] args) {

    GenericsTypeWitness instance = new GenericsTypeWitness();
    instance.<Integer>process(input -> display(input)); // ERROR
    //ERROR: incompatible types: Object cannot be converted to int
  }
}
