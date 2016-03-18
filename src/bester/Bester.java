package bester;

import java.util.List;

public class Bester {
    public Rectangle findBestRectangle(List<Rectangle> rectangleList) {

        Rectangle bestRectangle = rectangleList.get(0);

        for(Rectangle rectangle: rectangleList){
            if (bestRectangle.findBester(rectangle)){
                bestRectangle = rectangle;
            }
        }

        return bestRectangle;
    }
}
