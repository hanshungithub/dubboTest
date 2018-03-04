package cn.hassan.web.boss.base;

import cn.hassan.user.entity.PmsUser;
import wusc.edu.demo.user.entity.PmsUser;



public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
	public PmsUser getLoginedUser();
}
