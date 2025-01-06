package az.edu.turing.dependencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custId;
    private int custName;
    private int courseName;
    @Autowired
    private Technologies techdetail;

    public Technologies getTechdetail() {
        return techdetail;
    }

    public void setTechdetail(Technologies techdetail) {
        this.techdetail = techdetail;
    }


    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getCustName() {
        return custName;
    }

    public void setCustName(int custName) {
        this.custName = custName;
    }

    public int getCourseName() {
        return courseName;
    }

    public void setCourseName(int courseName) {
        this.courseName = courseName;
    }

    public void display() {
        System.out.println("Customers Object Returned Succesfully");
        techdetail.tech();
    }
}
