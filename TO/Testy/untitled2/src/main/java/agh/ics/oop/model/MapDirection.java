//package agh.ics.oop.model;
//
//public enum MapDirection {
//    NORTH,
//    SOUTH,
//    WEST,
//    EAST;
//
//    public String toString(MapDirection d) {
//        switch (d) {
//            case EAST:
//                return "Wschód";
//            case WEST:
//                return "Zachód";
//            case NORTH:
//                return "Północ";
//            case SOUTH:
//                return "Południe";
//            default:
//                return "";
//        }
//    }
//
//    public static MapDirection next(MapDirection d) {
//        switch (d) {
//            case EAST:
//                return SOUTH;
//            case SOUTH:
//                return WEST;
//            case WEST:
//                return NORTH;
//            case NORTH:
//                return EAST;
//            default:
//                return null;
//        }
//    }
//
//    public static MapDirection previous(MapDirection d) {
//        switch (d) {
//            case EAST:
//                return NORTH;
//            case NORTH:
//                return WEST;
//            case WEST:
//                return SOUTH;
//            case SOUTH:
//                return EAST;
//            default:
//                return null;
//        }
//    }
//
//    public static Vector2d toUnitVector(MapDirection d) {
//        switch (d) {
//            case EAST:
//                return new Vector2d(1, 0);
//            case WEST:
//                return new Vector2d(-1, 0);
//            case NORTH:
//                return new Vector2d(0, 1);
//            case SOUTH:
//                return new Vector2d(0, -1);
//            default:
//                return null;
//        }
//    }
//}

package agh.ics.oop.model;

public enum MapDirection {
    NORTH,
    SOUTH,
    WEST,
    EAST;

    public String toString(){
        return switch (this){
            case EAST -> "Wschód";
            case WEST -> "Zachód";
            case NORTH -> "Północ";
            case SOUTH -> "Południe";
        };
    }

    public static MapDirection next(MapDirection d){
        return switch (d) {
            case EAST -> SOUTH;
            case SOUTH -> WEST;
            case WEST -> NORTH;
            case NORTH -> EAST;
        };
    }
    public static MapDirection previous(MapDirection d){
        return switch (d) {
            case EAST -> NORTH;
            case NORTH -> WEST;
            case WEST -> SOUTH;
            case SOUTH -> EAST;
        };
    }
    public static Vector2d toUnitVector(MapDirection d){
        return switch (d){
            case EAST -> new Vector2d(1, 0);
            case WEST -> new Vector2d(-1, 0);
            case NORTH -> new Vector2d(0, 1);
            case SOUTH -> new Vector2d(0, -1);
        };
    }
}