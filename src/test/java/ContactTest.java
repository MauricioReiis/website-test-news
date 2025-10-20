import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    private final Contact contatoValido = new Contact("João Teste", "email@teste.com", "Assunto teste", "Corpo da mensagem");
    private final Contact contatoEmailInvalido = new Contact("João Teste", "emailInvalido", "Assunto teste", "Corpo da mensagem");


    @Test
    @DisplayName("Teste contato com remetente vazio")
    public void testContatoSemNome() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Contact("", "email@teste.com", "Assunto teste", "Corpo da mensagem");                }
        );
        assertEquals("Nome do remetente não pode ser vazio.", exception.getMessage());
    }

    @Test
    @DisplayName("Teste contato com email vazio")
    public void testContatoSemEmail() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Contact("João Teste", "", "Assunto teste", "Corpo da mensagem");                }
        );
        assertEquals("Email do remetente não pode ser vazio.", exception.getMessage());
    }

    @Test
    @DisplayName("Teste contato com assunto vazio")
    public void testContatoSemAssunto() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Contact("João Teste", "email@teste.com", "", "Corpo da mensagem");                }
        );
        assertEquals("Assunto não pode ser vazio.", exception.getMessage());
    }

    @Test
    @DisplayName("Teste contato com mensagem vazia")
    public void testContatoSemMensagem() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Contact("João Teste", "email@teste.com", "Assunto teste", "");                }
        );
        assertEquals("Mensagem não pode ser vazia.", exception.getMessage());
    }

    @Test
    @DisplayName("Test getter nome")
    public void testGetterNome(){
        assertEquals("João Teste", contatoValido.getName());
    }

    @Test
    @DisplayName("Test setter nome")
    public void testSetterNome(){
        contatoValido.setName("Nome Teste");
        assertEquals("Nome Teste", contatoValido.getName());
    }

    @Test
    @DisplayName("Test getter email")
    public void testGetterEmail(){
        assertEquals("email@teste.com", contatoValido.getEmail());
    }

    @Test
    @DisplayName("Test setter email")
    public void testSetterEmail(){
        contatoValido.setEmail("teste@email.com.br");
        assertEquals("teste@email.com.br", contatoValido.getEmail());
    }

    @Test
    @DisplayName("Test get/set telefone")
    public void testSetterGetterTelefone(){
        contatoValido.setPhone("984937632");
        assertEquals("984937632", contatoValido.getPhone());
    }

    @Test
    @DisplayName("Test getter assunto")
    public void testGetterAssunto(){
        assertEquals("Assunto teste", contatoValido.getSubject());
    }

    @Test
    @DisplayName("Test setter assunto")
    public void testSetterAssunto(){
        contatoValido.setSubject("Teste assunto");
        assertEquals("Teste assunto", contatoValido.getSubject());
    }

    @Test
    @DisplayName("Test getter mensagem")
    public void testGetterMensagem(){
        assertEquals("Corpo da mensagem", contatoValido.getMessageContent());
    }

    @Test
    @DisplayName("Test setter mensagem")
    public void testSetterMensagem(){
        contatoValido.setMessageContent("Teste mensagem");
        assertEquals("Teste mensagem", contatoValido.getMessageContent());
    }

    @Test
    @DisplayName("Test envia mensagem válida")
    public void testEnviarMensagemValida(){
        assertTrue(contatoValido.sendMessage());
    }

    @Test
    @DisplayName("Test envia mensagem inválida")
    public void testEnviarMensagemInvalida(){
        assertFalse(contatoEmailInvalido.sendMessage());
    }
}
