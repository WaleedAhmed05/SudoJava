package src.AssesmentExams;

public class main {

    public static void main(String args[]){


        CodeSignal2 sc= new CodeSignal2();


        String[] queryType = {"insert", "insert", "addToValue", "addToKey", "get"};
        int[][] query={{1, 2}, {2, 3}, {2}, {1}, {3}};

//        String[] queryType = {"insert", "addToValue", "get", "insert", "addToKey", "addToValue", "get"};
//        int[][] query={{1, 2}, {2}, {1}, {2, 3}, {1}, {-1}, {3}};

        System.out.println(sc.solution(queryType,query));



//        CodeSignal sc= new CodeSignal();
//
//        System.out.println(sc.solution(" "));
    }
}
