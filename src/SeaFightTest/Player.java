package SeaFightTest;

import java.util.ArrayList;

/**
 * Created by Гена on 01.06.2015.
 */
public class Player {

    private String name;

    private ArrayList<Ship> playerShips = new ArrayList<Ship>(); //ArrayList<String> list = new ArrayList<String>();

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

    /**Метод для создания корабля*/
    private void createShip(){
        for (Ship.Type type : Ship.Type.values())       //цикл "for-each"
            for (int i = 0; i < type.getCount(); i++)   //
                playerShips.add(new Ship(type));        //метод add(value) - добавление элементов в List

    }
    //System.out.println(playerShips.get(i));

}
