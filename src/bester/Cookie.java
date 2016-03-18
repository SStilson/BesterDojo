package bester;

public class Cookie {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    public boolean findBestCookie(Cookie cookie) {
        if(cookie.numberOfChocolateChips > this.numberOfChocolateChips) {
            return true;
        } else {
            return false;
        }
    }
}
