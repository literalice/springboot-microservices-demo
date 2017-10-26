package com.monochromeroad.springboot.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {
    private String content;

    public void setContent(String content) {
      this.content = content;
    }

    public String getContent() {
      return this.content;
    }
}

