package com.user.common.persistence.service;

import com.user.common.interfaces.IWithName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Osada
 * @Date
 */
public interface PagingAndSortingService <T ,Y> extends PagingAndSortingRepository<T,Y>, CrudRepository<T,Y> {
}
