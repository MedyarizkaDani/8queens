package nqueens.solver;

public enum SolverType {
	Naive		(NaiveSolver.class),
	Recursive	(RecursiveSolver.class),
	ConstraintFiltering (ConstraintSatisfactionFilterSolver.class),
	ConstraintLookahead (ConstraintLookaheadSolver.class),
	ConstraintSimple (ConstraintSimpleSolver.class)
	;
	private final Class<? extends Solver>solver;
	private SolverType(Class<? extends Solver>solver) {
		this.solver=solver;
	}
	public Class<? extends Solver> solver(){return solver;}
}
