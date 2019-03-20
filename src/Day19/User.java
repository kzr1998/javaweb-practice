package Day19;

public class User {
    private String username;
    private String pwd;

    public User(String username,String pwd) {
        this.setUsername(username);
        this.setPwd(pwd);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String info(){
       String str="用户名："+this.username+"\n"+"密码："+this.pwd;
       return str;
    }
}
