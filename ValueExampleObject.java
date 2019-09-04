/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freemarker;

/**
 *
 * @author u640115
 */
public class ValueExampleObject {
    private String name;
    private String salary;
    private String married;

    public ValueExampleObject(String name, String salary, String married) {
        this.name = name;
        this.salary = salary;
        this.married=married;
    }
    
    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getMarried() {
        return married;
    }
    
}
