package com.javaQuickstart.streams.foreach;

public class RequestSender {

  public void send(FireAndForgetRequest request) {
    System.out.println("Sending request with content: " + request.getContent());
  }

}
