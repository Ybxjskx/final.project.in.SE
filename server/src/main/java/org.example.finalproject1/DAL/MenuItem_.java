package org.example.finalproject1.DAL;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MenuItem.class)
public abstract class MenuItem_ {
    public static volatile SingularAttribute<MenuItem, Boolean> isEnabled;
}
