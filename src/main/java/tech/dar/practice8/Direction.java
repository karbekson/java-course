package tech.dar.practice8;


public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public static Direction getOpposite(Direction d) {
        return switch (d) {
            case EAST -> WEST;
            case WEST -> EAST;
            case NORTH -> SOUTH;
            case SOUTH -> NORTH;
        };
    }
}
