/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL_HR;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class department {

    private int department_id;
    private String department_name;
    private ArrayList<Employee> listEmployees = new ArrayList<Employee>();

    public department(int department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public void readEmployees() {

    }

    public department() {
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public ArrayList<Employee> getListEmployees() {
        return listEmployees;
    }

    public void setListEmployees(ArrayList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }

}
