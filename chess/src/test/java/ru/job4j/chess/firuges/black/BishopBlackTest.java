package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import org.junit.Assert;

public class BishopBlackTest  {

   @Test
   public void positionTest() {
      BishopBlack bishopBlack = new BishopBlack(Cell.A1);
      Assert.assertEquals(bishopBlack.position(), Cell.A1);
   }

   @Test
   public void copyTest() {
      BishopBlack bishopBlack = new BishopBlack(Cell.B1);
      Assert.assertEquals(bishopBlack.copy(Cell.H7).position(), Cell.H7);
   }

   @Test
   public void wayTest() throws ImpossibleMoveException {
      BishopBlack bishopBlack = new BishopBlack(Cell.C1);
      Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
      Assert.assertArrayEquals(bishopBlack.way(Cell.G5), expected);
   }

   @Test
   public void freeTest() {
      BishopBlack bishopBlack = new BishopBlack(Cell.A1);
      Assert.assertNotEquals(bishopBlack.copy(Cell.E3).position(), Cell.E4);
   }

}