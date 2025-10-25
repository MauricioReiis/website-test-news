import java.util.Date;
import java.util.Objects;

public class News {
    private String title;
    private String description;
    private Date date;
    
    public News(String title, String description) {
        if (Objects.equals(title, "")) {
            throw new IllegalArgumentException("Título da notícia não pode ser vazio.");
        }
        if (Objects.equals(description, "")) {
            throw new IllegalArgumentException("Corpo da notícia não pode ser vazio.");
        }
        this.title = title;
        this.description = description;
        this.date = new Date();
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
