package org.example.finalproject1.DAL;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Request.class)
public abstract class Request_ {
    public static volatile SingularAttribute<Request, RequestStatus> status;
}
