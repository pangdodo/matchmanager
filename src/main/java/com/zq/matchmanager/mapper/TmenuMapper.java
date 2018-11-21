package com.zq.matchmanager.mapper;

import java.util.HashMap;
import java.util.List;

import com.zq.matchmanager.domain.Tmenu;
import com.zq.matchmanager.util.MyMapper;

public interface TmenuMapper extends MyMapper<Tmenu> {

    List<Tmenu> selectMenusByRoleId(Integer roleid);

    List<Tmenu> selectByParentIdAndRoleId(HashMap<String,Object> paraMap);

}