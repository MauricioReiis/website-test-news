import java.util.Objects;

public class Admin {
    private String name;
    private String password;
    private boolean authenticated;


    public Admin(String name, String password) {
        if (Objects.equals(name, "")) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (Objects.equals(password, "")) {
            throw new IllegalArgumentException("Senha não pode ser vazia.");
        }
        this.name = name;
        this.password = password;
        this.authenticated = false;
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

    public boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean login(String name, String password){
        if(Objects.equals(name, this.name) && Objects.equals(password, this.password)){
            this.authenticated = true;
            return true;
        }else{
            return false;
        }
    }

    public void logout(){
        this.authenticated = false;
    }

    public boolean createNews(String newsTitle, String newsDescription){
        if(this.authenticated){
            new News(newsTitle, newsDescription);
            return  true;
        }
        else{
            return false;
        }
    }
}
