package guitarshop.secondgeneration;

public enum Builder {

    FENDER, MARTIN, GIBSON, COLLINS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this) {
            case FENDER:
                return "Fender";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return "Gibson";
            case COLLINS:
                return "Collins";
            case OLSON:
                return "Olson";
            case RYAN:
                return "Ryan";
            case PRS:
                return "Prs";
            case ANY:
                return "Any";
            default:
                return "";
        }
    }
}
