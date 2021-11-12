package pl.patro.Figures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Polygon implements Figure{

    List<Point> points = new ArrayList<>();

    public Polygon(Point... points) {
        this.points.addAll(Arrays.asList(points));
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Polygon){
            Polygon p = (Polygon) obj;
            if(p.points.size() == this.points.size()){
                for(int i=0;i<this.points.size();i++){
                    if(!this.points.get(i).equals(p.points.get(i))){
                        return false;
                    }
                }
                return true;
            } else return false;
        } else return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Polygon: [ \n");
        for(Point p: points){
            stringBuilder.append(p.toString());
        }
        stringBuilder.append(" ], \n");
        return stringBuilder.toString();
    }

    @Override
    public void move(double dx, double dy) {
        for(Point p:points){
            p.flip();
        }
    }

    @Override
    public void flip() {
        for(Point p:points){
            p.flip();
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
