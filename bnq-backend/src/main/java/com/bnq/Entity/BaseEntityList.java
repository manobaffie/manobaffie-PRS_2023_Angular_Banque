package com.bnq.Entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseEntityList<T extends BaseEntity> implements Iterable<T> {
  protected List<T> entity = new ArrayList<T>();

  @Override
  public Iterator<T> iterator() {
    return this.entity.iterator();
  }
}
