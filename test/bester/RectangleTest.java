package bester;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void betterRectangleShouldHaveBiggerArea() {
        Rectangle smallRectangle = new Rectangle(1, 1);
        Rectangle bigRectangle = new Rectangle(2, 2);
        assertTrue(smallRectangle.findBester(bigRectangle));
    }

    @Test
    public void smallRectangleShouldNotBester() {
        Rectangle smallRectangle = new Rectangle(1, 1);
        Rectangle bigRectangle = new Rectangle(2, 2);
        assertThat(bigRectangle.findBester(smallRectangle),is(false));

    }

    @Test
    public void equalRectanglesShouldNotBester() {
        Rectangle rectangle1 = new Rectangle(1, 1);
        Rectangle rectangle2 = new Rectangle(1, 1);
        assertThat(rectangle2.findBester(rectangle1),is(false));
    }

}
