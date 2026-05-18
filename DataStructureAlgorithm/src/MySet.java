//
//public class MySet {
//
//    private int count;
//    private String element;
//
//
//
//    public boolean isEmpty(){
//        return count == 0;
//    }
//
//    public int getSizeOfSet(){
//        return count;
//    }
//
//    public boolean addSet(String value){
//        if(value == null || value.isEmpty()){
//            return false;
//        }
//            if(count == 0){
//                element = value;
//                count++;
//                    return true;
//            }
//
//                if(element.equals(value)){
//                    return false;
//                }
//    return false;
//    }
//
//
//    public boolean containsSet(String value) {
//        if(value == null || value.isEmpty()){
//            return false;
//        }
//        return element != null && element.equals(value);
//    }
//
//
//    public boolean removeSet(String value) {
//        if(value == null || value.isEmpty()){
//            return false;
//        }
//            element = null;
//            count = 0;
//            return true;
//    }
//
//    public void clearSet()  {
//        element = null;
//        count = 0;
//    }
//
//    public boolean addsAllSet(String firstValue, String secondValue) {
//        boolean first = addSet(firstValue);
//        boolean second = addSet(secondValue);
//
//        return first || second;
//    }
//
//    public boolean containsAllSet(String firstValue, String secondValue) {
//
//        return containsSet(firstValue)
//                && containsSet(secondValue);
//    }
//
//}
