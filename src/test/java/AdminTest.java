import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {

    private final Admin admin = new Admin("admin", "admin");


    @Test
    @DisplayName("Teste admin sem nome")
    public void testAdminSemNome() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Admin("", "admin");
                }
        );
        assertEquals("Nome não pode ser vazio.", exception.getMessage());
    }

    @Test
    @DisplayName("Teste admin sem senha")
    public void testAdminSemSenha() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Admin("admin", "");
                }
        );
        assertEquals("Senha não pode ser vazia.", exception.getMessage());
    }

    @Test
    @DisplayName("Test getter nome")
    public void testGetterNome(){
        assertEquals("admin", admin.getName());
    }

    @Test
    @DisplayName("Test setter nome")
    public void testSetterNome(){
        admin.setName("root");
        assertEquals("root", admin.getName());
    }

    @Test
    @DisplayName("Test getter senha")
    public void testGetterSenha(){
        assertEquals("admin", admin.getPassword());
    }

    @Test
    @DisplayName("Test setter senha")
    public void testSetterSenha(){
        admin.setPassword("root");
        assertEquals("root", admin.getPassword());
    }

    @Test
    @DisplayName("Test getter autenticado")
    public void testGetterAutenticado(){
        assertFalse(admin.getAuthenticated());
    }

    @Test
    @DisplayName("Test setter assunto")
    public void testSetterAutenticado(){
        admin.setAuthenticated(true);
        assertTrue(admin.getAuthenticated());
    }

    @Test
    @DisplayName("Teste login válido")
    public void testLogin(){
        assertTrue(admin.login("admin", "admin"));
    }

    @Test
    @DisplayName("Teste login inválido")
    public void testLoginError(){
        assertFalse(admin.login("wrong", "credentials"));
        assertFalse(admin.login("admin", "wrong"));
        assertFalse(admin.login("wrong", "admin"));
    }

    @Test
    @DisplayName("Teste logout admin")
    public void testLogout(){
        admin.login("admin", "admin");
        admin.logout();
        assertFalse(admin.getAuthenticated());
    }

    @Test
    @DisplayName("Teste criar notícia")
    public void testCrearNoticia(){
        admin.login("admin", "admin");
        assertTrue(admin.createNews("Title", "Description"));
    }

    @Test
    @DisplayName("Teste criar notícia deslogado")
    public void testCrearNoticiaDeslogado(){
        assertFalse(admin.createNews("Title", "Description"));
    }
}
