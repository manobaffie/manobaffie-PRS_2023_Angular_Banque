package com.bnq.Entity;

import jakarta.transaction.Transactional;

public class EntityMigration<Entity extends BaseEntity, Ripository extends BaseEntityRepositoryMigratable<Entity>> {  
  private BaseEntityList<Entity> entityList;
  private Ripository entityRipository;

  public EntityMigration(BaseEntityList<Entity> entityList, Ripository entityRipository) {
    this.entityList = entityList;
    this.entityRipository = entityRipository;
  }

  @Transactional
  public void migrate() {
    for(Entity newEntity : this.entityList) {
      Entity entity = this.entityRipository.findForMigration(newEntity);
      if (entity == null) {
        this.entityRipository.persist(newEntity);
      } else if (!this.entityRipository.isEqual(newEntity, entity)) {
        this.entityRipository.update(entity, newEntity);
      }
    }
  }
}