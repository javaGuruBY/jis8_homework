package com.tutrit.springcorequickstart.bean;

public class Developer {
  private String name;
  private String skill;
  private int level;
  private boolean isCoffeeLike;

  public Developer(String name, String skill, int level, boolean isCoffeeLike) {
    this.name = name;
    this.skill = skill;
    this.level = level;
    this.isCoffeeLike = isCoffeeLike;
  }

  public Developer() {
  }

  public Developer(String name) {
    this.name = name;
  }

  public Developer(int level) {
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public boolean isCoffeeLike() {
    return isCoffeeLike;
  }

  public void setCoffeeLike(boolean coffeeLike) {
    isCoffeeLike = coffeeLike;
  }

  @Override
  public String toString() {
    return "Developer{" +
        "name='" + name + '\'' +
        ", skill='" + skill + '\'' +
        ", level=" + level +
        ", isCoffeConsumer=" + isCoffeeLike +
        '}';
  }
}
