package com.bnq.scr.Entity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.Dependent;

@Dependent
public class BaseEntityRepository<T> implements PanacheRepository<T> {

}
