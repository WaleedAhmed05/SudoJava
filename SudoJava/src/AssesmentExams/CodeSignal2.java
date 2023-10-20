package src.AssesmentExams;

import java.util.HashMap;

public class CodeSignal2 {

    long solution(String[] queryType, int[][] query) {

        HashMap<Integer,Integer> map= new HashMap<>();
        int total_sum=0;
        int addallkeys=0;
        int addallvalues=0;
        for(int i=0; i<queryType.length; i++){
            if(queryType[i].equals("insert")){
                map=insert(map,query[i][0],query[i][1]);
                
            }
            else if(queryType[i].equals("addToKey")){

                //map=addtokey(map,query[i][0]);
                addallkeys+=query[i][0];
                
            }
            else if(queryType[i].equals("addToValue")){

                //map=addtovalue(map,query[i][0]);
                addallvalues+=query[i][0];
                
            }
            else {
                //get query.
                map=addtokey(map,addallkeys);
                map=addtovalue(map,addallvalues);
                total_sum+=get(map,query[i][0]);
            }
        }

        return total_sum;
    }

    HashMap<Integer, Integer> insert(HashMap obj, int key, int value){

        obj.put(key,value);
        return obj;
    }

    int get(HashMap<Integer,Integer> obj, int key){
        return obj.get(key);
    }

    HashMap<Integer, Integer> addtokey(HashMap<Integer,Integer> obj, int key){

        HashMap<Integer,Integer> addedMap= new HashMap<>();
        for(Integer x: obj.keySet()){
            int value=obj.get(x);
            addedMap.put(x+key,value);
        }
        return addedMap;
    }

    HashMap<Integer, Integer> addtovalue(HashMap<Integer,Integer> obj, int value){


        for(Integer x: obj.keySet()){
            obj.put(x,obj.get(x)+value);
        }
        return obj;
    }


}
