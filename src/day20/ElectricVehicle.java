package day20;

public class ElectricVehicle extends NoMotor {
    private String cellname;

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }
    public String work(){
        String str="这是一辆使用"+this.getCellname()+"牌电池的电动车。";
        return str;
    }
}
