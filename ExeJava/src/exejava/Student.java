
package exejava;


public class Student {
    String name;
    int birthyear;
    String phonenumber;
    String major;
    int type;
    
    public Student() {
    }

    public Student(String name, int birthyear, String phonenumber, String major, int type) {
        this.name = name;
        this.birthyear = birthyear;
        this.phonenumber = phonenumber;
        this.major = major;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    public String inforString(){
        if(type==0)
            return name+" - "+phonenumber+" - "+"Đại học";
        else
            return name+" - "+phonenumber+" - "+"Cao đẳng";
    }
    
    public String fullInforString(){
        if(type==0)
            return name+" - "+birthyear+" - "+phonenumber+" - "+major+" - "+"Đại học";
        else
            return name+" - "+birthyear+" - "+phonenumber+" - "+major+" - "+"Cao đẳng";
    }
}
