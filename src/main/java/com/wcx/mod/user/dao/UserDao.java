package com.wcx.mod.user.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.wcx.mod.common.dao.BaseDao;
import com.wcx.mod.user.entity.UserEntity;

@Repository
public class UserDao extends BaseDao {
	
	
	public UserEntity getUser(long id) {
		return (UserEntity) getSession().get(UserEntity.class, id);
	}
	
	public UserEntity getUser(String userId) {
		Criteria criteria = getSession().createCriteria(UserEntity.class);
		criteria.add(Restrictions.eq("userId", userId));
		return (UserEntity)criteria.uniqueResult();
	}

	public void updateUser(String userId) {

	}

	public void updateUser(UserEntity user) {

		getSession().update(user);		
	}

	public List<UserEntity> queryUserList(int pageNo, int pageSize) {
		Criteria criteria = getSession().createCriteria(UserEntity.class);
		criteria.setFirstResult(pageSize * (pageNo - 1));
		criteria.setMaxResults(pageSize);
		return (List<UserEntity>)criteria.list();
	}
	
	public String queryUserListCount() {
		Criteria criteria = getSession().createCriteria(UserEntity.class);
		
	    criteria.setProjection(Projections.rowCount());  
	    return criteria.list().get(0).toString();
	}
}
