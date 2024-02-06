package com.user.um.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.common.persistence.service.AbstractService;
import com.user.um.persistence.dao.IPrincipalJpaDao;
import com.user.um.persistence.model.Principal;
import com.user.um.service.IPrincipalService;

@Service
@Transactional
public class PrincipalServiceImpl extends AbstractService<Principal> implements IPrincipalService {

    @Autowired
    private IPrincipalJpaDao dao;

    public PrincipalServiceImpl() {
        super();
    }

    // API

    // find

    @Override
    @Transactional(readOnly = true)
    public Principal findOneByName(final String name) {
        return dao.findOneByName(name);
    }

    // other

    // Spring

    @Override
    protected final IPrincipalJpaDao getDao() {
        return dao;
    }

    @Override
    protected JpaSpecificationExecutor<Principal> getSpecificationExecutor() {
        return dao;
    }

}
