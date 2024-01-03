package com.bnq.Entity;

import java.time.Instant;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.transaction.Transactional;

public interface BaseEntityRepository<Entity extends BaseEntity> extends PanacheRepository<Entity> {

  @Transactional
  default Entity baseUpdate(Entity entityToUpEntity, Entity entity) {
    entityToUpEntity.setCreatedAt(entity.getCreatedAt());
    entityToUpEntity.setCreatedBy(entity.getCreatedBy());
    entityToUpEntity.setModifiedAt(Instant.now());
    entityToUpEntity.setModifiedBy(entity.getModifiedBy());
    return entityToUpEntity;
  }

  @Transactional
  public abstract Entity update(Entity entity1, Entity entity2);

  @Transactional
  public abstract Boolean isEqual(Entity entity1, Entity entity2);
}
