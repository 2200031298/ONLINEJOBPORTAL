package com.jfsd.jobportal.service;

import com.jfsd.jobportal.models.Admin;
import com.jfsd.jobportal.models.User;

import java.util.List;

public interface AdminService {
    String checkAdmin(String username, String password);
    Admin saveAdmin(Admin admin);
    List<User> viewUsers();
    String logoutAdmin();
}
