package net.absoft;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QuadraticEquationSolverTest {
    @Test
    public void solveQuadraticEquationWithPositiveDiscriminant() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        QuadraticEquationSolution solution = solver.solveQuadraticEquation(1,-4,-5);

        assertTrue(solution.getX1() == 5 || solution.getX1() == -1, "Unexpected x1");
        assertTrue(solution.getX2() == -1 || solution.getX2() == 5, "Unexpected x2");
    }

    @Test
    public void solveQuadraticEquationWithNegativeDiscriminant() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        QuadraticEquationSolution actualSolution = solver.solveQuadraticEquation(3, -4, 2);

        assertNull(actualSolution, "Solution should be null");
    }

    @Test
    public void solveQuadraticEquationWithDiscriminantEqualToZero() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        QuadraticEquationSolution solution = solver.solveQuadraticEquation(1,2,1);

        assertEquals(solution.getX1(), -1, "Unexpected x1");
        assertEquals(solution.getX2(), -1, "Unexpected x2");
    }

    @Test
    public void quadraticEquationShouldNotHaveZeroAsFirstArgument() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        assertThrows(IllegalArgumentException.class, () -> solver.solveQuadraticEquation(0, 2,1));

    }

}

