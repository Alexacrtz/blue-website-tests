import static org.junit.Assert.*;
import org.junit.Test;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.File;

public class SitioBlueTest {

    @Test
    public void laPaginaDeInicioCargaConElTituloCorrecto() throws Exception {
        WebClient webClient = new WebClient();
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);

        File archivo = new File("site/index.html");
        HtmlPage pagina = webClient.getPage(archivo.toURI().toURL());

        assertTrue(pagina.getTitleText().contains("Blue"));

        webClient.close();
    }

    @Test
    public void existeElEnlaceAlAvisoDePrivacidad() throws Exception {
        WebClient webClient = new WebClient();
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);

        File archivo = new File("site/index.html");
        HtmlPage pagina = webClient.getPage(archivo.toURI().toURL());

        assertNotNull(pagina.getAnchorByHref("aviso-privacidad.html"));

        webClient.close();
    }
}