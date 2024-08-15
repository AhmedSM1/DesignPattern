package creational.prototype;

abstract class Shape implements Cloneable{

    // Step 1: Create an abstract class that implements the Cloneable interface
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract void draw();

    @Override
    protected Object clone()  {
        Object cloned = null;
        try {
            cloned =  super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

         return cloned;
    }

}
