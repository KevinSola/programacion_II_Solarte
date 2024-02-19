package co.edu.uniquindio.programacion2.principiosSolid.SRP;

public class EncryptPassword extends SaveUser{
    private String encrypt;
    public EncryptPassword(String user, String password){
        super(user, password);
    }
    public String encrypt(){
        encrypt = getPassword();
        encrypt += "2";
        return encrypt;
    }
}
