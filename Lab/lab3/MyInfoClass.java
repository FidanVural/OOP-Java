package lab3;

import java.util.List;

public class MyInfoClass {

	public static <T> void getObjectInfo(T obj){
		System.out.println(obj.toString());
	}
	
	public static <E> void getListInfo(List<E> list){
		
		for(E itr : list ) {
			System.out.println(itr);
		}
	}
}
