package com.devonfw.exampleapp.general.service.impl.rest;

import javax.inject.Named;

import com.devonfw.exampleapp.general.service.api.TestRestService;

@Named("TestRestService")
public class TestRestServiceImpl implements TestRestService {

  @Override
  public String sayHello() {

    return "Hello World";
  }

}
