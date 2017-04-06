package interfacep;

public interface BaseDao<T>{
	
	public int save(T t);
	public T update(T t);
}
