package com.user.um.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.user.common.interfaces.IByNameApi;
import com.user.um.persistence.model.Principal;

public interface IPrincipalJpaDao extends JpaRepository<Principal, Long>, JpaSpecificationExecutor<Principal>, IByNameApi<Principal> {
    //
}
