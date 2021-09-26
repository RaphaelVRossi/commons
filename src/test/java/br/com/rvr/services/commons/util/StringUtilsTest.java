package br.com.rvr.services.commons.util;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * StringUtilsTest
 * <p>
 * Created at 26/09/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
@SpringBootTest
class StringUtilsTest {

    @Test
    void test1() {
        assertEquals(Boolean.TRUE, StringUtils.isEmpty(null));
    }

    @Test
    void test2() {
        assertEquals(Boolean.TRUE, StringUtils.isEmpty(""));
    }

    @Test
    void test3() {
        assertEquals(Boolean.FALSE, StringUtils.isEmpty("as"));
    }
}
