package com.book_cruising_along_with_java.chapter_02;

import java.util.function.Consumer;

public class GenericsTypeWitness {

  public <T> void process(Consumer<T> consumer) {
  }

  public static void display(int value) {
  }

  public static void main(String[] args) {

    GenericsTypeWitness instance = new GenericsTypeWitness();
    instance.<Integer>process(GenericsTypeWitness::display); 
  }
}
