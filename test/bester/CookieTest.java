package bester;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CookieTest {

    @Test
    public void shouldSayCookieWithMoreChocolateIsBest() {
        Cookie badCookie = new Cookie(1);
        Cookie goodCookie = new Cookie(100);

        assertThat(badCookie.findBestCookie(goodCookie),is(true));
    }

    @Test
    public void shouldSayCookieWithLessChocolateIsWorst() {
        Cookie badCookie = new Cookie(1);
        Cookie goodCookie = new Cookie(100);

        assertThat(goodCookie.findBestCookie(badCookie),is(false));
    }

    @Test
    public void shouldSayEqualCookiesAreNotBetter() {
        Cookie cookie1 = new Cookie(1);
        Cookie cookie2 = new Cookie(1);

        assertThat(cookie1.findBestCookie(cookie2),is(false));
    }

}