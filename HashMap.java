public class HashMap {
    class Entry{
        String key;
        int value;

        Entry(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    class Bucket{
        Entry [] entries = new Entry[10];
        int size = 0;

        void add(Entry entry){
            entries[size++] = entry;
        }
        Integer get(String key){
            for(int i = 0; i < size;i++){
                if(entries[i].key.equals(key)){
                    return entries[i].value;
                }
            }
            return null;
        }

    }
    Bucket[] table = new Bucket[10];

    private int Hash(String key){
        return key.length() % table.length;
    }
    public void put(String key, int value){
        int index = Hash(key);
        if(table[index] == null){
            table[index]= new Bucket();
        }
        table[index].add(new Entry(key,value));
    }
    public int get(String key){
        int index = Hash(key);

        if(table[index] == null){
            return -1;
        }
        Integer value = table[index].get(key);
        return value == null ? -1: value;
    }

    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("Edu",10);
        map.put("Aeu",30);
        map.put("Ana",40);

        System.out.println(map.get("Edu"));
        System.out.println(map.get("Aeu"));
        System.out.println(map.get("Ana"));
    }
}
