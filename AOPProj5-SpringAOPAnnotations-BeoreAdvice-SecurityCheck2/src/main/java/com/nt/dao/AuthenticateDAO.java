package com.nt.dao;

import com.nt.bo.UserBO;

public interface AuthenticateDAO {
  public int authenticate(UserBO bo);
	
}
