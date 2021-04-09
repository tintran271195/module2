package com.tintran;

import com.tintran.model.Employee;
import com.tintran.model.EmployeePartTime;
import com.tintran.model.FullTimeEmployee;
import com.tintran.util.Config;

public class Test {
    public static void main(String[] args) {
        Employee boss = new FullTimeEmployee("Tin", 20 , Config.BOSS);
        Employee staff = new FullTimeEmployee("Necki", 10, Config.STAFF);
        Employee partTime = new EmployeePartTime("Po", 50);

        boss.displayInformation();
        staff.displayInformation();
        partTime.displayInformation();
    }
}
