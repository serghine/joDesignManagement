package com.happy.alias.joDesignManageent.resources;

import com.happy.alias.joDesignManageent.manager.UserRoleManager;
import com.happy.alias.joDesignManageent.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRoleRessource {

    @Autowired
    private UserRoleManager userRoleManager = new UserRoleManager();

    @GetMapping(name = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<User>> getListOfUser() {
        List<User> users = userRoleManager.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

