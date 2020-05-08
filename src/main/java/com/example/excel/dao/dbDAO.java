package com.example.excel.dao;

import org.hibernate.*;
import org.hibernate.cfg.*;
 
class dbDAO {
	private Session session;
 
	// 构造函数，初始化Session，相当于连接数据库
	public dbDAO() {
		// new Configuration().configure()是吧hibernate.cfg.xml中的所有配置读取进来
		// .buildSessionFactory().openSession()是创建Session工厂并实例化session
		this.session = new Configuration().configure().buildSessionFactory()
				.openSession();
	}
 
	// 执行查询
	public Query query(String hql) {
		return session.createQuery(hql);
	}
 
	// 执行插入、修改
	public void save(Object object) {
		Transaction transaction = session.beginTransaction();
		session.save(object);
		transaction.commit();
	}
 
	// 执行删除
	public void delete(Object object) {
		Transaction transaction = session.beginTransaction();
		session.delete(object);
		transaction.commit();
	}
 
	// 析构函数，中断Session，相当于中断数据库的连接
	protected void finalize() throws Exception {
		if (session.isConnected() || session != null) {
			session.close();
		}
	}
 
}