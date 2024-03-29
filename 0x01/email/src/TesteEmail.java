import junit.framework.TestCase;
import org.junit.Test;

public class TesteEmail extends TestCase {

    @Test
    public void testar_email_com_arroba(){
        assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba(){
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres(){
        assertEquals(Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"), false);
    }

}