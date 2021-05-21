package ru.job4j.chess;

import com.sun.javafx.font.coretext.CTFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.BishopWhite;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleToMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C7);
        logic.clean();
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.E3));
        logic.clean();

    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCell()
            throws ImpossibleMoveException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.B2));
        logic.add(new BishopBlack(Cell.F6));
        logic.move(Cell.B2, Cell.G7);
        logic.clean();
    }
}