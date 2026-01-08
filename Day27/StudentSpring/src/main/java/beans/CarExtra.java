package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarExtra {
    private EngineExtra engine;

    @Autowired
    public CarExtra(EngineExtra engine){
        this.engine = engine;
        this.engine.enigneStart();
    }

    public void carStart(){
        System.out.println("Car starting !!!");
    }

}
