package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, 0),
    VENUS("Venus", 225, 0),
    EARTH("Earth", 365, 1),
    MARS("Mars", 687, 2),
    JUPITER("Jupiter", 4333, 53),
    SATURN("Saturn", 10759, 53),
    URANUS("Uranus", 30687, 27),
    NEPTUNE("Neptune", 60200, 14);

    private final String name;
    private final Integer yearLength;
    private final Integer numberOfMoons;

    Planets(String name, Integer yearLength, Integer numberOfMoons) {
        this.name = name;
        this.yearLength = yearLength;
        this.numberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public Integer getYearLength() {
        return yearLength;
    }

    public Integer getNumberOfMoons() {
        return numberOfMoons;
    }
}
