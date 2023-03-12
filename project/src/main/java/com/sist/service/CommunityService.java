package com.sist.service;
import com.sist.mapper.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.vo.*;
@Repository
public class CommunityService {
	@Autowired
	private CommunityMapper mapper;
	
	public List<CommunityVO> communityListData(Map map)
	{
		return mapper.communityListData(map);
	}
	
	public void communityInsert(CommunityVO vo)
	{
		mapper.communityInsert(vo);
	}
}