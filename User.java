import java.util.Date;
import java.util.List;

public class User {
    private Date birthdate;
    private double size;
    private List<Photo> photos;
    private Address address;

    public Date getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public Address getAddress() {
        return address;
    }

}
