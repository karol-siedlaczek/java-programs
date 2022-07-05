public class NotHuman extends Person {
    String type;

    @Override
    public void ShowSmth() {
        Integer x = 1;
    }

    NotHuman(String name, Boolean sex, String type) {
        super(name, sex);
        this.type = type;
    }
}
