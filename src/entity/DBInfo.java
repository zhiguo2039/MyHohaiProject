package entity;

public class DBInfo {
	private String driver;

	private String url;

	private String user;

	private String password;

	@Override
	public String toString() {
		return "DBInfo [driver=" + driver + ", url=" + url + ", user=" + user
				+ ", password=" + password + "]";
	}

	public DBInfo(String driver, String url, String user, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public DBInfo() {
		super();
	}

	public String getDriver() {

		return driver;
	}

	public void setDriver(String driver) {

		this.driver = driver;
	}

	public String getUrl() {

		return url;
	}

	public void setUrl(String url) {

		this.url = url;
	}

	public String getUser() {

		return user;
	}

	public void setUser(String user) {

		this.user = user;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}
}
