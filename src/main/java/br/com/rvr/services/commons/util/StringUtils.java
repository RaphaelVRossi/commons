package br.com.rvr.services.commons.util;

/**
 * StringUtils
 * <p>
 * Created at 26/09/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
public class StringUtils {

    private StringUtils() {
    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
