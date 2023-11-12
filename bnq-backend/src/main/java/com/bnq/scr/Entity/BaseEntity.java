package com.bnq.scr.Entity;

import java.time.Instant;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity extends PanacheEntity {
  public Instant createdAt;
  public Instant modifiedAt;
  public Instant deletedAt;

  public BaseEntity() {
    this.createdAt = Instant.now();
  }
}
