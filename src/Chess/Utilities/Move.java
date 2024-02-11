package Chess.Utilities;

public class Move {
    private String startingPosition;
    private String endPosition;

    public Move(String startingPosition, String endPosition)
    {
        this.startingPosition = startingPosition;
        this.endPosition = endPosition;
    }

    public String getStartingPosition()
    {
        return startingPosition;
    }

    public void setStartingPosition(String startingPosition)
    {
        this.startingPosition = startingPosition;
    }

    public String getEndPosition()
    {
        return endPosition;
    }

    public void setEndPosition(String endPosition)
    {
        this.endPosition = endPosition;
    }
}
