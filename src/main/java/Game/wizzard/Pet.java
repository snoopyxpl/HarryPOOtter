package main.java.Game.wizzard;

import java.util.Objects;

public class Pet {

  private TypePet typepet;
  private String petname;

  public Pet(TypePet typepet, String petname) {
    this.typepet = typepet;
    this.petname = petname;
  }

  public TypePet getTypepet() {
    return this.typepet;
  }

  public void setTypepet(TypePet typepet) {
    this.typepet = typepet;
  }

  public String getPetname() {
    return this.petname;
  }

  public void setPetname(String petname) {
    this.petname = petname;
  }

  public Pet() {}

  public Pet typepet(TypePet typepet) {
    setTypepet(typepet);
    return this;
  }

  public Pet petname(String petname) {
    setPetname(petname);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Pet)) {
      return false;
    }
    Pet pet = (Pet) o;
    return (
      Objects.equals(typepet, pet.typepet) &&
      Objects.equals(petname, pet.petname)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(typepet, petname);
  }

  @Override
  public String toString() {
    return (
      "{" +
      " typepet='" +
      getTypepet() +
      "'" +
      ", petname='" +
      getPetname() +
      "'" +
      "}"
    );
  }
}
