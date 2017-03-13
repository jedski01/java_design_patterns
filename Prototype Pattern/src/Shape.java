/**
 * Shape
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public abstract class Shape  implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
