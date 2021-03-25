package Main.Homework15;

import java.util.*;

public class MyEntry <K, V>{

    private Map<K, V> mapWithGeneric = new HashMap<>();
    private K something;

    public MyEntry(Map<K, V> mapWithGeneric, K something) {
        this.mapWithGeneric = mapWithGeneric;
        this.something = something;
    }

    public MyEntry(Map<K, V> mapWithGeneric) {
        this.mapWithGeneric = mapWithGeneric;
    }

    public Map<K, V> getMapWithGeneric() {
        return mapWithGeneric;
    }

    public void setMapWithGeneric(Map<K, V> mapWithGeneric) {
        this.mapWithGeneric = mapWithGeneric;
    }

    public K getSomething() {
        return something;
    }

    public void setSomething(K something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "mapWithGeneric=" + mapWithGeneric +
                ", something=" + something +
                '}';
    }

    public void addMapEl(K key, V value){
        mapWithGeneric.put(key, value);
    }

    public void delElWithKey(K key){
        mapWithGeneric.remove(key);
    }

    public void delElWithValue(K key, V value){
        mapWithGeneric.remove(key, value);
    }

    public void showKeysSet(){
        Set<Set<K>> keysSet = new HashSet<>();
        keysSet.add(mapWithGeneric.keySet());
        System.out.println(keysSet.toString());
    }

    public void showValuesList(){
        List<Collection<V>> valueList = new ArrayList<>();
        valueList.add(mapWithGeneric.values());
        System.out.println(valueList.toString());
    }
    public void showMap(){
        System.out.println(mapWithGeneric.toString());
    }
}
