package org.csystem.app.parser.studentinfo;

import org.csystem.app.datetime.DateUtil;

public class StudentInfoParser {
    public StudentInfo studentInfo;

    public static String getBirthDate(String str)
    {
        String [] birthDateInfo = str.split("[/]");
        int day = Integer.parseInt(birthDateInfo[0]);
        int month = Integer.parseInt(birthDateInfo[1]);
        int year = Integer.parseInt(birthDateInfo[2]);

        return DateUtil.getDateTR(day, month, year);
    }

    public StudentInfoParser(String str)
    {
        studentInfo = parse(str);
    }

    public static StudentInfo parse(String str)
    {
        /*
            <isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
	        Oğuz Karan:10/09/1976:Matematik:45:78
	        Kürşat Sorkullu:27/01/1986:Fizik:90:100
         */

        String [] studentInfoStr = str.split("[:]+");

        //...

        StudentInfo studentInfo = new StudentInfo();

        studentInfo.setName(studentInfoStr[0]);
        studentInfo.setBirthDate(getBirthDate(studentInfoStr[1]));
        studentInfo.setLectureName(studentInfoStr[2]);
        studentInfo.setMidtermGrade(Integer.parseInt(studentInfoStr[3]));
        studentInfo.setFinalGrade(Integer.parseInt(studentInfoStr[4]));

        return studentInfo;
    }

    //...
}
