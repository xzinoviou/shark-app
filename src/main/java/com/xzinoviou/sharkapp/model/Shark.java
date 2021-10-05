package com.xzinoviou.sharkapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Xenofon Zinoviou
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Shark {

  private Long id;

  private String name;

  private String scientificName;
}
