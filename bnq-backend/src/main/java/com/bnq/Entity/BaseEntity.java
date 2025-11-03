package com.bnq.Entity;

import java.time.Instant;

import com.bnq.User.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;

@MappedSuperclass
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

//  @CreatedDate
  private Instant createdAt;
  private Instant modifiedAt;
  private Instant deletedAt;

  @OneToOne
  private User createdBy;
  @OneToOne
  private User modifiedBy;
  @OneToOne
  private User deletedBy;

  public Long getId() {
    return id;
  }

  public Instant getCreatedAt() {
    return createdAt;
  } 
  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(Instant modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  
  public Instant getDeletedAt() {
    return deletedAt;
  }
  public void setDeletedAt(Instant deletedAt) {
    this.deletedAt = deletedAt;
  }

  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  public User getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public User getDeletedBy() {
    return deletedBy;
  }
  public void setDeletedBy(User deletedBy) {
    this.deletedBy = deletedBy;
  }
}
