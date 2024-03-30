import java.util.ArrayList;

public class MyMap <key, val>{
    private ArrayList<key> keys = new ArrayList<>();
    private ArrayList<val> values = new ArrayList<>();

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put (key k, val v){
        if (keys.contains(k)){
            values.set(keys.indexOf(k), v);
        } else {
            keys.add(k);
            values.add(v);
        }
    }

    public val get (key k){
        if (!keys.contains(k)){
            return null;
        } else {
            return values.get(keys.indexOf(k));
        }
    }

    public val remove(key k) {
        int index = keys.indexOf(k);
        if (index == -1) {
            return null;
        } else {
            keys.remove(index);
            return values.remove(index);
        }
    }


}