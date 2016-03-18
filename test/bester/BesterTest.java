package bester;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BesterTest {

    private List<Rectangle> rectangleList;
    private Bester bester;

    @Before
    public void setUp(){
        rectangleList = new ArrayList<Rectangle>();
        bester = new Bester();
    }

    @Test
    public void shouldFindBiggestRectangleInAList() {
        Rectangle smallRectangle = new Rectangle(1, 1);
        Rectangle bigRectangle = new Rectangle(2, 2);
        Rectangle biggestRectangle = new Rectangle(3, 3);

        rectangleList.add(smallRectangle);
        rectangleList.add(bigRectangle);
        rectangleList.add(biggestRectangle);

        assertThat(bester.findBestRectangle(rectangleList),is(biggestRectangle));
    }


    @Test
    public void shouldFindBestCookieInAList() throws Exception {

        Cookie lessChocolateCookie = new Cookie(1);
        Cookie moreChocolateCookie = new Cookie(100);
        Cookie middleChocolateCookie = new Cookie(50);

        ArrayList<Cookie> cookieList

    }
}