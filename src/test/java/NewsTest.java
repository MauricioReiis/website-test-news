import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.temporal.ChronoUnit;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class NewsTest {

    private final News noticia = new News("Título da notícia", "Corpo da notícia");

    @Test
    @DisplayName("Teste notícia com  título vazio")
    public void testNotíciaSemTítulo() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new News("", "Corpo da nóticia");
                }
        );
        assertEquals("Título da notícia não pode ser vazio.", exception.getMessage());
    }

    @Test
    @DisplayName("Teste notícia com corpo vazio")
    public void testNotíciaSemCorpo() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new News("Título da notícia", "");
                }
        );
        assertEquals("Corpo da notícia não pode ser vazio.", exception.getMessage());
    }

    @Test
    @DisplayName("Test getter título")
    public void testGetterTitulo(){
        assertEquals("Título da notícia", noticia.getTitle());
    }

    @Test
    @DisplayName("Test setter título")
    public void testSetterTitulo(){
        noticia.setTitle("Título teste");
        assertEquals("Título teste", noticia.getTitle());
    }

    @Test
    @DisplayName("Test getter descrição")
    public void testGetterDescricao(){
        assertEquals("Corpo da notícia", noticia.getDescription());
    }

    @Test
    @DisplayName("Test setter descrição")
    public void testSetterDescricao(){
        noticia.setDescription("Corpo teste");
        assertEquals("Corpo teste", noticia.getDescription());
    }

    @Test
    @DisplayName("Test getter data")
    public void testGetterData(){

        assertEquals(new Date().toInstant().truncatedTo(ChronoUnit.DAYS), noticia.getDate().toInstant().truncatedTo(ChronoUnit.DAYS));
    }

    @Test
    @DisplayName("Test setter data")
    public void testSetterData(){
        noticia.setDate(new Date(1678886400000L));
        assertEquals(new Date(1678886400000L), noticia.getDate());
    }
}
