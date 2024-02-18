package co.edu.uniquindio.programacion2.principiosSolid.SRP;

public abstract class SaveUser {
    private String user;
    private String password;

    public SaveUser(String user, String password){
        this.user = user;
        this.password = password;
    }

    public void setUser(String user){
        this.user = user;
    }

    public String getUser (){
        return user;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword (){
        return password;
    }
}
