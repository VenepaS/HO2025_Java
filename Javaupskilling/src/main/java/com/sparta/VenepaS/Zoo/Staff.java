package com.sparta.VenepaS.Zoo;

public abstract class Staff implements Speakable{

        protected String name;
        protected String joiningDate;
        protected String shift;

        public Staff(String name, String employmentDate, String shift) {
            this.name = name;
            this.joiningDate = employmentDate;
            this.shift = shift;
        }

        public String getName() { return name; }
        public String getEmploymentDate() { return joiningDate; }
        public String getShift() { return shift; }

        public int daysEmployed() {
            return (int) java.time.temporal.ChronoUnit.DAYS.between(
                    java.time.LocalDate.parse(joiningDate),
                    java.time.LocalDate.now()
            );
        }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

}


