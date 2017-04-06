package interfacep;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Baseimpl<T> implements BaseDao<T>{

	@Override
	public int save(T t) {
		// TODO Auto-generated method stub
		System.out.println("save t");
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		Class t1 = (Class)type.getActualTypeArguments()[0];
		System.out.println(t1);
		return 0;
	}

	@Override
	public T update(T t) {
		// TODO Auto-generated method stub
		System.out.println("update t");
		
		return t;
	}

	

}
