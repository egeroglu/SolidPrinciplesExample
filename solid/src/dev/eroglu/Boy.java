package dev.eroglu;

public class Boy implements Children{
    public int schoolTution;
    public int age;

    public Boy(int schoolTution, int age) {
        this.schoolTution = schoolTution;
        this.age = age;
    }
    public void setSchoolTution(int schoolTution) {
        this.schoolTution = schoolTution;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int askForMoney() {
        return schoolTution + (age*10);
    }
}
