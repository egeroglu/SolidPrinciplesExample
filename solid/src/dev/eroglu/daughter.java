package dev.eroglu;

public class daughter implements Children{
    public int schoolTution;

    public void setSchoolTution(int schoolTution) {
        this.schoolTution = schoolTution;
    }

    public daughter(int schoolTution) {
        this.schoolTution = schoolTution;
    }

    @Override
    public int askForMoney() {
        return schoolTution;
    }
}
