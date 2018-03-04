package cn.hassan.user.service.impl;

import cn.hassan.service.biz.PmsUserBiz;
import cn.hassan.user.common.page.PageBean;
import cn.hassan.user.common.page.PageParam;
import cn.hassan.user.entity.PmsUser;
import cn.hassan.user.service.PmsUserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsUserFacade")
public class PmsUserFacadeImpl implements PmsUserFacade {

	@Autowired
	private PmsUserBiz pmsUserBiz;

	@Override
	public void create(PmsUser pmsUser) {
		pmsUserBiz.create(pmsUser);
	}

	@Override
	public PmsUser getById(Long userId) {
		return pmsUserBiz.getById(userId);
	}

	@Override
	public PmsUser findUserByUserNo(String userNo) {
		return pmsUserBiz.findUserByUserNo(userNo);
	}

	@Override
	public void deleteUserById(long userId) {
		pmsUserBiz.deleteUserById(userId);
	}

	@Override
	public void update(PmsUser user) {
		pmsUserBiz.update(user);
	}

	@Override
	public void updateUserPwd(Long userId, String newPwd, boolean isTrue) {
		pmsUserBiz.updateUserPwd(userId,newPwd,isTrue);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return pmsUserBiz.listPage(pageParam,paramMap);
	}
}
