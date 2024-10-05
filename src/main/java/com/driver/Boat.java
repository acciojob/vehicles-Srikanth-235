package com.driver;

class Boat implements WaterVehicle {
        String name="toofan";
        int cap=1000;
    public String getVehicleName(){
            return name;
    }
    public int  getVehicleCapacity(){
        return cap;
    }
}
