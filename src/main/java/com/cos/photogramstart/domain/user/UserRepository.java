package com.cos.photogramstart.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
// 어노테이션이 없어도 JpaRepository 를 상속하면 IoC 등록이 자동으로 됨
public interface UserRepository extends JpaRepository<User,Integer>{

	User findByUsername(String username);
	
}
