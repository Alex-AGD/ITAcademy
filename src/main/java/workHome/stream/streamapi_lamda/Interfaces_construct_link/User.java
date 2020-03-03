package workHome.stream.streamapi_lamda.Interfaces_construct_link;

public class User {

    private String name, password, seePass;

    public User(String name, String password, String seePass) {
        this.name = name;
        this.password = password;
        this.seePass = seePass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSeePass() {
        return seePass;
    }

    public void setSeePass(String seePass) {
        this.seePass = seePass;
    }
}

