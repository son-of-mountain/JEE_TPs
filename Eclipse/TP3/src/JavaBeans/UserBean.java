package JavaBeans;

public class UserBean {
	int id_user;
	String login;
	String password;

	public UserBean()
	{}
	public int getId_user() {
	return id_user;
	}
	public void setId_user(int id_user) {
	this.id_user = id_user;
	}
	public String getLogin() {
	return login;
	}
	public void setLogin(String login) {
	this.login = login;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
}
