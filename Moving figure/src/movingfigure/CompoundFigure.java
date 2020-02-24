package movingfigure;
 
import java.awt.Graphics;
import java.util.ArrayList;
 
public class CompoundFigure extends Figure {
 
    private ArrayList<Figure> figures;
 
    public CompoundFigure() {
        super(0, 0);
        figures = new ArrayList<Figure>();
    }
    
 
    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : figures) {
            figure.draw(graphics);
        }
    }
 
    @Override
    public void move(int x, int y) {
        for (Figure figure : figures) {
            figure.move(x, y);
        }
    }
 
    public void add(Figure f) {
        figures.add(f);
    }
 
}