/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

/**
 *
 * @author alancerio18
 */
public class Dog {
      private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }
    
    @Override
    public String toString(){
        return (name + " " + rabiesId);
    }

  
    
    
}
