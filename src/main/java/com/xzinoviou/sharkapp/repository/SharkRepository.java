package com.xzinoviou.sharkapp.repository;

import com.xzinoviou.sharkapp.model.Shark;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * @author : Xenofon Zinoviou
 */
@Component
public class SharkRepository {

  private static List<Shark> SHARKS;

  @PostConstruct
  void initSharks() {
    SHARKS = createSharks();
  }

  public List<Shark> getAllSharks() {
    return SHARKS;
  }

  public Shark getSharkByName(String name) {
    return SHARKS.stream().filter(s -> s.getName().toLowerCase().contains(name.toLowerCase()))
        .findFirst().orElseGet(this::invalidShark);
  }


  private List<Shark> createSharks() {
    return new ArrayList<Shark>(Arrays.asList(
        Shark.builder().id(1L).name("Whale Shark").scientificName("Rhincodon typus").build(),
        Shark.builder().id(2L).name("Basking Shark").scientificName("Cetorhinus maximus").build(),
        Shark.builder().id(3L).name("Shortfin Mako Shark").scientificName("Isurus oxyrinchus")
            .build(),
        Shark.builder().id(4L).name("Thresher Shark").scientificName("Alopias vulpinus").build(),
        Shark.builder().id(5L).name("Bull Shark").scientificName("Carcharhinus leucas").build(),
        Shark.builder().id(6L).name("Tiger Shark").scientificName("Galeocerdo cuvier").build(),
        Shark.builder().id(7L).name("Great White Shark").scientificName("Carcharodon carcharias")
            .build(),
        Shark.builder().id(8L).name("Oceanic Whitetip Shark")
            .scientificName("Carcharhinus longimanus").build(),
        Shark.builder().id(9L).name("Blue Shark").scientificName("Prionace glauca").build(),
        Shark.builder().id(10L).name("Great Hammerhead").scientificName("Sphyrna mokarran").build()
    ));
  }

  private Shark invalidShark() {
    return Shark.builder().id(999L).name("Invalid Shark").scientificName("This shark is invalid")
        .build();
  }
}
