package com.book_cruising_along_with_java.chapter_02;

import java.util.Collections;
import java.util.List;

public class GenericsTypeInference {

  List<String> justOne = Collections.singletonList("howdy");
  List<String> nothingHere = Collections.emptyList();

  // Redundant TypeWitness
  List<Integer> nothingHereToo = Collections.<Integer>emptyList();

}
