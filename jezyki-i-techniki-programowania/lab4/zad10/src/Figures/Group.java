package pl.patro.Figures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Group implements Figure {

    private final List<Figure> figureList = new ArrayList<>();

    public Group(Figure... figures) {
        figureList.addAll(Arrays.asList(figures));
    }

    @Override
    public int hashCode() {
        return Objects.hash(figureList);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Group){
            Group g = (Group) obj;
            if(g.figureList.size() == this.figureList.size()){
                for(Figure fl: figureList){
                    boolean foundEqual = false;
                    for(Figure gfl: g.figureList ){
                        if (!foundEqual && gfl.equals(fl)) {
                            foundEqual = true;
                        }
                    }
                    if(!foundEqual){
                        return false;
                    }
                }
                return true;
            } else return false;
        } else return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Group: [ \n");
        for(Figure f: figureList){
            stringBuilder.append(f.toString());
        }
        stringBuilder.append(" ], \n");
        return stringBuilder.toString();

    }

    @Override
    public void move(double dx, double dy) {
        for(Figure f: figureList){
            f.move(dx,dy);
        }
    }

    @Override
    public void flip() {
        for(Figure f: figureList){
            f.flip();
        }
    }
}
