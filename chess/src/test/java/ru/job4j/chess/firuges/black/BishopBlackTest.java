package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import org.junit.Assert;

public class BishopBlackTest  {

   @Test
   public void whenSamePosition() {
      BishopBlack bishopBlack = new BishopBlack(Cell.A1);
      bishopBlack.position();
      Assert.assertEquals(bishopBlack.position(), Cell.A1);
   }

   @Test
   public void whenCopy() {
      BishopBlack bishopBlack = new BishopBlack(Cell.B1);
      bishopBlack.copy(Cell.H7);
      Assert.assertEquals(bishopBlack.position(), Cell.H7);
   }

   @Test
   public void wayTest() {
      BishopBlack bishopBlack = new BishopBlack(Cell.C1);
      bishopBlack.way(Cell.G5);
      Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
      Assert.assertArrayEquals(expected, bishopBlack.way(Cell.G5));
   }

}