package br.com.rvr.services.commons.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * StringUtilsTest
 * <p>
 * Created at 26/09/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class StringUtilsJunitTest {

    @Test
    public void test1() {
        assertEquals(Boolean.TRUE, StringUtils.isEmpty(null));
    }

    @Test
    public void test2() {
        assertEquals(Boolean.TRUE, StringUtils.isEmpty(""));
    }

    @Test
    public void test3() {
        assertEquals(Boolean.FALSE, StringUtils.isEmpty("as"));
    }
}
