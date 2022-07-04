public class Family {
    Person husband;
    Person wife;
    Boolean hasChilds;

    Family(Person person1, Person person2, Boolean hasChilds) {
        if (husband.gender == wife.gender)
            throw new IllegalArgumentException("gender can not be equal");
        else {
            if (person1.gender == true) { // person1 woman
                this.wife = person1;
                this.husband = person2;
            }
            else { // person1 man
                this.wife = person2;
                this.husband = person1;
            }
            this.hasChilds = true;
        }
    }
}
