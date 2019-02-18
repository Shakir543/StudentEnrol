package com.enrol

class BootStrap {

    def init = { servletContext ->

def Lcaprio = new
Lecturer(
fullName: 'Leonardo Di Caprio',
post: 'lecturer',
subject: 'databases',
lecturerEmail: 'leo123@hotmail.com',
office: 'Cantor',
bio: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def Ldawson = new
Lecturer(
fullName: 'Lynne Dawson',
post: 'lecturer',
subject: 'Project Planning',
lecturerEmail: 'lynne123@hotmail.com',
office: 'Cantor',
bio: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def Lcinderey = new
Lecturer(
fullName: 'Lynne Cinderey',
post: 'lecturer',
subject: 'Service Support',
lecturerEmail: 'lcin123@hotmail.com',
office: 'Owen',
bio: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def computing = new
Course(
department: 'computing',
courseCode: 'CS123',
courseTitle: 'BSc Hon Computing',
courseLeader: Lcaprio,
startDate: new Date('09/09/2019'),
endDate: new Date ('07/07/2023'),
numberOfStudents:55,
studyMode: 'Fulltime',
tutionFees: 9000.60,
description: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def engineering = new
Course(
department: 'Mechanical Engineering',
courseCode: 'ME123',
courseTitle: 'BSc Hon Mechanical Engineering',
courseLeader: Ldawson,
startDate: new Date('15/09/2019'),
endDate: new Date ('07/03/2024'),
numberOfStudents:35,
studyMode: 'Fulltime',
tutionFees: 9250.60,
description: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def history = new
Course(
department: 'Archeology',
courseCode: 'AE123',
courseTitle: 'BSc Hon Archeology',
courseLeader: Lcinderey,
startDate: new Date('12/09/2019'),
endDate: new Date ('21/05/2024'),
numberOfStudents:45,
studyMode: 'Fulltime',
tutionFees: 9850.60,
description: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def Sshabbir = new
Student(
studentName: 'Shakir Shabbir',
studentID: 'b7021334',
dob: new Date('20/07/1998'),
isFundingAvailable: 'True',
studentEmail: 'shakir456@outlook.com',
studentUsername: 'Shakir543',
studentPassword: 'tester123',
course:computing).save()



def Zislam = new
Student(
studentName: 'Zain Islam',
studentID: 'b7021534',
dob: new Date('05/03/1999'),
isFundingAvailable: 'True',
studentEmail: 'zislam456@outlook.com',
studentUsername: 'zain123',
studentPassword: 'testing123',
course:computing).save()




def Tferguson = new
Student(
studentName: 'Tony Ferguson',
studentID: 'b7021534',
dob: new Date('05/06/1990'),
isFundingAvailable: 'True',
studentEmail: 'Tferguson12@outlook.com',
studentUsername: 'TF123',
studentPassword: 'test598',
course:engineering).save()


def Mholloway = new
Student(
studentName: 'Max Holloway',
studentID: 'b7431534',
dob: new Date('02/06/1993'),
isFundingAvailable: 'False',
studentEmail: 'Holloway12@outlook.com',
studentUsername: 'Max123',
studentPassword: 'test518',
course:history).save()





def SysArchs = new
Module(
module_title: 'SystemArchitectures',
module_code: 'SA123',
credits: '99',
lecturer: 'Leonardo',
description: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def DA = new
Module(
module_title: 'Database Admin and Data Sources',
module_code: 'DA123',
credits: '32',
lecturer: 'LynneD',
description: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def PPSS = new
Module(
module_title: 'Project planning and Service Support',
module_code: 'SA123',
credits: '75',
lecturer: 'LynneC',
description: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

Lcaprio.addToModules(SysArchs)
Ldawson.addToModules(DA)
Lcinderey.addToModules(PPSS)

history.addToLecturers(Lcaprio)
computing.addToLecturers(Ldawson)
engineering.addToLecturers(Lcinderey)

computing.addToStudents(Zislam)
computing.addToStudents(Sshabbir)
engineering.addToStudents(Tferguson)
history.addToStudents(Mholloway)

SysArchs.addToCourse(computing)
DA.addToCourse(computing)
PPSS.addToCourse(engineering)

SysArchs.addToStudents(Zislam)
SysArchs.addToStudents(Mholloway)
DA.addToStudents(Sshabbir)
SysArchs.addToStudents(Sshabbir)
PPSS.addToStudents(Sshabbir)
PPSS.addToStudents(Tferguson)





    
}
    def destroy = {
    }
}
