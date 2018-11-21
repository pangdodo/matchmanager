package com.zq.matchmanager.mapper;

import java.util.List;

import com.zq.matchmanager.domain.Trole;
import com.zq.matchmanager.util.MyMapper;

public interface TroleMapper extends MyMapper<Trole> {

    List<Trole> selectRolesByUserId(Integer userid);

}