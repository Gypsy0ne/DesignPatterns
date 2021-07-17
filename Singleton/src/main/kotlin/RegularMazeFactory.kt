import model.Door
import model.Maze
import model.Room

internal sealed class MazeFactory {
    object BombedMazeFactory : MazeFactory {}
    object PuzzledMazeFactory : MazeFactory {}
}