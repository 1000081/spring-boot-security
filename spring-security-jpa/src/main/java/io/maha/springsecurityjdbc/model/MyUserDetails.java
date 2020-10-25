//package io.maha.springsecurityjdbc.model;
//
//import io.maha.springsecurityjdbc.entity.Authorities;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class MyUserDetails implements UserDetails {
//
//    private String password;
//    private String username;
//    private boolean enabled;
//    private List<SimpleGrantedAuthority> grantedAuthorityList;
//
//    MyUserDetails(){}
//
//    public MyUserDetails(Authorities authorities){
//        this.username = authorities.getUsers().getUserName();
//        this.password = authorities.getUsers().getPassword();
//        this.enabled = authorities.getUsers().isEnabled();
//        grantedAuthorityList = new ArrayList<>();
//        grantedAuthorityList.add(new SimpleGrantedAuthority(authorities.getAuthority()));
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return grantedAuthorityList;
//    }
//
//    @Override
//    public String getPassword() {
//        return this.password;
//    }
//
//    @Override
//    public String getUsername() {
//        return this.username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return this.enabled;
//    }
//}
