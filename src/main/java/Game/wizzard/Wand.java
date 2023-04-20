package main.java.Game.wizzard;

import java.util.Objects;

public class Wand {

  private Wood wood;
  private Core core;
  private double lenght;

  public Wand(Wood wood, Core core, double lenght) {
    this.wood = wood;
    this.core = core;
    this.lenght = lenght;
  }

  public Wood getWood() {
    return this.wood;
  }

  public void setWood(Wood wood) {
    this.wood = wood;
  }

  public Core getCore() {
    return this.core;
  }

  public void setCore(Core core) {
    this.core = core;
  }

  public double getLenght() {
    return this.lenght;
  }

  public void setLenght(double lenght) {
    this.lenght = lenght;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " wood='" +
      getWood() +
      "'" +
      ", core='" +
      getCore() +
      "'" +
      ", lenght='" +
      getLenght() +
      "'" +
      "}"
    );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Wand)) {
      return false;
    }
    Wand wand = (Wand) o;
    return (
      Objects.equals(wood, wand.wood) &&
      Objects.equals(core, wand.core) &&
      lenght == wand.lenght
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(wood, core, lenght);
  }
}
