package quest06Lista01;

public interface Lista<E> {
	
		public abstract E set(int pos, E e);

		public abstract void addPrimeiro(E e);

		public abstract void addUltimo(E e);

		public abstract void addAntes(int pos, E e);

		public abstract void addApos(int pos, E e);

		public abstract void remove(E e);

		public abstract void remove(int pos);

		public abstract E first();

		public abstract E last();

		public abstract E anterior(int pos);

		public abstract E posterior(int pos);

}



