package com.book_cruising_along_with_java.chapter_03;

public class CreateMessage {

  public static String createMessage() {

    String message = "Thank you for your purchase.";
    message += " We hope you had a pleasant experience.\n\n";
    message += "We request that you take a few minutes ";
    message += "to provide your feedback.\n\n";
    message += "Please fill out the survey at https://survey.example.com\n\n";
    message += "If you have any questions or comments, ";
    message += "please click on the \"Support\" link\n";
    message += "at https://www.example.com.\n";

    return message;
  }
}
