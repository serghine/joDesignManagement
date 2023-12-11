package com.happy.alias.joDesignManageent.manager;

import com.happy.alias.joDesignManageent.model.Role;
import com.happy.alias.joDesignManageent.model.User;
import com.happy.alias.joDesignManageent.model.views.UserRole;
import com.happy.alias.joDesignManageent.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserRoleManager {


    @Autowired
    UserRoleRepository userRoleRepository;

    public UserRoleManager(UserRoleRepository userRoleRepository){
        this.userRoleRepository = userRoleRepository;
    }

    public UserRoleManager(){

    }


    public List<User> getUsers() {
        //
        Iterator<UserRole> userRoleIterator = userRoleRepository.findAll()
                .iterator().hasNext() ? userRoleRepository.findAll()
                .iterator() : null;

        List<User> users = new ArrayList<>();
        if(userRoleIterator != null){
            Integer lastUserId = null;
            Integer lastRoleId = null;
            int i = 0;
            while (userRoleIterator.hasNext()){
               //
                var user = userRoleIterator.next();
                 //

            }


        }
        return users;
    }


}
