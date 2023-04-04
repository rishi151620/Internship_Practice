import java.util.HashMap;
import java.util.Map;
class HashMapdemo{
  public static void main(String args[]){
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(101,"anitha");
    map.put(102,"savitha");
    map.put(103,"geeta");
    map.putIfAbsent(104,"jeevitha");
    map.putIfAbsent(104,"jeevitha");
    System.out.println(map);
    Integer key=104;
    for(Map.Entry m:map.entrySet()){
      if(m.getKey()==key)
        System.out.println(m.getValue());
    }
  }
}