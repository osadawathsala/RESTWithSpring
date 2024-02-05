package com.user.common.interfaces;

public interface IByNameApi<T extends IWithName> {

    T findOneByName(final String name);

}
