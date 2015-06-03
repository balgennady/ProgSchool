package SeaFight2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Гена on 31.05.2015.
 */
public class Player {
    private String name;
    private List<Ship> playerShips = new ArrayList<Ship>();

    Player (String sName){
        setName(sName);
        createShip();
    }

    public String getName(){
        return name;
    }

    public  void  setName(String sName){
        name = sName;
    }

    private void createShip(){
        for (Ship.Type type : Ship.Type.values())
            for (int i = 0; i < type.getCount(); i++)
                playerShips.add(new Ship(type));
    }
}
