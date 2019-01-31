package com.enrol

class Course {

String department
String courseTitle
String courseLeader
String courseCode 
Date startDate
Date endDate
String description
int numberOfStudents
Double tutionFees
String studyMode


    static constraints = {
department nullable: false, blank: false
courseTitle nullable: false, blank: false
courseLeader nullable: false, blank: false
courseCode nullable: false, blank: false
startDate nullable: false, blank: false
endDate nullabe: false, blank: false
description nullable: false, blank: false, maxSize: 5000, widget: 'textarea'
numberOfStudents nullable: false, blank: false, min: 20, max: 60
tutionFees nullable: false, blank: false, scale: 2
studyMode nullable: false, blank: false, size: 1..20
    }
}
