package SeaFight;

/**
 * Created by Гена on 30.05.2015.
 */

// fixme 4 Класс для корообля

public class Ship {

    //fixme поля (тип коробля; корординаты коробля)
        int typeShip;   //тип корабля
        int coordX;     //координата по х
        int coordY;     //координата по y

        public static int allShip;



    // fixme методы

    // todo конструктор по созданию корабля
    Ship(int typeShip){
        this.typeShip = typeShip;
        allShip++;
        /*switch (typeShip){
            case 1: Game.oneDeck++;   break;
            case 2: Game.tooDeck++;   break;
            case 3: Game.threeDeck++; break;
            case 4: Game.fourDeck++;  break;
        }*/
    }


}
