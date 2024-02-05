package com.user.common.persistence.service;

import com.user.common.interfaces.IByNameApi;
import com.user.common.interfaces.IWithName;

public interface IService<T extends IWithName> extends IRawService<T>, IByNameApi<T> {

    //

}
