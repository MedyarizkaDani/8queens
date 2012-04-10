package nqueens;

public abstract class BoardChangeAdapter implements BoardChangeListener {
	@Override public void blocked() {}
	@Override public void unblocked() {}
	@Override public void onChanged() {}
}
