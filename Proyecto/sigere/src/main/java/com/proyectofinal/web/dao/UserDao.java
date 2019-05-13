package com.proyectofinal.web.dao;

import java.util.List;

import com.proyectofinal.web.model.Login;
import com.proyectofinal.web.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
  
  boolean existsUser(final User user);
  
  int getIdByUser(final User user);
  
  User getUserById(final int id);
  
  int getIdByEmail(final String email);
}
