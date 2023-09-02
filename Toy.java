public class Toy {
    private int id;
    private String name;
    private int count;
    private int luck;

    Toy(int id, String name, int count, int luck){
        this.id = id;
        this.name = name;
        this.count = count;
        this.luck = luck;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setLuck(int luck){
        this.luck = luck;
    }
    public int getLuck(){
        return luck;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", count = " + count + ", luck = " + luck + ".";
    }


}
