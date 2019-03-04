package pl.sda.blok1.familly;

public class Familly {
    private Person husband;
    private Person wife;
    private Person child;
    private String famillyName;

    public Familly(Person husband, Person wife, Person child, String famillyName) {
        this.husband = husband;
        this.wife = wife;
        this.child = child;
        this.famillyName = famillyName;
    }

    public Person getHusband() {

        return husband;
    }

    public Person getWife() {

        return wife;
    }

    public Person getChild() {

        return child;
    }

    public String getFamillyName() {

        return famillyName;
    }

    @Override
    public String toString() {
        return
                "famillyName = " + famillyName +
                " husband =" + husband + "/n" +
                ", wife =" + wife +
                ", child =" + child;

    }

//    public int sumOfAge (){
//        return int
//    }


}
