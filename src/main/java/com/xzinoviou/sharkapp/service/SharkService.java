package com.xzinoviou.sharkapp.service;

import com.xzinoviou.sharkapp.model.Shark;
import com.xzinoviou.sharkapp.repository.SharkRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author : Xenofon Zinoviou
 */
@Service
public class SharkService {

  private final SharkRepository sharkRepository;

  public SharkService(SharkRepository sharkRepository) {
    this.sharkRepository = sharkRepository;
  }

  public List<Shark> getAllSharks() {
    return sharkRepository.getAllSharks();
  }

  public Shark getSharkByName(String name) {
    return sharkRepository.getSharkByName(name);
  }
}
