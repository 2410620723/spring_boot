package spring.boot.model;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUser extends SysUser implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1804270564750373588L;

	public SecurityUser(SysUser suser) {
		if(suser != null)
		{
			this.setId(suser.getId());
			this.setName(suser.getName());
			this.setEmail(suser.getEmail());
			this.setPassword(suser.getPassword());
			this.setDob(suser.getDob());
			this.setRole(suser.getRole());
		}		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		String userRoles = this.getRole();
		
		if(userRoles != null)
		{
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRoles);
			authorities.add(authority);
		}
		return authorities;
	}

	@Override
	public String getUsername() {
		return super.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
