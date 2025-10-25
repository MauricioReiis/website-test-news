import java.util.Objects;

public class Contact {
    private String subject;
    private String messageContent;
    private String name;
    private String email;
    private String phone;


    public Contact(String name, String email, String subject, String messageContent ) {
        if (Objects.equals(name, "")) {
            throw new IllegalArgumentException("Nome do remetente não pode ser vazio.");
        }
        if (Objects.equals(email, "")) {
            throw new IllegalArgumentException("Email do remetente não pode ser vazio.");
        }
        if (Objects.equals(subject, "")) {
            throw new IllegalArgumentException("Assunto não pode ser vazio.");
        }
        if (Objects.equals(messageContent, "")) {
            throw new IllegalArgumentException("Mensagem não pode ser vazia.");
        }
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.messageContent = messageContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public boolean sendMessage(){
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            return false;
        }
        return true;
    }
}
