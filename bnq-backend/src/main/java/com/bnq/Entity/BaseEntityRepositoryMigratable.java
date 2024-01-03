package com.bnq.Entity;

import jakarta.transaction.Transactional;

public interface BaseEntityRepositoryMigratable<Entity extends BaseEntity> extends BaseEntityRepository<Entity> {
  @Transactional
  public abstract Entity findForMigration(Entity entity);
}
