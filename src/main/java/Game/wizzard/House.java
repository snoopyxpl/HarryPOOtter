package main.java.Game.wizzard;

import java.util.Objects;

public class House {

  private HouseName housename;

  public House(HouseName housename) {
    this.housename = housename;
  }

  public HouseName getName() {
    return housename;
  }

  public House() {}

  public HouseName getHousename() {
    return this.housename;
  }

  public void setHousename(HouseName housename) {
    this.housename = housename;
  }

  public House housename(HouseName housename) {
    setHousename(housename);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof House)) {
      return false;
    }
    House house = (House) o;
    return Objects.equals(housename, house.housename);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(housename);
  }

  @Override
  public String toString() {
    return "{" + " housename='" + getHousename() + "'" + "}";
  }
}
