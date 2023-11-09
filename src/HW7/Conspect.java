package HW7;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class Conspect {
    public String LastName;
    public String FistName;
    public int NumberOfPages;
    public int GraduationYear;
    public String Color;
    public String SchoolName;

    public static void main(String[] args) {
       Conspect conspect = new Conspect();
       conspect.FistName = "Иван";
       conspect.Color = "red";
       conspect.LastName = "Иванов";
       conspect.GraduationYear = 2007;
       conspect.SchoolName = "UCLA";
        System.out.println(conspect.FistName);
        System.out.println(conspect.GraduationYear);
    }


}
