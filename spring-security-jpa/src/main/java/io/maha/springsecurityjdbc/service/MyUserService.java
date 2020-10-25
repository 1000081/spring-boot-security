//package io.maha.springsecurityjdbc.service;
//
//import io.maha.springsecurityjdbc.entity.Authorities;
//import io.maha.springsecurityjdbc.model.MyUserDetails;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import repository.AuthoritiesRepository;
//
//import java.util.Optional;
//
//public class MyUserService implements UserDetailsService {
//
//    @Autowired
//    private AuthoritiesRepository authoritiesRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<Authorities> autoroties = authoritiesRepository.findById(username);
//        return new MyUserDetails(autoroties.get());
//    }
//}
