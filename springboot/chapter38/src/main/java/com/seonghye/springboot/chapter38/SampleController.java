package com.seonghye.springboot.chapter38;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {

  @GetMapping("/hello")
  public EntityModel<Hello> hello() {
    Hello hello = new Hello();
    hello.setPrefix("hey,");
    hello.setName("seonghye");

    EntityModel<Hello> helloEntityModel = new EntityModel<>(hello);
    helloEntityModel.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());
    return helloEntityModel;
  }

}
