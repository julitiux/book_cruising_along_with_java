package com.book_cruising_along_with_java.chapter_02;

public class NotAKeyWord {

  void NotAKeyWord() {
    var PI = Math.PI;
    String var = "please don't"; // Possible, but not a good idea
    //var var = "please don't";  // Also possible, but avoid

    System.out.println(var);     // prints: please don't
  }
}
