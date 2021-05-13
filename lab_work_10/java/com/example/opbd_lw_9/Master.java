package com.example.opbd_lw_9;

public class Master {
    private final int master_personnel_number;
    private int id_branch;
    private int sum_amount;
    private String qualification;
    private String master_number_passport;
    private String full_name;
    private int exp;
    private String insurance_number;
    private String master_telephone;

    public Master(int master_personnel_number, int id_branch, int sum_amount, String qualification, String master_number_passport, String full_name, int exp, String insurance_number, String master_telephone) {
        this.master_personnel_number = master_personnel_number;
        this.id_branch = id_branch;
        this.sum_amount = sum_amount;
        this.qualification = qualification;
        this.master_number_passport = master_number_passport;
        this.full_name = full_name;
        this.exp = exp;
        this.insurance_number = insurance_number;
        this.master_telephone = master_telephone;
    }

    @Override
    public String toString() {
        return "(" +
                id_branch + "," +
                sum_amount + "," +
                "\'" + qualification + "\'," +
                "\'" + master_number_passport + "\'," +
                "\'" + full_name + "\'," +
                exp + "," +
                "\'" + insurance_number + "\'," +
                "\'" + master_telephone + "\')";
    }

    public int getMaster_personnel_number() {
        return master_personnel_number;
    }

    public int getId_branch() {
        return id_branch;
    }

    public void setId_branch(int id_branch) {
        this.id_branch = id_branch;
    }

    public int getSum_amount() {
        return sum_amount;
    }

    public void setSum_amount(int sum_amount) {
        this.sum_amount = sum_amount;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getMaster_number_passport() {
        return master_number_passport;
    }

    public void setMaster_number_passport(String master_number_passport) {
        this.master_number_passport = master_number_passport;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getInsurance_number() {
        return insurance_number;
    }

    public void setInsurance_number(String insurance_number) {
        this.insurance_number = insurance_number;
    }

    public String getMaster_telephone() {
        return master_telephone;
    }

    public void setMaster_telephone(String master_telephone) {
        this.master_telephone = master_telephone;
    }
}
