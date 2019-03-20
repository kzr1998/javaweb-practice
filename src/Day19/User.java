package Day19;

public class User {
    private String username;
    private int pwd;

    public User(String username,int pwd) {
        this.username=username;
        this.pwd=pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
    public void printmassage(){
        System.out.println("用户名："+username);
        System.out.println("密码："+pwd);
    }
}
