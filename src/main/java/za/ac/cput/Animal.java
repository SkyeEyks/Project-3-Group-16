package za.ac.cput;

public class Animal {
    private String age,gender, race;

    public String getRace(){
        return race;
    }
    public void setRace(String race){this.race = race;}
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){this.gender = gender; }

    public String getAge(){
        return age;
    }
    public void setAge(String age){this.age=age;}

    @java.lang.Override
    public java.lang.String toString() {
        return "Hlumelo{" +
                "age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
