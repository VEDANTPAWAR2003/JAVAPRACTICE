/*AbstrCT keyword
 * IT MEANS THAT WE are not using that method but the class which extends the abstract class should have that method
 * class having abstract keyword shuld be abstract class
 * wecan give semicolon after declaring abstract method
 * note :: we cannot crate object of abstract class
 * we have to create object of concrete class not of abstract class
 */

abstract class Car{

    public abstract void drive();

    public void playMusic(){
        System.out.println("Play Music!");
    }
}
class WagonR extends Car{                  //concrete class
    public void drive(){
        System.out.println("Gade bhagao!");
    }
}
public class Abstractkeyword25 {
    
    public static void main(String[] args) {
        
    Car obj = new WagonR();   //creating refrence
    obj.drive();
    obj.playMusic();

    }
}
