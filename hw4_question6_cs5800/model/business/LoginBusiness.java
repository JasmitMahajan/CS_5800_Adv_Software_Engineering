package model.business;

import java.sql.SQLException;

import model.dataccess.LoginDataAccess;
import model.entities.MessageException;
import model.entities.User;

public class LoginBusiness{
//	private String userName;
//	private String password;
	private User u;
	private LoginDataAccess lda;
	
	public void checker(String userName, String password) throws ClassNotFoundException, SQLException {
		if (userName.equals("")) {
			throw new MessageException("Username not informed.");
		} else if (password.equals("")) {
			throw new MessageException("Password not informed.");
		} 
		
		u = getUserInstance();
		u.setUserName(userName);
		u.setPassword(password);
		lda = getLoginDataAccessInstance();
		
		if (!(lda.verifyCredentials(u))) {
			throw new MessageException("Incorrect credentials");
		}
	}
	
	User getUserInstance() {
		if(u == null) {
			u = new User();
		}
		return u;
	}
	
	LoginDataAccess getLoginDataAccessInstance() {
		if(lda == null) {
			lda = new LoginDataAccess();
		}
			return lda;
	}
}
