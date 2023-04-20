package main.java.Character.wizzard;

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
}
