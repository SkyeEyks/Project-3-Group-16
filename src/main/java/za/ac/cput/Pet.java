package za.ac.cput;
/**
 * This is a Pet application.
 *
 *@author BOKANG MOLAOA 218131097
 *
 */

public class Pet {
    private String no, name;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Pet {" +
                "no = '" + no + '\'' +
                ", name ='" + name + '\'' +
                '}';
    }
}
