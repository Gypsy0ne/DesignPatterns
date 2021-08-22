internal sealed class MazeFactory {
    object BombedMazeFactory : MazeFactory() {}
    object PuzzledMazeFactory : MazeFactory() {}
}