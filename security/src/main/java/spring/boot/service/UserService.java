package spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.model.SysUser;
import spring.boot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public Iterable<SysUser> findAll(){
		return userRepository.findAll();
	}
	
	public SysUser findById(Integer id){
		return userRepository.findOne(id);
	}

	public SysUser findByName(String userName) {
		return userRepository.findByName(userName);
	}
	
}
