package nqueens.solver;

public enum NQueensSolverType {
	Naive		(NaiveNQueensSolver.class),
	Recursive	(RecursiveNQueensSolver.class),
	BruteForce	(BruteForceNQueensSolver.class),
	Permutation	(PermutationNQueensSolver.class),
	ConstraintFiltering (FilterConstraintNQueensSolver.class),
	ConstraintLookahead (LookaheadConstraintNQueensSolver.class),
	ConstraintSimple (SimpleConstraintsNQueensSolver.class)
	;
	private final Class<? extends NQueensSolver>solver;
	private NQueensSolverType(Class<? extends NQueensSolver>solver) {
		this.solver=solver;
	}
	public Class<? extends NQueensSolver> solver(){return solver;}
}
