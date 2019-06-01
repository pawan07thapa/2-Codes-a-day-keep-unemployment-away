
import java.util.Arrays;
public class MyArrayList {
	 
    private Object[] myStore;
    private int actSize = 0;
     
    public MyArrayList(){
        myStore = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
       pubic void add(Object obj){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }
     
    public Object remove(int index){
        if(index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return actSize;
    }
     
    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
     
    public static void main(String a[]){
        MyArrayList mal = new MyArrayList();
        mal.add(3);
        mal.add(1);
        mal.add(4);
        mal.add(23);
        mal.add(new Integer(14));
        for(Integer i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
}