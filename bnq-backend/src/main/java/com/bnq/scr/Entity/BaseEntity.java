package com.bnq.scr.Entity;

import java.time.Instant;

import com.bnq.scr.User.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;

@MappedSuperclass
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  public Instant createdAt;
  public Instant modifiedAt;
  public Instant deletedAt;

  @OneToOne
  public User createdBy;
  @OneToOne
  public User modifiedBy;
  @OneToOne
  public User deletedBy;

  public BaseEntity() {
    this.createdAt = Instant.now();
  }
}
