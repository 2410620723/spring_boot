package spring.boot.repository;

import org.springframework.data.repository.CrudRepository;

import spring.boot.model.SysUser;

public interface UserRepository extends CrudRepository<SysUser, Integer> {
	SysUser findByName(String userName);
	
}
