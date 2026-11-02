
package com.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${id}")
    private int id;

    @Value("${name}")
    private String name;

    @Value("${mark}")
    private float mark;

    public char getAverage() {

        if(mark >= 90.0 && mark <= 100.0) {
            return 'A';
        }
        else {
            return 'C';
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name
                + ", mark=" + mark + "]";
    }
}
