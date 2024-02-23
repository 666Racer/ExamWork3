package org.example.Models;

public class Counter implements AutoCloseable {
    private static Integer count = 0;
    private Integer instanceCount;
    private boolean closed = false;

    //Adding animal
    public void add(String value_1, String value_2, String value_3){
        if(value_1.isEmpty() || value_2.isEmpty() || value_3.isEmpty() ||this.closed){
            throw new IllegalArgumentException();
        }
        else{
            count++;
            this.instanceCount = count;
        }

    }

    //Getter

    public Integer getInstanceCount() {
        return instanceCount;
    }

    @Override
    public void close(){
        closed = true;
    }
}

