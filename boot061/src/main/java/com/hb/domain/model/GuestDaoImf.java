package com.hb.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hb.domain.model.entity.GuestVo;

public interface GuestDaoImf extends JpaRepository<GuestVo, Integer>{

}
