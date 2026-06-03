public class HashMap {
    class Entry{
        String key;
        int value;

        Entry(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    Entry[] table = new Entry[10];

    private int Hash(String key){
        return key.length() % table.length;
    }
    public void put(String key, int value){
        int index = Hash(key);

        table[index] = new Entry(key,value);
    }
    public int get(String key){
        int index = Hash(key);

        if(table[index] != null && table[index].key.equals(key)){
            return table[index].value;
        }
        return -1;
    }

    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("Gustavo",10);

        System.out.println(map.get("Gustavo"));
    }
}
