package SeaFight;

import java.util.Scanner;

/**
 * Created by Гена on 30.05.2015.
 */

/**
    Тех. задание
    1 Прветствие игрока
    2 Запрашивание имени игрока
    3 Константы, которые в будущем могут приигодится (количество кораблей одного и другого типа)
    4 Класс для корообля с полями (тип коробля; корординаты коробля)
    5 Создать нужное количество кораблей и вывести сообщение о создании короблей
    6 Вывести сообщение о победителе (использовать функцию гкнерации случайных чисел)
*/

    public class Game {

        // fixme 3. Константы, которые в будущем могут приигодится (количество кораблей всеех типов)
            static int oneDeck;     //Однопалубный
            static int tooDeck;     //Двупалубный
            static int threeDeck;   //Трехпалубный
            static int fourDeck;    //Четырехпалубный
            //static int allShip;     //Все корабли
            static String[] player = new String[2];

        public static void main(String[] args) {
            String winner;
            player[0] = "Comp";

            // fixme 1 Приветствие игрока
            System.out.println("Добрый день игрок");

            // fixme 2 Запрашивание имени игрока
            System.out.println("Как тебя зовут?");
            Scanner scanner = new Scanner(System.in);           // Создаем объект Scanner
            player[1] = scanner.nextLine();                     // переменная имени игрока
            System.out.println("Очень приятно " + player[1]);

            //fixme 5.1 Создать нужное количество кораблей
            Ship plyerShip1 = new Ship(1);
            Ship plyerShip2 = new Ship(1);
            Ship plyerShip3 = new Ship(1);
            Ship plyerShip4 = new Ship(1);
            Ship plyerShip5 = new Ship(2);
            Ship plyerShip6 = new Ship(2);
            Ship plyerShip7 = new Ship(2);
            Ship plyerShip8 = new Ship(3);
            Ship plyerShip9 = new Ship(3);
            Ship plyerShip10 = new Ship(4);

            Ship compShip1 = new Ship(1);
            Ship compShip2 = new Ship(1);
            Ship compShip3 = new Ship(1);
            Ship compShip4 = new Ship(1);
            Ship compShip5 = new Ship(2);
            Ship compShip6 = new Ship(2);
            Ship compShip7 = new Ship(2);
            Ship compShip8 = new Ship(3);
            Ship compShip9 = new Ship(3);
            Ship compShip10 = new Ship(4);

            //fixme 5.2 Вывести сообщение о создании короблей
            //allShip = oneDeck + tooDeck + threeDeck + fourDeck;
            System.out.println("Всего кораблей: " + Ship.allShip);

            //fixme 6 Вывести сообщение о победителе
            int randomInt = (int)Math.random()*10; //Преобразование типов b=(int)a

            /*Условная операция
                x=n>1?0:1;
                Переменной x будет присвоено значение 0, если n>1 (выражение n>1 имеет значение true)
                                                  или 1, если n≤1 (выражение n>1 имеет значение false).*/
            winner = randomInt % 2 != 0 ? player[0] : player[1];


            //System.out.println("случайное " + random);
            //System.out.println("округленное случайное " + randomInt);
            System.out.println("Победил - " + winner);

        }
    }
