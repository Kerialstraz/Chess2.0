package Chess.Pieces;

import Chess.Utilities.Move;

import java.util.ArrayList;

public abstract class Piece {
    private String color;
    private String currentField;
    private ArrayList<Move> possibleMoves;
    private ArrayList<Move> pastMoves;

    public Piece(String color, String currentField)
    {
        this.color = color;
        this.currentField = currentField;
    }

    public abstract void generatePossibleMoves();
    public abstract void move();

    public void addPastMove(Move moveDone)
    {
        pastMoves.add(moveDone);
    }

    //---------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getCurrentField()
    {
        return currentField;
    }

    public void setCurrentField(String currentField)
    {
        this.currentField = currentField;
    }

    public ArrayList<Move> getPossibleMoves()
    {
        return possibleMoves;
    }

    public void setPossibleMoves(ArrayList<Move> possibleMoves)
    {
        this.possibleMoves = possibleMoves;
    }

    public ArrayList<Move> getPastMoves()
    {
        return pastMoves;
    }

    public void setPastMoves(ArrayList<Move> pastMoves)
    {
        this.pastMoves = pastMoves;
    }
}
