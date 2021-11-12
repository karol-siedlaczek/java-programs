package lab6;
import java.util.ArrayList;  
import java.util.List;

public class Group implements Figure{​​​​
    private List<Figure> figures = new ArrayList<Figure>();
    public Group(Figure...args) {​​​​
        for(int i = 0; i < args.length; i++) {​​​​
            figures.add(args[i]);
        }​​​​
    }​​​​
    public Group(Group G) {​​​​
        this.figures = G.getGroup();
    }​​​​
    public List<Figure> getGroup() {​​​​
        return figures;
    }​​​​
    public void move(double dx, double dy) {​​​​
        for(int i = 0; i < figures.size(); i++) {​​​​
            figures.get(i).move(dx, dy);
        }​​​​
    }​​​​
    public void flip() {​​​​
        for(int i = 0; i < figures.size(); i++) {​​​​
            figures.get(i).flip();
        }​​​​
    }​​​​
    public boolean equals(Object o) {​​​​
        if(o.getClass() != this.getClass())
            return false;
        Group G = (Group) o;
        if(this.figures.size() != G.getGroup().size())
            return false;
        boolean a = false;
        for(int i = 0; i < this.figures.size(); i++) {​​​​
            for(int j = 0; j < this.figures.size(); j++) {​​​​
                if(this.figures.get(i).equals(G.getGroup().get(j))) {​​​​
                    a = true;
                    break;
                }​​​​
            }​​​​
            if(!a)
                return false;
            a = false;
            for(int j = 0; j < this.figures.size(); j++) {​​​​
                if(G.getGroup().get(i).equals(this.figures.get(j))) {​​​​
                    a = true;
                    break;
                }​​​​
            }​​​​
            if(!a)
                return false;
            a = false;
        }​​​​
        return true;
    }​​​​
    public String toString() {​​​​
        String Group = "";
        for(int i = 0; i < figures.size(); i++)
            Group += figures.get(i).toString() + "; ";
        return Group;
    }​​​​
}​​​​