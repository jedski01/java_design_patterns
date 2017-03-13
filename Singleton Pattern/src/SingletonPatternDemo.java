/**
 * SingletonPatternDemo
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject is not visible
        //SingleObject object = new SingleObject();

        //get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();

    }
}
