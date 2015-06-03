package SeaFightTest;

/**
 * Created by Гена on 01.06.2015.
 */
public class Ship {

    public static enum Type{
        POINT(4, 1), SMALL(3, 2), MEDIUM(2, 3), LARGE(1, 4);

        private int count;
        private int cellsUsed;

        Type(int iCount, int iCellsUsed){
            count = iCount;
            cellsUsed = iCellsUsed;
        }

        public int getCount() {
            return count;
        }

        public int getCellsUsed() {
            return cellsUsed;
        }

    }

    public Type type; // переменная типа Type

    /* Конструктор по созданию корабля*/
    Ship(Type type){
        setType(type);
    }

    public void setType(Type tType){
        type = tType;
    }

    public Ship.Type getType(){
        return type;
    }
}
