package quest06Lista01;

public class ListaImpl<E> implements Lista<E> {

	private E[] lista;
	private static final int TAM_LISTA = 5;
	public E elRemovido;

	@SuppressWarnings("unchecked")
	public ListaImpl() {
		lista = (E[]) new Integer[TAM_LISTA];
	}

	@Override
	public E set(int pos, E e) {

		if (pos == 0) {
			addPrimeiro(e);
		} else if (pos == TAM_LISTA) {
			addUltimo(e);
		} else {
			for (int i = TAM_LISTA - 1; i >= pos; i--) {
				this.lista[pos + 1] = this.lista[pos];
			}

			this.lista[pos] = e;
		}

		return lista[pos];
	}

	@Override
	public void addPrimeiro(E e) {
		if (this.lista[0] == null) {
			this.lista[0] = e;
		} else {
			for (int i = TAM_LISTA - 1; i > 0; i--) {
				this.lista[i] = this.lista[i - 1];
			}
			this.lista[0] = e;
		}
	}

	@Override
	public void addUltimo(E e) {
		if (lista[TAM_LISTA - 1] == null) {
			lista[TAM_LISTA - 1] = e;
		} else {
			for (int i = 0; i < TAM_LISTA - 1; i++) {
				lista[i] = lista[i + 1];
			}
			lista[TAM_LISTA - 1] = e;
		}

	}

	@Override
	public void addAntes(int pos, E e) {
		if (pos == 0) {
			addPrimeiro(e);
		} else if (pos == TAM_LISTA - 1) {
			addUltimo(e);
		} else {
			for (int i = TAM_LISTA - 1; i > pos; i--) {
				lista[i] = lista[i - 1];
			}
			lista[pos] = e;
		}
	}

	@Override
	public void addApos(int pos, E e) {
		if (pos == 0) {
			addPrimeiro(e);
		} else if (pos == TAM_LISTA - 1) {
			addUltimo(e);
		} else {
			for (int i = 0; i < pos; i++) {
				lista[i] = lista[i + 1];
			}
			lista[pos] = e;
		}
	}

	@Override
	public void remove(E e) {
		for (int i = 0; i < TAM_LISTA; i++) {
			if (lista[i] == e || lista[i].equals(e)) {
				elRemovido = e;
				lista[i] = null;
				break;
			}
		}
	}

	@Override
	public void remove(int pos) {
		elRemovido = lista[pos];
		lista[pos] = null;
	}

	@Override
	public E first() {
		if (lista[0] != null) {
			return lista[0];
		}

		return null;
	}

	@Override
	public E last() {
		if (lista[TAM_LISTA - 1] != null) {
			return lista[TAM_LISTA - 1];
		}

		return null;
	}

	@Override
	public E anterior(int pos) {
		if (lista[pos - 1] != null) {
			return lista[pos - 1];
		}

		return null;
	}

	@Override
	public E posterior(int pos) {
		if (lista[pos + 1] != null) {
			return lista[pos + 1];
		}

		return null;
	}

	public void imprimeLista() {
		for (int i = 0; i < TAM_LISTA; i++) {
			System.out.print("Elemento[" + i + "]: " + lista[i] + " ");
		}
		System.out.println();
	}

}

