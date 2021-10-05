package com.xzinoviou.sharkapp.controller;

import com.xzinoviou.sharkapp.model.Shark;
import com.xzinoviou.sharkapp.service.SharkService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Xenofon Zinoviou
 */
@RestController
@RequestMapping("/v1/sharks")
public class SharkController {

  private final SharkService sharkService;

  public SharkController(SharkService sharkService) {
    this.sharkService = sharkService;
  }

  @GetMapping
  public List<Shark> getAllSharks() {
    return sharkService.getAllSharks();
  }

  @GetMapping("/{name}")
  public Shark getAllSharks(@PathVariable String name) {
    return sharkService.getSharkByName(name);
  }
}
